package calculadora;
public class Empleado {
    private String nombre;
    private double horasTrabajadas, tarifaHora;
    public Empleado(String nombre, double horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this. horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    public String dime_nombre() {
        return nombre;
    }
    public void establece_nombre(String nombre) {
        this.nombre = nombre;
    }
    public double dime_horasTrabajadas() {
        return horasTrabajadas;
    }
    public void establece_horasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public double dime_tarifaHora() {
        return tarifaHora;
    }
    public void establece_tarifaHora() {
        this.tarifaHora = tarifaHora;
    }
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}