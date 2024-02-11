package general; // Paquete para las clases.
public class Main { // Clase principal Main.
    public static void main(String[] args) { // Método principal main.

        Animal mascota; // Declaramos una variable de tipo Animal llamada miMascota

        mascota = new Perro(); // Creamos una instancia de Perro y la asignamos a mascota.
        mascota.nombre(); // Llama al método nombre() de mascota, en este caso es un Perro.

        mascota = new Gato(); // Creamos una instancia de Gato y la asignamos a mascota.
        mascota.nombre(); // Llama al método nombre() de mascota, en este caso es un Gato.
    }
}