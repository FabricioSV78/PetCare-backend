package pe.edu.upao.petcare.web.Evento.services;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@JsonSerialize
public class EventoMapper {
    private String tipoEvento;
    private LocalDate fecha;
}
