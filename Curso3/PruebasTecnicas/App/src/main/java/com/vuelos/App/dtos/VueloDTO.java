package com.vuelos.App.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
// Anotaciones de Lombok para contructores con y sin parametros, getters y setters y string.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VueloDTO {

    @JsonProperty("propId")  //Anotacion para poder diferenciar el nombre de los atributos del objeto principal y el DTO.
    private Integer id;
    @JsonProperty("propNombreVuelo")
    private String nombreVuelo;
    @JsonProperty("propEmpresa")
    private String empresa;
    @JsonProperty("propLugarSalida")
    private String lugarSalida;
    @JsonProperty("propLugarLlegada")
    private String lugarLlegada;
    @JsonProperty("propFechaSalida")
    private LocalDate fechaSalida;
    @JsonProperty("propFechaLlegada")
    private LocalDate fechaLlegada;
}
