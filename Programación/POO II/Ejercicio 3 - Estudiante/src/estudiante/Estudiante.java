package estudiante;
public class Estudiante {
    private String nombre;
    private int edad;
    private double calificacion;
    public Estudiante() {
        nombre = "Roberto";
        edad = 19;
        calificacion = 99.9;
    }
    public void establece_edad() {
        if (edad < 0) {
            System.out.println("Error, la edad no puede ser negativa.");
        }
    }
    public void establece_calificacion() {
        if (calificacion > 100) {
            System.out.println("Error, la calificación no puede ser mayor de 100.");
        }
    }
    public String dime_nombre() {
        return nombre;
    }
    public int dime_edad() {
        return edad;
    }
    public double dime_calificacion() {
        return calificacion;
    }
}