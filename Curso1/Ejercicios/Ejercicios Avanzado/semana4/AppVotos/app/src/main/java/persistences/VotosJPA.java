package persistences;

import entities.Votos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class VotosJPA {

    public void create(Votos votos) {

        EntityManager en = ConfigJPA.getEntityManager();

        try {
            en.getTransaction().begin();
            en.persist(votos);
            en.getTransaction().commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {

            en.close();
        }
    }


    public List<Votos> findAll() {

        EntityManager en = ConfigJPA.getEntityManager();

        try {
            TypedQuery<Votos> query = en.createQuery("SELECT v FROM Votos v", Votos.class);

            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            en.close();
        }
    }
}
