package com.vuelos.App.controllers;

import com.vuelos.App.dtos.DatosVueloDTO;
import com.vuelos.App.services.IVueloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    private IVueloService service;

    public VueloController(IVueloService service) {
        this.service = service;
    }

    @GetMapping("/listado")
    public ResponseEntity<List<DatosVueloDTO>> listaVuelos(){

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.todosLosVuelos());
    }
}
