/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de inicio: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el número de fin: ");
        int num2 = sc.nextInt();

        System.out.println("Números primos entre " + num1 + " y " + num2 + ":");

        for (int num = num1; num <= num2; num++) {
            if (num > 1) {
                boolean primo = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}