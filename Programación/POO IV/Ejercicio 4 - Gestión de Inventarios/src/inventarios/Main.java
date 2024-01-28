package inventarios;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> inventario = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Producto producto = new Producto();
            producto.establece_nombre(JOptionPane.showInputDialog("Escribe el nombre del producto " + (i + 1) + ":"));
            producto.establece_cantidad(Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad " + (i + 1) + ":")));
            producto.establece_precio(Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio " + (i + 1) + ":")));
            inventario.add(producto);
        }
        String resumen = "Resumen del inventario:\n\n";
        for (int i = 0; i < inventario.size(); i++) {
            resumen += "Producto " + (i + 1) + ":\n";
            resumen += "Nombre: " + inventario.get(i).dame_nombre() + "\n";
            resumen += "Cantidad: " + inventario.get(i).dame_cantidad() + "\n";
            resumen += "Precio: " + inventario.get(i).dame_precio() + "€" + "\n\n";
        }
        JOptionPane.showMessageDialog(null, resumen);
    }
}