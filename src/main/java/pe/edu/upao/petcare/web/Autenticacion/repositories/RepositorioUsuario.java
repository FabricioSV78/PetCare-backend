package pe.edu.upao.petcare.web.Autenticacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Autenticacion.models.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    Usuario findByNombre(String nombre);



}
