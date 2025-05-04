package org.example.entities;

import jakarta.persistence.*;



import java.time.LocalDate;

        //Esta clase es el modelo de cliente, donde están sus atributos,
        // y donde le decimos a JPA los datos a usar para crear la tabla y las columnas.
        //Estoy usando anotaciones de hibernete para decirle que parámetros acepta cada atributo.

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 10)
    private String nombre;
    @Column(nullable = false, length = 30)
    private String apellidos;

    //El atributo sexo lo puse como enum, para que solo se pueda escoger entre 3 opciones.
    private String sexo;
    @Column(nullable = false, length = 10)
    private String ciudad;
    @Column(nullable = false)
    private LocalDate fechaNacimiento;
    @Column(nullable = false, length = 9)
    private Long telefono;
    @Column(nullable = false, length = 20)
    private String email;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String sexo, String ciudad, LocalDate fechaNacimiento, Long telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    //Aquí eh quitado el setter de Id porque como es autogenerado no queremos que nadie lo modifique.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                " Id: "+id+
                ", nombre: " + nombre  +
                ", apellidos: " + apellidos  +
                ", sexo: " + sexo +
                ", ciudad: " + ciudad  +
                ", fechaNacimiento: " + fechaNacimiento +
                ", telefono: " + telefono +
                ", email: " + email ;
    }
}
