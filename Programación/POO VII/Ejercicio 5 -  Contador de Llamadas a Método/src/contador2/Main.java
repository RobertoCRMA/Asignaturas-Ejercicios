package contador2;
public class Main {
    public static void main(String[] args) {

        ContadorLlamadas contador = new ContadorLlamadas();

        contador.imprimirMensaje();
        contador.imprimirMensaje();
        contador.imprimirMensaje();

        System.out.println("El método se ha llamado " + ContadorLlamadas.nContadorLlamadas() + " veces.");
    }
}