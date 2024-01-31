package contador;
public class Main {
    public static void main(String[] args) {
        new ContadorInstancias();
        new ContadorInstancias();
        new ContadorInstancias();

        System.out.println("Número de instancias: " + ContadorInstancias.numeroInstancias());
    }
}