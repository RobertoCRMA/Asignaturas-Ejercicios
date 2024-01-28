package estudiante;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cantidadEstudiantes = 3;
        Estudiante[] estudiantes = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            Estudiante estudiante = new Estudiante();

            estudiante.establece_nombre(JOptionPane.
                    showInputDialog("Estudiante " + (i + 1) + ": Dime el nombre"));
            estudiante.establece_edad(Integer.parseInt(JOptionPane.
                    showInputDialog("Estudiante " + (i + 1) + ": Dime la edad")));
            estudiante.establece_grado(JOptionPane.
                    showInputDialog("Estudiante " + (i + 1) + ": Dime grado"));

            estudiantes[i] = estudiante;
        }
        for (int i = 0; i < cantidadEstudiantes; i++) {
            JOptionPane.showMessageDialog(null, "Información del Estudiante " + (i + 1) + ":\n"
                    + "Nombre: " + estudiantes[i].dime_nombre() + "\n"
                    + "Edad: " + estudiantes[i].dime_edad() + " años\n"
                    + "Grado: " + estudiantes[i].dime_grado());
        }
    }
}