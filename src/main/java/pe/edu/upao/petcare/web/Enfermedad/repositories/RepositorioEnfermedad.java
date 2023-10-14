package pe.edu.upao.petcare.web.Enfermedad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Enfermedad.models.Enfermedad;
import pe.edu.upao.petcare.web.Vacuna.models.Vacuna;

public interface RepositorioEnfermedad extends JpaRepository<Enfermedad, Long> {
    Enfermedad findByNombreEnfermedad(String nombreEnfermedad);
}
