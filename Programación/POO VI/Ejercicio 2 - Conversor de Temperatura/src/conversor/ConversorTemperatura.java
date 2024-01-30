package conversor;
import javax.swing.JOptionPane;
public class ConversorTemperatura {
    private static final double conversion = 1.8;
    private static final double conversion2 = 32;
    public static void main(String[] args) {
        try {
            double temperaturaCelsius = Double.parseDouble(JOptionPane.showInputDialog("Escribe la temperatura en grados Celsius:"));
            double temperaturaFahrenheit = calcularTemperaturaFahrenheit(temperaturaCelsius);

            JOptionPane.showMessageDialog(null, "En grados Fahrenheit es: " + temperaturaFahrenheit);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    private static double calcularTemperaturaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * conversion) + conversion2;
    }
}