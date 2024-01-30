package prueba;
public class Prueba {
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Roberto");
        Empleados trabajador2 = new Empleados("Pedro");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());

        trabajador1.cambiaSeccion("Recursos Humanos");
        trabajador1.cambiaNombre("Top G");
    }
}
class Empleados {
    private String nombre;
    private String seccion;
    public Empleados(String nom) {nombre = nom; seccion = "Administración";}
    public void cambiaSeccion(String seccion) {this.seccion = seccion;}
    public String devuelveDatos() {return "El nombre es " + nombre + " y la sección es " + seccion;}
    public void cambiaNombre(String nombre) {this.nombre = nombre;}
}