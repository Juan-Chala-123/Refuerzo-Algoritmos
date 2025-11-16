/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 1000;  // Saldo inicial
        int opcion;

        do {
            System.out.println("Cajero Automatico");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Cantidad a depositar: ");
                    int deposito = sc.nextInt();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida.");
                    }
                    break;

                case 3:
                    System.out.print("Cantidad a retirar: ");
                    int retiro = sc.nextInt();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad inválida.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del cajero. ¡Gracias!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4);
    }
}
