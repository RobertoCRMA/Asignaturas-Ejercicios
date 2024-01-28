package producto;
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    public Producto() {
        nombre = "arroz";
        precio = 1.30;
        stock = 7;
    }
    public void establece_stock() {
        if (stock < 0) {
            System.out.println("Error, el stock no puede ser negativo.");
        }
    }
    public String dime_nombre() {
        return nombre;
    }
    public double dime_precio() {
        return precio;
    }
    public int dime_stock() {
        return stock;
    }
}