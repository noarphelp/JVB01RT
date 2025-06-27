package com.vuelos.App.responses;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//Clase que sirve para poder devolver un mensaje al usuario en caso de algún fallo.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VueloResponse {

    private String mensaje;
    private int estadoCodigo;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")  // Esta anotación es para parsear la fecha por defecto a esta que escogimos, para que sea más claro de leer.
    private LocalDateTime fechaHora;
}
