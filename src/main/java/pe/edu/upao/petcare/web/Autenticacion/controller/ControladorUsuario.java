package pe.edu.upao.petcare.web.Autenticacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.petcare.web.Autenticacion.models.Usuario;
import pe.edu.upao.petcare.web.Autenticacion.repositories.RepositorioUsuario;
import pe.edu.upao.petcare.web.Autenticacion.services.Credenciales;
import pe.edu.upao.petcare.web.Autenticacion.services.InicioSesion;
import pe.edu.upao.petcare.web.Autenticacion.services.Registrarse;

@RestController
public class ControladorUsuario {

    @Autowired
    private InicioSesion inicioSesion;

    @PostMapping
    public ResponseEntity<String> iniciarSesion(@RequestBody Credenciales credenciales){
        Usuario usuario = inicioSesion.iniciarSesion(credenciales.getNombre(), credenciales.getContra());

        if(usuario!=null) {
            return new ResponseEntity<>("Inicio de sesion exitoso", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Inicio de sesion fallido", HttpStatus.UNAUTHORIZED);
        }
    }

    @Autowired
    private Registrarse registrarse;

    @PostMapping("/registrar")
    public ResponseEntity<String> registrarUsuario(@RequestBody Credenciales credenciales) {
        // Llama al servicio de registro para crear el nuevo usuario utilizando los datos de RegistroDTO
        Usuario usuarioRegistrado = registrarse.registrarUsuario(credenciales);
        if (usuarioRegistrado != null) {
            // El registro es exitoso
            return new ResponseEntity<>("Registro exitoso", HttpStatus.OK);
        } else {
            // El registro falla
            return new ResponseEntity<>("Registro fallido", HttpStatus.BAD_REQUEST);
        }
    }



}
