package aumentosueldo;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Pedro", -1, 2022, 3, 20));
        empleados.add(new Empleado("Manuel", 3000, 2020, 4, 14));
        empleados.add(new Empleado("Sebastian", 3000, 2020, 12, 1));
        empleados.add(new Empleado("Óscar", 3000, 2022, 5, 2));
        empleados.add(new Empleado("Ángela", 3000, 2022, 1, 27));

        int añoLimite = 2021;

        for (Empleado empleado : empleados) {
            int añoContrato = empleado.dame_fechacontrato().getYear();

            if (añoContrato < añoLimite) {
                empleado.sube_sueldo(5);
            }
        }

        System.out.println("Nombres y sueldos actualizados:");

        for (Empleado empleado : empleados) {
            System.out.println(empleado.dame_nombre() + ": " + empleado.dame_sueldo() + "€");
        }
    }
}