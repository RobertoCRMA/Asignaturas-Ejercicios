package reservashotel;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de habitaciones en el hotel: ");
        int numHabitaciones = scanner.nextInt();

        Hotel hotel = new Hotel(numHabitaciones);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar disponibilidad");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Salir");
            System.out.print("Ingrese su elección: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hotel.mostrarDisponibilidad();
                    break;
                case 2:
                    System.out.print("Ingrese el número de habitación a reservar: ");
                    int numReserva = scanner.nextInt();
                    hotel.reservarHabitacion(numReserva);
                    break;
                case 3:
                    System.out.print("Ingrese el número de habitación a cancelar: ");
                    int numCancelacion = scanner.nextInt();
                    hotel.cancelarReservaHabitacion(numCancelacion);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        }
    }
}