package pe.edu.upao.petcare.web.Cliente.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upao.petcare.web.Evento.models.Evento;
import pe.edu.upao.petcare.web.Foro.models.Foro;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String nombre;

    @OneToMany
    List<Mascota> ListaMascotas;

    @OneToMany
    List<Evento> ListaEventos;

    @OneToMany
    List<Foro> ListaForos;




}
