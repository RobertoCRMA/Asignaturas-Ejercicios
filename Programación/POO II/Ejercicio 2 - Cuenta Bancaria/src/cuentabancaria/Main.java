package cuentabancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria();
        System.out.println("Titular: " + miCuenta.dime_titular());
        System.out.println("Saldo: " + miCuenta.dime_saldo());
        miCuenta.establecer_saldo();
    }
}