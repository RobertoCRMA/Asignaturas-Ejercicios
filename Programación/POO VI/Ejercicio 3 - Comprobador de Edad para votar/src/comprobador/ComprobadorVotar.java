package comprobador;
import javax.swing.JOptionPane;
public class ComprobadorVotar {
    private static final int edadVotar = 18;
    public static void main(String[] args) {
        try {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad:"));
            boolean votar = calcularEdad(edad);

            if (votar) {
                JOptionPane.showMessageDialog(null, "Puede votar.");
            } else {
                JOptionPane.showMessageDialog(null, "No puede votar.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    private static boolean calcularEdad(int edad) {
        return edad >= edadVotar;
    }
}