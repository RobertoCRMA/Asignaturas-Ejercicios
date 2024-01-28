package relojalarma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RelojAlarma relojAlarma = new RelojAlarma();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Establecer hora de la alarma");
            System.out.println("2. Activar y desactivar alarma");
            System.out.println("3. Actualizar la hora actual");
            System.out.println("4. Comprobar si es la hora de la alarma");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Escribe la hora de la alarma (HH:mm): ");
                    String horaAlarma = scanner.next();
                    relojAlarma.establecerHoraAlarma(horaAlarma);
                    break;
                case 2:
                    System.out.print("Quieres activar (1) o desactivar (0) la alarma?: ");
                    int activarDesactivar = scanner.nextInt();
                    relojAlarma.activarDesactivarAlarma(activarDesactivar == 1);
                    break;
                case 3:
                    System.out.print("Escribe la hora actual (HH:mm): ");
                    String horaActual = scanner.next();
                    relojAlarma.actualizarHoraActual(horaActual);
                    break;
                case 4:
                    relojAlarma.comprobarHoraAlarma();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}