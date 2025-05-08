public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("***Benvenido a atencion al cliente*** \n");
        Cliente clien2 = new Cliente("Cristian",43,false);
        Cliente clien1 = new Cliente("Manuel",23,true);
        Cliente clien3 = new Cliente("Paula",37,true);
        Cliente clien4 = new Cliente("Maria",17,false);


        clien4.start();
        clien2.start();
        clien3.start();
        clien1.start();

        clien4.join();
        clien2.join();
        clien3.join();
        clien1.join();
        System.out.println();
        System.out.println("Saliendo de atencion al cliente");
    }
}