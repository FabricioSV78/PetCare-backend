package pe.edu.upao.petcare.web.Evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Evento.models.Evento;

public interface RepositorioEvento extends JpaRepository<Evento, Long> {
}
