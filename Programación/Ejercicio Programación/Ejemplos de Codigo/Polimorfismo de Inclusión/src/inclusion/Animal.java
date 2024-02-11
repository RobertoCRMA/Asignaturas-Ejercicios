package inclusion; // Paquete para las clases.
// Definición de la clase base Animal
class Animal {
    // Método que muestra información básica del animal
    public void mostrarInformacion() {
        System.out.println("Soy un animal.");
    }
}
// Definición de la clase derivada Perro que hereda de Animal
class Perro extends Animal {
    // Método que sobrescribe el método de la clase base Animal
    @Override
    public void mostrarInformacion() {
        System.out.println("Soy un perro.");
    }
}
// Definición de la clase derivada Gato que hereda de Animal
class Gato extends Animal {
    // Método que sobrescribe el método de la clase base Animal
    @Override
    public void mostrarInformacion() {
        System.out.println("Soy un gato.");
    }
}