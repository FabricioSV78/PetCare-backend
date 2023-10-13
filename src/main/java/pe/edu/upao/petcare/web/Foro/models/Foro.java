package pe.edu.upao.petcare.web.Foro.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upao.petcare.web.Cliente.models.Cliente;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    Cliente cliente;

}
