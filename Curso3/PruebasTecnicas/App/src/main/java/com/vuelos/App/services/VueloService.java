package com.vuelos.App.services;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.dtos.VueloDTO;
import com.vuelos.App.models.Vuelo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Clase donde implementamos la lógica a los métodos de la interfaz, para su uso posteriormente por los controladores.
@Service
public class VueloService implements IVueloService {

    List<Vuelo> listaVuelos;

    public VueloService() {
        this.listaVuelos = new ArrayList<>();

        listaVuelos.add(new Vuelo(1, "IB 6872", "Iberia", "Madrid", "Londres", LocalDate.of(2025, 01, 13), LocalDate.of(2025, 01, 15)));
        listaVuelos.add(new Vuelo(2, "IB 6884", "Iberia", "Barcelona", "Paris", LocalDate.of(2025, 04, 20), LocalDate.of(2025, 04, 30)));
        listaVuelos.add(new Vuelo(3, "RY 7532", "Ryanair", "Madrid", "Sevilla", LocalDate.of(2025, 02, 05), LocalDate.of(2025, 02, 11)));
        listaVuelos.add(new Vuelo(4, "RY 7633", "Ryanair", "Sevilla", "Madrid", LocalDate.of(2025, 05, 05), LocalDate.of(2025, 05, 15)));
        listaVuelos.add(new Vuelo(5, "Vu 1272", "Vueling", "Barcelona", "Milan", LocalDate.of(2025, 03, 10), LocalDate.of(2025, 03, 19)));
        listaVuelos.add(new Vuelo(6, "VU 2251", "Vueling", "Santiago", "Tenerife", LocalDate.of(2025, 03, 22), LocalDate.of(2025, 03, 27)));
        listaVuelos.add(new Vuelo(7, "AE 4242", "Air Europa", "Madrid", "Amsterdam", LocalDate.of(2025, 04, 03), LocalDate.of(2025, 04, 10)));
        listaVuelos.add(new Vuelo(8, "AE 4141", "Air Europa", "Valencia", "Ibiza", LocalDate.of(2025, 04, 20), LocalDate.of(2025, 04, 25)));
        listaVuelos.add(new Vuelo(9, "AE 5632", "Air Europa", "Santiago", "Malaga", LocalDate.of(2025, 01, 10), LocalDate.of(2025, 01, 18)));
        listaVuelos.add(new Vuelo(10, "EJ 8882", "EasyJet", "Bilbao", "Paris", LocalDate.of(2025, 05, 05), LocalDate.of(2025, 05, 17)));
    }


    //En este método desarrollamos la lógica para poder mandar un vuelo buscado por su id.
    @Override
    public Optional<VueloDTO> vueloPorId(int id) {
        return listaVuelos.stream()
                .filter(v -> v.getId().equals(id))
                .map(this::convertirADTO)
                .findFirst();
    }

    //En este método podemos ver la lista de vuelos entera, o ver vuelos por distintos filtros de parámetros, Todos ordenados por orden de fechaSalida ascendente.
    @Override
    public List<DatosVueloDTO> vuelosPorParametros(String empresa, String lugarSalida, LocalDate fechaSalida) {

        return listaVuelos.stream()
                .map(this::convertirAV)
                .filter(v -> empresa == null || v.getEmpresa().toLowerCase().equals(empresa.toLowerCase()))
                .filter(vu -> lugarSalida == null || vu.getLugarSalida().toLowerCase().equals(lugarSalida.toLowerCase()))
                .filter(vue -> fechaSalida == null || vue.getFechaSalida().equals(fechaSalida))
                .sorted(Comparator.comparing(DatosVueloDTO::getFechaSalida))
                .collect(Collectors.toList());
    }

    //En este método implementamos la lógica para poder crear un nuevo vuelo.
    @Override
    public VueloDTO crear(VueloDTO vDTO) {
        vDTO.setId(listaVuelos.size() + 1);
        Vuelo vuelo = convertirAVuelo(vDTO);
        listaVuelos.add(vuelo);
        return vDTO;
    }

    @Override
    public VueloDTO actualizar(int id, VueloDTO vDTO) {
        return null;
    }

    @Override
    public VueloDTO modifcarDato(int id, VueloDTO vDTO) {
        return null;
    }

    //En este método implementamos la lógica para poder borrar un vuelo por su id.
    @Override
    public Boolean borrarVuelo(int id) {
        Optional<Vuelo> vuelo = listaVuelos.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst();

        if (vuelo.isPresent()) {
            listaVuelos.remove(vuelo.get());
            return true;
        } else {
            return false;
        }
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
