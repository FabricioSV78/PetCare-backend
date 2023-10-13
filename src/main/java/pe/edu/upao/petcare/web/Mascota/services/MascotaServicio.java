package pe.edu.upao.petcare.web.Mascota.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.petcare.web.Cliente.repositories.RepositorioCliente;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;
import pe.edu.upao.petcare.web.Mascota.repositories.RepositorioMascota;

@Service
public class MascotaServicio {

    @Autowired
    private RepositorioMascota mascotaRepository;

    public Mascota crearPerfilMascota(Mascota mascota) {

        if (mascota.getNombre() == null || mascota.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la mascota no puede ser nulo o vacío");
        }
        if (mascota.getEdad() < 0) {
            throw new IllegalArgumentException("La edad de la mascota no puede ser negativa");
        }

        // Luego, guardamos la mascota en la base de datos
        return mascotaRepository.save(mascota);
    }

    public Mascota modificarPerfilMascota(Long id, Mascota mascota) {

        Mascota mascotaExistente = mascotaRepository.findById(id).orElse(null);
        if (mascotaExistente != null) {
            // Actualiza los campos relevantes
            mascotaExistente.setNombre(mascota.getNombre());
            mascotaExistente.setEdad(mascota.getEdad());
            return mascotaRepository.save(mascotaExistente);
        } else {
            return null; // Mascota no encontrada
        }
    }

}

