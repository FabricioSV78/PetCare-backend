package pe.edu.upao.petcare.web.Alergia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Alergia.models.Alergia;
import pe.edu.upao.petcare.web.Enfermedad.models.Enfermedad;

public interface RepositorioAlergia extends JpaRepository<Alergia, Long> {
    Alergia findByNombreAlergia(String nombreAlergia);
}
