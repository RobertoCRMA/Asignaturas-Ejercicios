package empleado;
import java.time.LocalDate;
public class Empleado {
    private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;
    public Empleado(String nombre, double sueldo, int ano, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = LocalDate.of(ano, mes, dia);
    }
    public String dame_nombre() {
        return this.nombre;
    }
    public double dame_sueldo() {
        return this.sueldo;
    }
    public LocalDate dame_fechacontrato() {
        return this.fechaContrato;
    }
}