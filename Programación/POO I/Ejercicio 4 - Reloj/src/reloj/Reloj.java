package reloj;
public class Reloj {
    String marca;
    Boolean digital;
    double precio;
    public Reloj() {
        marca = "casio";
        digital = true;
        precio = 50.0;
    }
    public String Tipo() {
        return digital ? "digital" : "analógico";
    }
}