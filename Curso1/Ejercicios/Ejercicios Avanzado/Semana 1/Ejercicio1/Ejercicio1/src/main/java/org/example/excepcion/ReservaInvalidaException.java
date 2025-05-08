package org.example.excepcion;

public class ReservaInvalidaException extends Exception{
    public ReservaInvalidaException(String message) {
        super(message);
    }
}
