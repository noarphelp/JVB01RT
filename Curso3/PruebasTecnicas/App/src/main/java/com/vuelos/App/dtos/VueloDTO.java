package com.vuelos.App.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

// Anotaciones de Lombok para contructores con y sin parametros, getters y setters y string.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VueloDTO {

    @JsonProperty("propId")
    //Anotacion para poder diferenciar el nombre de los atributos del objeto principal y el DTO.

    private Integer id;
    @JsonProperty("propNombreVuelo")
    @NotBlank
    private String nombreVuelo;
    @JsonProperty("propEmpresa")
    @NotBlank
    private String empresa;
    @JsonProperty("propLugarSalida")
    @NotBlank
    private String lugarSalida;
    @JsonProperty("propLugarLlegada")
    @NotBlank
    private String lugarLlegada;
    @JsonProperty("propFechaSalida")
    @NotNull
    private LocalDate fechaSalida;
    @JsonProperty("propFechaLlegada")
    @NotNull
    private LocalDate fechaLlegada;
}
