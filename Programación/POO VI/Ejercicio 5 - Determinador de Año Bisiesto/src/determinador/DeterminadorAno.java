package determinador;
import javax.swing.JOptionPane;
public class DeterminadorAno {
    private static final int cuatro = 4;
    private static final int cien = 100;
    private static final int cuatro2 = 400;
    public static void main(String[] args) {
        try {
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Escribe el año:"));
            boolean bisiesto = calcularBisiesto(ano);

            if (bisiesto) {
                JOptionPane.showMessageDialog(null, ano + " es bisiesto.");
            } else {
                JOptionPane.showMessageDialog(null, ano + " no es bisiesto.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    private static boolean calcularBisiesto(int ano) {
        return ano % cuatro == 0 && (ano % cien != 0 || ano % cuatro2 == 0);
    }
}