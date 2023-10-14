package pe.edu.upao.petcare.web.HistorialMedico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.HistorialMedico.models.HistorialMedico;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;

import java.util.List;


public interface RepositorioHistorial extends JpaRepository<HistorialMedico, Long> {

}
