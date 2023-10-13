package pe.edu.upao.petcare.web.HistorialMedico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.petcare.web.HistorialMedico.models.HistorialMedico;
import pe.edu.upao.petcare.web.HistorialMedico.repositories.RepositorioHistorial;

import java.util.List;

@Service
public class HistorialServicio {
    @Autowired
    private RepositorioHistorial repositorioHistorial;

    public HistorialMedico crearHistorialMedico(HistorialMedico historialMedico) {
        // Realiza la lógica para validar y crear el historial médico
        if (historialMedico == null) {
            throw new IllegalArgumentException("El historial médico no puede ser nulo.");
        }

        // Puedes realizar más validaciones si es necesario, por ejemplo, verificar si la mascota asociada existe.

        // Lógica para crear el historial médico en la base de datos
        HistorialMedico historialCreado = repositorioHistorial.save(historialMedico);

        // Puedes realizar más lógica, como enviar notificaciones o registros de auditoría

        return historialCreado;
    }


    public List<HistorialMedico> obtenerHistorialMedicoPorMascota(Long id) {
        return repositorioHistorial.findByIdMascota(id);
    }
}
