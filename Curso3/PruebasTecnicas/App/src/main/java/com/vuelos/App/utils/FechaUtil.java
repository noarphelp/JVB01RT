package com.vuelos.App.utils;

import com.vuelos.App.dtos.VueloDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Clase donde creamos métodos utilitarios para la ayuda de gestion de fechas
public class FechaUtil {

    //Método para gestionar que la salida de un vuelo siempre sea antes o igual a la llegada.
    public static Boolean comprobarFechas(VueloDTO vuelo){

        if (vuelo.getFechaSalida().isBefore(vuelo.getFechaLlegada()) || vuelo.getFechaSalida().isEqual(vuelo.getFechaLlegada()))
            return true ;
        else
            return false;
    }
}
