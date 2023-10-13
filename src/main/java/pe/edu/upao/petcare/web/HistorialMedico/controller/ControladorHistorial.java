package pe.edu.upao.petcare.web.HistorialMedico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.petcare.web.HistorialMedico.models.HistorialMedico;
import pe.edu.upao.petcare.web.HistorialMedico.services.DatosHistorial;
import pe.edu.upao.petcare.web.HistorialMedico.services.HistorialServicio;

@RestController
public class ControladorHistorial {

    @Autowired
    private HistorialServicio historialServicio;

    @PostMapping("/crearHistorial")
    public ResponseEntity<String> crearHistorialMedico(@RequestBody DatosHistorial historial) {
        // Convierte los datos del DTO en un objeto HistorialMedicoMascota
        HistorialMedico historialMedico = new HistorialMedico();

        historialMedico.setIdMascota(historial.getIdMascota());
        historialMedico.setDiagnostico(historial.getDiagnostico());
        historialMedico.setAlergias(historial.getAlergias());

        // Agrega otros campos de historial médico si es necesario

        // Llama al servicio para crear el historial médico
        HistorialMedico historialCreado = historialServicio.crearHistorialMedico(historialMedico);

        if (historialCreado != null) {
            return new ResponseEntity<>("Historial médico creado", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("No se pudo crear el historial médico", HttpStatus.BAD_REQUEST);
        }
    }
}
