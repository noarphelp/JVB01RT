package org.example.controllers;

import org.example.entities.Reserva;
import org.example.persistence.ReservaJPA;

import java.util.List;

public class ReservaController {

    ReservaJPA reservaJPA = new ReservaJPA();

    public List<Reserva> listar(){
        return reservaJPA.findAll();
    }

    public void createReserva(Reserva reserva){

        reservaJPA.create(reserva);
    }
}
