package org.example.persistences;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Cliente;

import java.util.List;

            //En esta clase vamos a configurar los métodos usados para realizar los CRUD.
public class ClienteJpa {

    public List<Cliente>findAll(){
        EntityManager em = ConfigJpa.getEntityManager();
        try {
            TypedQuery<Cliente> query = em.createQuery("SELECT p FROM Cliente p", Cliente.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    public void create(Cliente cliente){
        EntityManager em = ConfigJpa.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se a podido registrar cliente nuevo");
        } finally {
            em.close();
        }
    }

    public Cliente findById(Long id){
        EntityManager em = ConfigJpa.getEntityManager();
        try {
            return em.find(Cliente.class,id);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }

    }

    public void update(Cliente actuClient){
        EntityManager em = ConfigJpa.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(actuClient);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }

    public void delete(Cliente clienDelt){
        EntityManager em = ConfigJpa.getEntityManager();

        if (clienDelt != null){
            try {
                Cliente clienteGestionado = em.find(Cliente.class, clienDelt.getId());
                em.getTransaction().begin();
                em.remove(clienteGestionado);
                em.getTransaction().commit();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                em.close();
            }
        }else {
            System.out.println("El id introducido no se encuentra en la base de datos");
        }
    }
}
