package estudiante;
public class Estudiante {
    private String nombre, grado;
    private int edad;
    public Estudiante() {
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
    }
    public String dime_nombre() {
        return nombre;
    }
    public void establece_nombre(String nombre) {
        this.nombre = nombre;
    }
    public String dime_grado() {
        return grado;
    }
    public void establece_grado(String grado) {
        this.grado = grado;
    }
    public int dime_edad() {
        return edad;
    }
    public void establece_edad(int edad) {
        this.edad = edad;
    }
}