package automovil;
public class Main {
    public static void main(String[] args) {
        Automovil Audi = new Automovil();

        System.out.println("La marca del coche es " + Audi.dime_marca() + " y el modelo el " + Audi.dime_modelo() + ".");
    }
}