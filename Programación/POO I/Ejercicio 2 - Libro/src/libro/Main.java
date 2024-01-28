package libro;
public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro();

        System.out.println("Libro: " + miLibro.titulo + ".");
        System.out.println("Autor: " + miLibro.autor + ".");
        System.out.println("Páginas: " + miLibro.numPaginas + ".");
    }
}