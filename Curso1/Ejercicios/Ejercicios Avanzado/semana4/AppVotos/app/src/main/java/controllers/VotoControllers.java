package controllers;

import entities.Opcion;
import entities.Votos;
import persistences.VotosJPA;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VotoControllers {

  private final   VotosJPA votosJPA = new VotosJPA();

    public List<Votos> findAll(){
        return votosJPA.findAll();
    }

    public void createVoto(Votos voto){

        votosJPA.create(voto);
    }

    public Map<Opcion, Long> obtenerTotales() {
        return findAll().stream()
                .collect(Collectors.groupingBy(Votos::getOpcion, Collectors.counting()));
    }

}
