package pe.edu.upao.petcare.web.Autenticacion.services;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Credenciales {
    private String nombre;
    private String contra;
    private String correo;
}
