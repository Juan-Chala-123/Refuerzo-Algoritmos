/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CuentaBancaria {
    private int saldo;
    private String titular;
    private String numero;
    
    public CuentaBancaria(int saldo, String titular, String numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
    }
    
    public void depositar(int monto) {
        this.saldo += monto;     
    }
    
    public void retirar(int monto) {
        if (monto < 0) {
            System.out.println("El monto a retirar no puede ser negativo.");
        } else if (this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: " + this.saldo);
        } else {
            System.out.println("No se puede retirar. Saldo insuficiente.");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("Tu saldo actual es de " + this.saldo);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CuentaBancaria cb = new CuentaBancaria(342142, "Juan", "KSV693");
        
        System.out.println("Saldo: " + cb.saldo);
        System.out.println("Titular: " + cb.titular);
        System.out.println("Numero de Cuenta: " + cb.numero);
        
        System.out.println("Ingresa la operacion que quieres hacer (1-depositar, 2-retirar, 3-Consultar Saldo): ");
        byte n = sc.nextByte();
        
        if (n == 1) {
            System.out.println("¿Cuanto deseas ingresar? ");
            int monto = sc.nextInt();
            cb.depositar(monto);
            System.out.println("Se ha deposito " + monto + " en su cuenta bancaria.");
            System.out.println("Monto actual: " + cb.saldo);
        } else if (n == 2) {
            System.out.println("¿Cuanto deseas retirar? ");
            int monto = sc.nextInt();
            cb.retirar(monto);
        } else if (n == 3) {
            cb.mostrarSaldo();
        } else {
            System.out.println("Erro: Tienen que ser uno de los tres numeros, 1, 2 o 3.");
        }
    }
}
