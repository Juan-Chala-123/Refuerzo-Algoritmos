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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el numero hasta donde quieres llegar: ");
        int n = sc.nextInt();
        int fibonacci = 0;
        int num = 0;
        int num2 = 1;
        
        for (int i = 0; i < n; i++) {
            fibonacci = num2 + num;
            
            System.out.println("Resultado: " + num + " + " + num2 + " = " + fibonacci);
            
            num = num2;
            num2 = fibonacci;
        }
        
        sc.close();
    }
}
