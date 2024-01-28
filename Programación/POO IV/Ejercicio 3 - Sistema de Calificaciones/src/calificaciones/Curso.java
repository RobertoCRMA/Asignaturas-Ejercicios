package calificaciones;
public class Curso {
    private String nombre;
    private double calificacion;
    public String dame_nombre() {
        return nombre;
    }
    public void establece_nombre(String nombre) {
        this.nombre = nombre;
    }
    public double dame_calificacion() {
        return calificacion;
    }
    public void establece_calificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public String dame_letra() {
        String resultado;
        if (calificacion >= 9.0) {
            resultado = "A";
        } else if (calificacion >= 8.0) {
            resultado = "B";
        } else if (calificacion >= 7.0) {
            resultado = "C";
        } else if (calificacion >= 6.0) {
            resultado = "D";
        } else {
            resultado = "F";
        }
        return resultado;
    }
}