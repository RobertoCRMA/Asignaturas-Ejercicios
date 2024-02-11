package herencia; //Paquete para las clases.
public class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}