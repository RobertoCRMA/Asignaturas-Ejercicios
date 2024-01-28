package agenda;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Contacto> agenda = new ArrayList<>();

        int opciones;

        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción:\n" +
                    "1. Añadir contacto\n" +
                    "2. Buscar contacto\n" +
                    "3. Mostrar contactos\n" +
                    "4. Salir"));

            switch (opciones) {
                case 1:
                    Contacto contacto = new Contacto();
                    contacto.establece_nombre(JOptionPane.showInputDialog("Escribe el nombre del contacto:"));
                    contacto.establece_telefono(JOptionPane.showInputDialog("Escribe el número de teléfono:"));
                    contacto.establece_email(JOptionPane.showInputDialog("Escribe el email:"));
                    agenda.add(contacto);
                    break;
                case 2:
                    String buscarNombre = JOptionPane.showInputDialog("Escribe el nombre del contacto:");
                    for (Contacto c : agenda) {
                        if (c.dame_nombre().equals(buscarNombre)) {
                            JOptionPane.showMessageDialog(null, "Nombre: " + c.dame_nombre() + "\n" +
                                    "Teléfono: " + c.dame_telefono() + "\n" +
                                    "Email: " + c.dame_email());
                            break;
                        }
                    }
                    break;
                case 3:
                    String resumen = "Agenda:\n\n";
                    for (Contacto c : agenda) {
                        resumen += "Nombre: " + c.dame_nombre() + "\n";
                        resumen += "Teléfono: " + c.dame_telefono() + "\n";
                        resumen += "Email: " + c.dame_email() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, resumen);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error");
            }
        } while (opciones != 4);
    }
}