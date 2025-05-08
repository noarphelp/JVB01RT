package org.example;


import org.example.controllers.ReservaController;
import org.example.excepcion.ReservaInvalidaException;

public class Main {
    public static void main(String[] args) throws  ReservaInvalidaException {

    Menu menu = new Menu();

    menu.menu();

    }
}