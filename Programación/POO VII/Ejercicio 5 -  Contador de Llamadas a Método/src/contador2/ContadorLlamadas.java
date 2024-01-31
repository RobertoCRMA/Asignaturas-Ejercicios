package contador2;
public class ContadorLlamadas {
    private static int contadorLlamadas;
    public void imprimirMensaje() {
        contadorLlamadas++;
        System.out.println("Llamada");
    }
    public static int nContadorLlamadas() {
        return contadorLlamadas;
    }
}