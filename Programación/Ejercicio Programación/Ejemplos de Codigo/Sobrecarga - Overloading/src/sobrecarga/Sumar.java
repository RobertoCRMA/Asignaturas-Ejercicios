package sobrecarga; // Paquete para las clases.
public class Sumar { // Clase sumar.
    public int sumar(int a, int b) {
        return a + b;
    } // Método sumar con int.
    public double sumar(double a, double b) {
        return a + b;
    } // Método sumar con double, firma diferente al tener distintos atributos.
}