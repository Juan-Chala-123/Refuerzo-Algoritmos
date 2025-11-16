/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica;

import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class NumerosAmigos {

    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        int suma1 = sumaDivisores(num1);
        int suma2 = sumaDivisores(num2);

        if (suma1 == num2 && suma2 == num1) {
            System.out.println(num1 + " y " + num2 + " son numeros amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " NO son numeros amigos.");
        }

        sc.close();
    }
}
