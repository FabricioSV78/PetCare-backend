package pe.edu.upao.petcare.web.Cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.petcare.web.Cliente.services.ClienteMapper;
import pe.edu.upao.petcare.web.Cliente.repositories.RepositorioCliente;

import java.util.List;

@RestController
public class ControladorCliente {

    @Autowired
    private RepositorioCliente repositorioCliente;

    @GetMapping("/cliente")
    List<ClienteMapper> list() {

        return repositorioCliente.findAll().stream().map(
                (it) -> new ClienteMapper((it.getId()), it.getNombre())).toList();
        // new ArrayList<>();
    }



}
