import java.util.ArrayList;
import java.util.List;

public class Cliente extends Thread{

    private String nombre;
    private int edad;
    boolean registrado;


    public Cliente() {
    }

    public Cliente(String nombre,int edad, boolean registrado) {
        this.nombre = nombre;
        this.registrado = registrado;
        this.edad = edad;

    }

    @Override
    public void run() {
        for (int i = 1;i < 5;i++){
            System.out.println(nombre +",de edad "+edad+" años,"+" esta siendo antendido por el operador: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", registrado=" + registrado +
                '}';
    }
}
