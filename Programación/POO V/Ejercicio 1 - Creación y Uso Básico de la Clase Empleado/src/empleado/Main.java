package empleado;
public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Roberto", 3000.0, 2022, 1, 1);

        System.out.println("Nombre: " + empleado1.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado1.dame_fechacontrato());
    }
}