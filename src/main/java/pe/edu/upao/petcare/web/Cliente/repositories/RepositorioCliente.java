package pe.edu.upao.petcare.web.Cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.petcare.web.Cliente.models.Cliente;


@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
    Cliente findByCorreo(String correo);
}



