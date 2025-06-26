package com.vuelos.App.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
// Anotaciones de Lombok para contructores con y sin parametros, getters y setters y string.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vuelo {

    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;


}
