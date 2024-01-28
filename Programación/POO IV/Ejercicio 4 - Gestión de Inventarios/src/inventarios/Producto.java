package inventarios;
public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    public String dame_nombre() {
        return nombre;
    }
    public void establece_nombre(String nombre) {
        this.nombre = nombre;
    }
    public int dame_cantidad() {
        return cantidad;
    }
    public void establece_cantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double dame_precio() {
        return precio;
    }
    public void establece_precio(double precio) {
        this.precio = precio;
    }
}