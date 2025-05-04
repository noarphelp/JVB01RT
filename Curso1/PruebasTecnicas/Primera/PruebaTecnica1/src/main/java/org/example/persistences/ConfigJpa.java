package org.example.persistences;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConfigJpa {

    //Esta clase es la crea la conexión con la base de datos
    private static final EntityManagerFactory emf  = Persistence.createEntityManagerFactory("unidadDePersistencia");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();

    }

    public static void close(){
        emf.close();
    }
}
