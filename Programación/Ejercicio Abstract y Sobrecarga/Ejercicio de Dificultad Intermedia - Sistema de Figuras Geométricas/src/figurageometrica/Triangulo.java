package figurageometrica;
public class Triangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;
    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }
    public Triangulo(double base, double altura, String colorLinea, String colorRelleno) {
        super(colorLinea, colorRelleno);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo con base " + base + ", altura " + altura + ", color de línea " + colorLinea + " y color de relleno " + colorRelleno);
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}