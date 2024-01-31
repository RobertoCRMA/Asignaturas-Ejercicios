package validador;
public class Main {
    public static void main(String[] args) {
        System.out.println("Es un número: " + Validador.esNumero("678"));
        System.out.println("Es un número: " + Validador.esNumero("awsd"));
        System.out.println("Esta entre 1 y 10: " + Validador.rango(8, 1, 10));
        System.out.println("Esta entre 1 y 10: " + Validador.rango(11, 1, 10));
    }
}