package bicicleta;
public class Main {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta();

        System.out.println("Es de tipo " + miBicicleta.tipo + ".");
        System.out.println("Tiene " + miBicicleta.numRuedas + " ruedas.");
        System.out.println("Tiene un tamaño de " + miBicicleta.tamaño + ".");
    }
}