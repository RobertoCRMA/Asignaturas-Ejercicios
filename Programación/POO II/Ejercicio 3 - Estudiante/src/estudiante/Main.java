package estudiante;
public class Main {
    public static void main(String[] args) {
        Estudiante yo = new Estudiante();

        System.out.println("Nombre: " + yo.dime_nombre());
        System.out.println("Edad: " + yo.dime_edad());
        System.out.println("Calificación: " + yo.dime_calificacion());

        yo.establece_edad();
        yo.establece_calificacion();
    }
}