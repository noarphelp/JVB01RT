package com.vuelos.App.services;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.dtos.VueloDTO;
import com.vuelos.App.models.Vuelo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Clase donde implementamos la lógica a los métodos de la interfaz, para su uso posteriormente por los controladores.
@Service
public class VueloService implements IVueloService {

    List<Vuelo> listaVuelos;

    public VueloService() {
        this.listaVuelos = new ArrayList<>();

        listaVuelos.add(new Vuelo(1, "IB 6872", "Iberia", "Madrid", "Londres", LocalDate.of(2025, 01, 10), LocalDate.of(2025, 01, 15)));
        listaVuelos.add(new Vuelo(2, "IB 6884", "Iberia", "Barcelona", "Paris", LocalDate.of(2025, 01, 20), LocalDate.of(2025, 01, 30)));
        listaVuelos.add(new Vuelo(3, "RY 7532", "Ryanair", "Madrid", "Sevilla", LocalDate.of(2025, 02, 05), LocalDate.of(2025, 02, 11)));
        listaVuelos.add(new Vuelo(4, "RY 7633", "Ryanair", "Sevilla", "Madrid", LocalDate.of(2025, 02, 11), LocalDate.of(2025, 01, 15)));
        listaVuelos.add(new Vuelo(5, "Vu 1272", "Vueling", "Barcelona", "Milan", LocalDate.of(2025, 03, 10), LocalDate.of(2025, 03, 19)));
        listaVuelos.add(new Vuelo(6, "VU 2251", "Vueling", "Santiago", "Tenerife", LocalDate.of(2025, 03, 22), LocalDate.of(2025, 03, 27)));
        listaVuelos.add(new Vuelo(7, "AE 4242", "Air Europa", "Madrid", "Amsterdam", LocalDate.of(2025, 04, 03), LocalDate.of(2025, 04, 10)));
        listaVuelos.add(new Vuelo(8, "AE 4141", "Air Europa", "Valencia", "Ibiza", LocalDate.of(2025, 04, 03), LocalDate.of(2025, 04, 15)));
        listaVuelos.add(new Vuelo(9, "AE 4242", "Air Europa", "Santiago", "Malaga", LocalDate.of(2025, 05, 13), LocalDate.of(2025, 05, 18)));
        listaVuelos.add(new Vuelo(10, "EJ 8882", "EasyJet", "Bilbao", "Paris", LocalDate.of(2025, 05, 05), LocalDate.of(2025, 05, 17)));
    }

    //En este método desarrollamos la lógica para poder mandar una lista de todos los vuelos, pero solo con los datos que queremos mostrar al usuario.
    @Override
    public List<DatosVueloDTO> todosLosVuelos() {
        return listaVuelos.stream().map(this::convertirAV).toList();
    }

    @Override
    public Optional<VueloDTO> vueloPorId(int id) {
        return listaVuelos.stream()
                .filter(v -> v.getId().equals(id))
                .map(this::convertirADTO)
                .findFirst();
    }

    @Override
    public VueloDTO crear(VueloDTO vDTO) {
        return null;
    }

    @Override
    public VueloDTO actualizar(int id, VueloDTO vDTO) {
        return null;
    }

    @Override
    public VueloDTO modifcarDato(int id, VueloDTO vDTO) {
        return null;
    }


    @Override
    public void borrarVuelo(int id) {

    }


    //Métodos de conversion de objeto a DTO y viceversa.
    @Override
    public VueloDTO convertirADTO(Vuelo v) {
        return new VueloDTO(v.getId(), v.getNombreVuelo(), v.getEmpresa(), v.getLugarLlegada(), v.getLugarSalida(), v.getFechaSalida(), v.getFechaLlegada());
    }

    @Override
    public Vuelo convertirAVuelo(VueloDTO v) {
        return new Vuelo(v.getId(), v.getNombreVuelo(), v.getEmpresa(), v.getLugarLlegada(), v.getLugarSalida(), v.getFechaSalida(), v.getFechaLlegada());
    }

    @Override
    public DatosVueloDTO convertirAV(Vuelo v) {
        return new DatosVueloDTO(v.getNombreVuelo(), v.getEmpresa(), v.getLugarSalida(), v.getFechaSalida());
    }
}
