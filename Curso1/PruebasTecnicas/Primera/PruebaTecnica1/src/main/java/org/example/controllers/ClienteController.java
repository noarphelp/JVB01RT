package org.example.controllers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.entities.Cliente;
import org.example.persistences.ClienteJpa;

import java.util.List;

       //Clase donde se encuentran los métodos controladores de los clientes, los cuales son usados por los métodos de la clase util para la lógica de la app.

public class ClienteController {

    ClienteJpa clienteJpa = new ClienteJpa();

    public List<Cliente> findAll(){
        return clienteJpa.findAll();
    }

    public void create(Cliente cliente){
        clienteJpa.create(cliente);
    }

    public Cliente findById(Long id){
      return clienteJpa.findById(id);
    }

    public void update(Cliente actuClient){
        clienteJpa.update(actuClient);
    }

    public void delete(Cliente deltClient){
        clienteJpa.delete(deltClient);
    }

    public void findByCiudad(String ciudad){
        List<Cliente>clientes = findAll();
        boolean cenal = false;
        for (Cliente clien : clientes){
            if (clien.getCiudad().equalsIgnoreCase(ciudad)) {
                cenal = true;
                System.out.println(clien);
            }
        }
        if (cenal == false)
            System.out.println("Ningún usuario con la ciudad introducida");
    }
}
