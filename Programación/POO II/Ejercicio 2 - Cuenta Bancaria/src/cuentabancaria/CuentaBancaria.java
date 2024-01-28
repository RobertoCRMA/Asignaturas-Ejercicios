package cuentabancaria;
public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria() {
        titular = "Anónimo";
        saldo = 500.0;
    }
    public void establecer_saldo() {
        if (saldo < 0) {
            System.out.println("Error, el saldo no puede ser negativo.");
        }
    }
    public String dime_titular() {
        return titular;
    }
    public double dime_saldo() {
        return saldo;
    }
}