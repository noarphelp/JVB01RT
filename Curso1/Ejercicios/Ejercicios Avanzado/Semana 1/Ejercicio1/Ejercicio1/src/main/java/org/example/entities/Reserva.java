package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 20)
    private String nombre;
    @Column(nullable = false, length = 20)
    private String destino;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false, length = 2)
    private int numAsientos;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, LocalDate fecha, int numAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.numAsientos = numAsientos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Reserva: " +
                "id:" + id +
                ", nombre: " + nombre  +
                ", destino: " + destino  +
                ", fecha: " + fecha +
                ", numAsientos: " + numAsientos +
        " .";
    }
}
