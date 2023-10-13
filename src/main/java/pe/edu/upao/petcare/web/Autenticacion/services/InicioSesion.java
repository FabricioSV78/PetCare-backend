package pe.edu.upao.petcare.web.Autenticacion.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.petcare.web.Autenticacion.models.Usuario;
import pe.edu.upao.petcare.web.Autenticacion.repositories.RepositorioUsuario;

@Service
public class InicioSesion {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario iniciarSesion(String nombre, String contra){
        Usuario usuario = repositorioUsuario.findByNombre(nombre);

        if(usuario!=null && contraValida(contra, usuario.getContra())){
            return usuario;
        }else{
            return null;
        }
    }

    private boolean contraValida(String contraIngresada, String contraAlmacenada){
        return contraIngresada.equals(contraAlmacenada);
    }
}
