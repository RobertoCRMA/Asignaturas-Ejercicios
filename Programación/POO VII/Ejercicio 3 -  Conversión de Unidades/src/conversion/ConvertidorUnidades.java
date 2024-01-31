package conversion;
public class ConvertidorUnidades {
    public static double kmMillas(double km) {
        return km * 0.621371;
    }
    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}