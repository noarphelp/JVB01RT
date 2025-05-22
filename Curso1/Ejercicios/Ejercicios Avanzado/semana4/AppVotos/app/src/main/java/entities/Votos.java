package entities;

import jakarta.persistence.*;

@Entity
public class Votos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Opcion opcion ;

    public Votos() {
    }

    public Votos(Opcion opcion) {
        this.opcion = opcion;
    }

    public Opcion getOpcion() {
        return opcion;
    }

    public void setOpcion(Opcion opcion) {
        this.opcion = opcion;
    }
}
