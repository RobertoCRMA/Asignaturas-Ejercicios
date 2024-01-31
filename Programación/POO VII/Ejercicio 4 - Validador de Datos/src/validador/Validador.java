package validador;
public class Validador {
    public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean rango(double num, double min, double max) {
        return num >= min && num <= max;
    }
}