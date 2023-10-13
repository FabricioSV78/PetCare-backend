package pe.edu.upao.petcare.web.HistorialMedico.services;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DatosHistorial {

    private Long idMascota; // Relación con la mascota
    private String diagnostico;
    private String alergias;

}
