package calculadora;
import javax.swing.JOptionPane;
public class CalculadoraImpuestos {
    private static final double impuesto = 0.15;
    public static void main(String[] args) {
        try {
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio del producto:"));
            double impuesto = calcularImpuesto(precio);
            double precioFinal = precio + impuesto;

            JOptionPane.showMessageDialog(null, "El precio final con impuesto es: " + precioFinal + "€");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    private static double calcularImpuesto(double precio) {
        return precio * impuesto;
    }
}