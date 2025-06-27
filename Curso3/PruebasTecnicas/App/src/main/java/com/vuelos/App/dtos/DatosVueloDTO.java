package com.vuelos.App.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Anotaciones de Lombok para contructres con y sin parámetros, getters y setters y string.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DatosVueloDTO {

    @JsonProperty("propNombreVuelo")  //Anotación para poder diferenciar el nombre de los atributos del objeto principal.
    private String nombreVuelo;
    @JsonProperty("propEmpresa")
    private String empresa;
    @JsonProperty("propLugarSalida")
    private String lugarSalida;
    @JsonProperty("propFechaSalida")
    private LocalDate fechaSalida;

}
