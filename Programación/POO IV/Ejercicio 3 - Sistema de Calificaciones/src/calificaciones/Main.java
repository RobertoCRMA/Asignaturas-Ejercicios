package calificaciones;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.establece_nombre(JOptionPane.showInputDialog("Escribe el nombre del curso:"));

        double califInput = Double.parseDouble(JOptionPane.showInputDialog("Escribe la calificación (0.0 - 10.0):"));

        curso.establece_calificacion(califInput);

        String resultado = curso.dame_letra();

        JOptionPane.showMessageDialog(null, "La calificación en " + curso.dame_nombre() + " es: " + resultado);
    }
}