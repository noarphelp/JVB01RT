import java.util.ArrayList;

/*
* Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
Zapato: material, tipoCierre
Pantalon: estilo, tipoTejido
Camiseta: manga, cuello
Sombrero: tipo, tamaño
b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
*  (crear un objeto con parámetros para cada uno de ellos).
c) Crear los siguientes métodos (en cada subclase correspondiente):
Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. Tener en cuenta para esto la implementación de herencia
*  y sobreescritura de métodos.
* */
public class Vestimenta {
    private int codigo;
    private String nombre;
    private double precio;
    private String marca ;
    private int talla;
    private String color;

    public Vestimenta() {
    }

    public Vestimenta(int codigo, String nombre, double precio, String marca, int talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String saberPropiedad(){
        return "";
    };

    public static class Pantalon extends Vestimenta{

        private String estilo;
        private String tipoTejido;

        public Pantalon(int codigo, String nombre, double precio, String marca, int talla, String color, String estilo, String tipoTejido) {
            super(codigo, nombre, precio, marca, talla, color);
            this.estilo = estilo;
            this.tipoTejido = tipoTejido;
        }

        public String getEstilo() {
            return estilo;
        }

        public void setEstilo(String estilo) {
            this.estilo = estilo;
        }

        public String getTipoTejido() {
            return tipoTejido;
        }

        public void setTipoTejido(String tipoTejido) {
            this.tipoTejido = tipoTejido;
        }

        @Override
        public String saberPropiedad() {
            return "Este pantalon es de estilo: "+getEstilo();
        }
    };

    public static class Zapato extends Vestimenta{

        private String material;
        private String tipoCierre;

        public Zapato(int codigo, String nombre, double precio, String marca, int talla, String color, String material, String tipoCierre) {
            super(codigo, nombre, precio, marca, talla, color);
            this.material = material;
            this.tipoCierre = tipoCierre;
        }

        @Override
        public String saberPropiedad() {
            return "Estos zapatos son de marca: "+getMarca();
        }
    };

    public static class Sombrero extends Vestimenta{

        private String tipo;
        private String tamaño;
        public Sombrero(int codigo, String nombre, double precio, String marca, int talla, String color, String tipo, String tamaño) {
            super(codigo, nombre, precio, marca, talla, color);
            this.tipo = tipo;
            this.tamaño = tamaño;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTamaño() {
            return tamaño;
        }

        public void setTamaño(String tamaño) {
            this.tamaño = tamaño;
        }

        @Override
        public String saberPropiedad() {
            return "Este sombrero es de tipo: "+getTipo();
        }
    };

    public static class Camiseta extends Vestimenta{

        private String cuello;
        private String manga;
        public Camiseta(int codigo, String nombre, double precio, String marca, int talla, String color, String cuello, String manga) {
            super(codigo, nombre, precio, marca, talla, color);
            this.cuello = cuello;
            this.manga = manga;
        }

        public String getCuello() {
            return cuello;
        }

        public void setCuello(String cuello) {
            this.cuello = cuello;
        }

        public String getManga() {
            return manga;
        }

        public void setManga(String manga) {
            this.manga = manga;
        }

        @Override
        public String saberPropiedad() {
            return  "Esta camiseta es de manga "+getManga();
        };
    };



    public static void main(String[] args) {

        Zapato zapato =new Zapato(1234,"Air",95.30,"Nike",42,"Azul","Cuero","Velcro");
        Zapato zapato1 =new Zapato(1454,"Wuarache",135.55,"Adidas",39,"Rojas","Tela","Cordones");
        Zapato zapato2 =new Zapato(1567,"Lux",335,"Armani",44,"Negro","Charol","Cordones");

        Pantalon pantalon = new Pantalon(4565,"501",125,"Levis",40,"Azul","Moderno","Vaquero");
        Pantalon pantalon1 = new Pantalon(4698,"Future",70,"Jack&Jons",44,"Negro","Moderno","Vaquero");
        Pantalon pantalon2 = new Pantalon(4889,"Nex",225,"Armani",40,"Marron","Clasico","Ceda");

        Camiseta camiseta = new Camiseta(3455,"Fenix",55,"Adidas",44,"Blanca","Pico","Corta");
        Camiseta camiseta1 = new Camiseta(3003,"Fx",585,"Gucci",44,"Crema","Alto","Larga");

        Sombrero sombrero = new Sombrero(6003,"Guli",185.35,"Cartier",90,"Negro","Copa","Grande");
        ArrayList<Vestimenta>list = new ArrayList<>();
        list.add(zapato);
        list.add(zapato1);
        list.add(zapato2);
        list.add(pantalon);
        list.add(pantalon1);
        list.add(pantalon2);
        list.add(camiseta);
        list.add(camiseta1);
        list.add(sombrero);

        for (Vestimenta ves : list){

            System.out.println(ves.saberPropiedad());
        }


    }
}
