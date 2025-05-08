package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Reserva;

import java.util.List;

public class ReservaJPA {


    public void create(Reserva reserva){
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(reserva);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    public List<Reserva> findAll(){
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<Reserva> query = em.createQuery("SELECT p FROM Reserva p", Reserva.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }
}
