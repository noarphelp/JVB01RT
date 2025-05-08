package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Vuelos {

    private int id = 1;
    private String destino = "Londres";
    private int plazas = 12;

    public Vuelos() {
    }

    public Vuelos(String destino, int plazas) {
        this.destino = destino;
        this.plazas = plazas;
    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "id=" + id +
                ", destino='" + destino + '\'' +
                ", plazas=" + plazas +
                '}';
    }
}
