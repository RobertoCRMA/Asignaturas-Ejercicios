package calculadora2;
import javax.swing.JOptionPane;
public class CalculadoraDescuentos {
    private static final double porcentaje = 0.1;
    private static final int descuento = 5;
    public static void main(String[] args) {
        try {
            double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio:"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad:"));
            double precioTotal = calcularPrecioTotal(precioUnitario, cantidad);

            JOptionPane.showMessageDialog(null, "El precio final con descuento es: " + precioTotal + "€");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    private static double calcularPrecioTotal(double precioUnitario, int cantidad) {
        if (cantidad >= descuento) {
            double descuento = precioUnitario * porcentaje * cantidad;
            return precioUnitario * cantidad - descuento;
        } else {
            return precioUnitario * cantidad;
        }
    }
}