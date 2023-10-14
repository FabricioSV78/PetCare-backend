package pe.edu.upao.petcare.web.Mascota.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.petcare.web.Mascota.models.Mascota;
import pe.edu.upao.petcare.web.Mascota.services.MascotaMapper;

@Repository
public interface RepositorioMascota extends JpaRepository<Mascota, Long> {
    Mascota findByNombreMascota(String nombreMascota);

}

