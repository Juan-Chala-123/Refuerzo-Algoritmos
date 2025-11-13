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
public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        int n = sc.nextInt();
        
        System.out.println("Tabla de multiplicacion del numero: " + n);
        
        byte count = 1;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " x " + count + " = " + (n * count));
            count++;
        }
        
        sc.close();
    }
}
