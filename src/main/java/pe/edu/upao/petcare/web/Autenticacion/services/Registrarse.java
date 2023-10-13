package pe.edu.upao.petcare.web.Autenticacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.petcare.web.Autenticacion.models.Usuario;
import pe.edu.upao.petcare.web.Autenticacion.repositories.RepositorioUsuario;

@Service
public class Registrarse {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario registrarUsuario(Credenciales credenciales) {
        // Realiza la lógica de registro, como verificar si el nombre de usuario o correo electrónico ya existe
        // Luego, crea una nueva instancia de Usuario y asigna los datos desde RegistroDTO
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(credenciales.getNombre());
        nuevoUsuario.setContra(credenciales.getContra());
        nuevoUsuario.setCorreo(credenciales.getCorreo());

        // Guarda el nuevo usuario en el repositorio
        return repositorioUsuario.save(nuevoUsuario);
    }
}
