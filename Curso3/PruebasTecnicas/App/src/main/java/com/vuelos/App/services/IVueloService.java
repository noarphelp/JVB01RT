package com.vuelos.App.services;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.dtos.VueloDTO;
import com.vuelos.App.models.Vuelo;

import java.util.List;
import java.util.Optional;

//Interfaz donde declaramos los métodos a usar en service.

public interface IVueloService {

    List<DatosVueloDTO> todosLosVuelos();  // método para listar todos los vuelos, pero solo mostrando los datos que nos interesa.

    Optional<VueloDTO> vueloPorId(int id); //método para buscar vuelo por su id.

    VueloDTO crear(VueloDTO vDTO); //método para crear un nuevo vuelo.

    VueloDTO actualizar(int id, VueloDTO vDTO); //método para actualizar un vuelo por su id.

    VueloDTO modifcarDato(int id, VueloDTO vDTO); //método para modificar datos de un vuelo por su id.

    void borrarVuelo(int id); //método para borrar un vuelo por su id.


    //Métodos de conversion de objeto a DTO y viceversa.
    VueloDTO convertirADTO(Vuelo v);

    Vuelo convertirAVuelo(VueloDTO v);

    DatosVueloDTO convertirAV(Vuelo v);
}
