package pe.edu.upao.petcare.web.Mascota.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upao.petcare.web.Cliente.models.Cliente;
import pe.edu.upao.petcare.web.HistorialMedico.models.HistorialMedico;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String nombre;
    int edad;

    @ManyToOne
    Cliente cliente;

    @ManyToOne
    HistorialMedico historialMedico;

}
