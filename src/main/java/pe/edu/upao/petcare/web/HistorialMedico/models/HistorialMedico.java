package pe.edu.upao.petcare.web.HistorialMedico.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upao.petcare.web.Cliente.models.Cliente;

import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistorialMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long idMascota; // Relación con la mascota
    private Date fecha;
    private String diagnostico;
    private String alergias;



}
