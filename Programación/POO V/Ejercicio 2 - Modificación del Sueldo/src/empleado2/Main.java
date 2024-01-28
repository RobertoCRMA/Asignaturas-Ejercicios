package empleado2;
public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Roberto", 3000.0, 2022, 1, 1);
        Empleado empleado2 = new Empleado("Juan", 3000.0, 2021, 4, 19);

        System.out.println("Nombre: " + empleado1.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado1.dame_fechacontrato());
        System.out.println();

        empleado2.subeSueldo(10);

        System.out.println("Nombre: " + empleado2.dame_nombre());
        System.out.println("Sueldo: " + empleado1.dame_sueldo() + "€");
        System.out.println("Fecha de contrato: " + empleado2.dame_fechacontrato());
        System.out.println("Nuevo sueldo de " + empleado2.dame_nombre() + ": " + empleado2.dame_sueldo() + "€");
    }
}