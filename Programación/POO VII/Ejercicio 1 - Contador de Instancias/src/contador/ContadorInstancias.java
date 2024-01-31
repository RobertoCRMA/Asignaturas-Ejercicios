package contador;
public class ContadorInstancias {
    private static int contadorInstancias;
    public ContadorInstancias() {
        contadorInstancias++;
    }
    public static int numeroInstancias() {
        return contadorInstancias;
    }
}