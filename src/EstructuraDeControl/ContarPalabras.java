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
public class ContarPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una oración: ");
        String oracion = sc.nextLine().trim();

        String[] palabras = oracion.split("\\s+");
        int cantidadPalabras = palabras.length;

        int sumaLongitudes = 0;
        for (String palabra : palabras) {
            sumaLongitudes += palabra.length();
        }

        double promedio = (double) sumaLongitudes / cantidadPalabras;

        System.out.println("\nCantidad de palabras: " + cantidadPalabras);
        System.out.println("Longitud promedio de las palabras: " + promedio);
    }
}
