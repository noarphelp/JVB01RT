package entities;

import java.time.LocalDate;
import java.util.UUID;

public class Vuelo {

    private UUID id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;

    public Vuelo() {
    }

    public Vuelo(UUID id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada,
                 LocalDate fechaInicio, LocalDate fechaFinal) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public UUID getId() {
        return id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return " \uD83D\uDEEB Datos del vuelo: \uD83D\uDEEB \n" +
                "-Nombre del vuelo: " + nombreVuelo + '\n' +
                "-Empresa: " + empresa + '\n' +
                "-Lugar de salida: " + lugarSalida + '\n' +
                "-Lugar de llegada: " + lugarLlegada + '\n' +
                "-Fecha de inicio: " + fechaInicio + '\n' +
                "-Fecha final: " + fechaFinal+"\n";
    }
}
