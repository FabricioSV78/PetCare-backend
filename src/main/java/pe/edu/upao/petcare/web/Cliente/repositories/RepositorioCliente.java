package pe.edu.upao.petcare.web.Cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upao.petcare.web.Cliente.models.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
}
