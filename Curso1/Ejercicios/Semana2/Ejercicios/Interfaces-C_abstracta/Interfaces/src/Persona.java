public class Persona {

    public void imprimirDireccion(String nombre){
        Direccion dire = new Direccion();

        System.out.println("Hola "+nombre+"! tu direccion es "+dire.calle+", "+dire.ciudad+".");
    }


    public class Direccion{
        private String calle = "Calle Barcelona";
        private String ciudad="A Coruña";

        public Direccion() {
        }

        public String getCalle() {
            return calle;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
    }
}
