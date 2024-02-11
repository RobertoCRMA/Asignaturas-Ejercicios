package general; // Paquete para las clases.
public class Gato extends Animal { // Definición de la clase derivada Perro que hereda de Animal.
    @Override // Sobrescribe el método nombre de la clase base Animal.
    public void nombre() {
        System.out.println("Gato"); // Imprime el nombre Gato.
    }
}