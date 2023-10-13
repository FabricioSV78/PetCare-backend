package pe.edu.upao.petcare.web.Mascota.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;

public interface RepositorioMascota extends JpaRepository<Mascota, Long> {
}
