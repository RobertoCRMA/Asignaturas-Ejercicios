package inclusion; // Paquete para las clases.
public class Main { // Clase principal Main.
    public static void main(String[] args) { // Método principal main.
        // Creamos una instancia de Perro y la asignamos a una variable de tipo Animal
        Animal miAnimal = new Perro();
        // Llamamos al método mostrarInformacion() de miAnimal, que en este caso es un Perro
        miAnimal.mostrarInformacion(); // Salida: Soy un perro.

        // Creamos una instancia de Gato y la asignamos a una variable de tipo Animal
        miAnimal = new Gato();
        // Llamamos al método mostrarInformacion() de miAnimal, que en este caso es un Gato
        miAnimal.mostrarInformacion(); // Salida: Soy un gato.
    }
}