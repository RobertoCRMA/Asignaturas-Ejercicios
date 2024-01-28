package calculadora;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];

        for (int i = 0; i < 5; i++) {
            empleados[i] = ingresarEmpleado();
        }
        for (Empleado empleado : empleados) {
            mostrarInformacionYSalario(empleado);
        }
    }
    private static Empleado ingresarEmpleado() {
        String nombre = JOptionPane.showInputDialog("Escribe el nombre del empleado:");
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Escribe las horas trabajadas:"));
        double tarifaPorHora = Double.parseDouble(JOptionPane.showInputDialog("Escribe la tarifa por hora:"));

        return new Empleado(nombre, horasTrabajadas, tarifaPorHora);
    }
    private static void mostrarInformacionYSalario(Empleado empleado) {
        JOptionPane.showMessageDialog(null, "Información del empleado:\n"
                + "Nombre: " + empleado.dime_nombre() + "\n"
                + "Horas trabajadas: " + empleado.dime_horasTrabajadas() + " h\n"
                + "Tarifa por hora: €" + empleado.dime_tarifaHora() + "\n"
                + "Salario: €" + empleado.calcularSalario());
    }
}