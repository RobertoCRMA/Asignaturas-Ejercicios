package celular;
public class Main {
    public static void main(String[] args) {
        Celular miCelular = new Celular();

        System.out.println("Mi celular es de modelo " + miCelular.modelo + ".");
        System.out.println("Tiene un almacenamiento de " + miCelular.almacenamiento + " GB.");
        System.out.println("Y tiene una cámara de " + miCelular.camaraMP + " Mpx.");
    }
}