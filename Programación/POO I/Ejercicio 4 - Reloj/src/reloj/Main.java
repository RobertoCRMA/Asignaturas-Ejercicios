package reloj;
public class Main {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        System.out.println("Mi reloj es de la marca " + miReloj.marca + ".");
        System.out.println("Es de tipo " + miReloj.Tipo() + ".");
        System.out.println("Y cuesta " + miReloj.precio + "€.");
    }
}