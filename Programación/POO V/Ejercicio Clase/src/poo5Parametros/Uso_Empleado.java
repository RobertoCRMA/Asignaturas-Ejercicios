package poo5Parametros;
import javax.swing.*;
import java.util.*;
public class Uso_Empleado {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Escribe el nombre:");
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Escribe el sueldo:"));
        int agno = Integer.parseInt(JOptionPane.showInputDialog("Escribe el año:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Escribe el mes:"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe el día:"));

        Empleado empleado = new Empleado(nombre, sueldo, agno, mes, dia);

        JOptionPane.showMessageDialog(null, "Nombre: " + empleado.dameNombre() + "\nSueldo: " + empleado.dameSueldo() + "\nFecha de Contrato: " + empleado.dameFechaContrato());

        double porcentajeAumento = Double.parseDouble(JOptionPane.showInputDialog("Escribe el porcentaje de aumento:"));

        empleado.subeSueldo(porcentajeAumento);

        JOptionPane.showMessageDialog(null, "Sueldo subido: " + empleado.dameSueldo());
    }
}
class Empleado{
    public Empleado(String nom, double sue,
                    int agno, int mes, int dia){
        nombre=nom;
        sueldo=sue;

        GregorianCalendar calendario =
                new GregorianCalendar(agno, mes-1, dia);

        alta_contrato=calendario.getTime();
    }
    public String dameNombre() { //GETTER
        return nombre;
    }
    public double dameSueldo() { //GETTER
        return sueldo;
    }
    public Date dameFechaContrato() { //GETTER
        return alta_contrato;
    }
    public void subeSueldo(double porcentaje) { //SETTER
        double aumento= sueldo*porcentaje/100;
        sueldo += aumento;
    }
    private String nombre;
    private double sueldo;
    private Date alta_contrato;
}