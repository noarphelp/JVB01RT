package com.vuelos.App.controllers;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.responses.VueloResponse;
import com.vuelos.App.services.IVueloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

//Clase donde se recibe las peticiones por http del usuario a través de los controladores, y se da respuesta según la petición.
@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private IVueloService service;

    public VueloController(IVueloService service) {
        this.service = service;
    }

    //Método para devolver el listado entero de vuelos, si no se encuentra o est vacío manda un mensaje con detalles del fallo.
    @GetMapping("/listado")
    public ResponseEntity<?> listaVuelos() {

        if (!service.todosLosVuelos().isEmpty())
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.todosLosVuelos());
        else {
            VueloResponse response = new VueloResponse(
                    HttpStatus.NOT_FOUND.getReasonPhrase() + ", Listado no encontrado o vacío",
                    HttpStatus.NOT_FOUND.value(),
                    LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(response);
        }
    }

    //Método para devolver un vuelo por su id, controlamos el fallo del id incorrecto.
    @GetMapping("/{id}")
    public ResponseEntity<?> listaVuelos(@PathVariable Integer id) {
        if (service.vueloPorId(id).isPresent())
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.vueloPorId(id));
        else {
            VueloResponse response = new VueloResponse(
                    HttpStatus.NOT_FOUND.getReasonPhrase() + ", no econtrado id:" + id,
                    HttpStatus.NOT_FOUND.value(),
                    LocalDateTime.now());
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(response);
        }
    }
}
