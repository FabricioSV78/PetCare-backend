package pe.edu.upao.petcare.web.Mascota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;
import pe.edu.upao.petcare.web.Mascota.services.MascotaServicio;

@RestController
public class ControladorMascota {
    @Autowired
    private MascotaServicio mascotaServicio;

    @PostMapping("/crearPerfil")
    public ResponseEntity<String> crearPerfilMascota(@RequestBody Mascota mascota) {
        Mascota mascotaCreada = mascotaServicio.crearPerfilMascota(mascota);
        if (mascotaCreada != null) {
            return new ResponseEntity<>("Perfil de mascota creado", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("No se pudo crear el perfil de mascota", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/modificarPerfil/{id}")
    public ResponseEntity<String> modificarPerfilMascota(
            @PathVariable Long id,
            @RequestBody Mascota mascota) {
        Mascota mascotaModificada = mascotaServicio.modificarPerfilMascota(id, mascota);
        if (mascotaModificada != null) {
            return new ResponseEntity<>("Perfil de mascota modificado", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No se pudo modificar el perfil de mascota", HttpStatus.BAD_REQUEST);
        }
    }

}
