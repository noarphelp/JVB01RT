package com.vuelos.App.controllers;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.dtos.VueloDTO;
import com.vuelos.App.responses.VueloResponse;
import com.vuelos.App.services.IVueloService;
import com.vuelos.App.utils.FechaUtil;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.ObjectError;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//Clase donde se recibe las peticiones por http del usuario a través de los controladores, y se da respuesta según la petición.
@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private IVueloService service;

    public VueloController(IVueloService service) {
        this.service = service;
    }

    //Método para devolver un vuelo por su id, controlamos el fallo del id incorrecto.
    @GetMapping("/{id}")
    public ResponseEntity<?> listaVuelos(@PathVariable Integer id) {
        Optional<VueloDTO> vueloId = service.vueloPorId(id);
        if (vueloId.isPresent())
            return ResponseEntity.ok().body(vueloId);
        else {
            VueloResponse response = new VueloResponse(
                    HttpStatus.NOT_FOUND.getReasonPhrase() + ", no econtrado id:" + id,
                    HttpStatus.NOT_FOUND.value(),
                    LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(response);
        }
    }

    //Método para poder devolver una lista entera de vuelos o filtrar vuelos por parámetros.
    @GetMapping
    public ResponseEntity<?> vuelosPorParametros(
            @RequestParam(required = false) String empresa,
            @RequestParam(required = false) String lugarSalida,
            @RequestParam(required = false) LocalDate fechaSalida) {
        List<DatosVueloDTO> vuelosParametros = service.vuelosPorParametros(empresa, lugarSalida, fechaSalida);

        if (!vuelosParametros.isEmpty())
            return ResponseEntity.ok().body(vuelosParametros);
        else {
            VueloResponse response = new VueloResponse(
                    HttpStatus.NOT_FOUND.getReasonPhrase() + ", vuelo no encontrado o datos erróneos",
                    HttpStatus.NOT_FOUND.value(),
                    LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(response);
        }
    }

    //Método para poder crear un vuelo nuevo según parámetros enviados por usuario. Controlando que el usuario ponga todos los parámetros y que no ponga la fecha llegada anterior a la de salida.
    @PostMapping
    public ResponseEntity<?> crearVuelo(@Valid @RequestBody VueloDTO vueloDTO, BindingResult result) {

        if (result.hasErrors() || !FechaUtil.comprobarFechas(vueloDTO)) {
            VueloResponse response = new VueloResponse(
                    "Datos inválidos: " +"La fecha de llegada no puede ser anterior a la de salida, "+ result.getAllErrors().stream()
                            .map(ObjectError::getDefaultMessage)
                            .collect(Collectors.joining(", ")),
                    HttpStatus.BAD_REQUEST.value(),
                    LocalDateTime.now()
            );
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

        } else {
            service.crear(vueloDTO);
            return ResponseEntity.ok().body(vueloDTO);
        }
    }

    //Método para poder eliminar un vuelo por su id.
    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrarVuelo(@PathVariable Integer id) {
        boolean eliminado = service.borrarVuelo(id);
        if (eliminado) {
            return ResponseEntity.ok().body(
                    Map.of("mensaje", "Vuelo con id " + id + " eliminado correctamente")
            );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    Map.of("error", "No se encontró el vuelo con id " + id)
            );
        }
    }
}
