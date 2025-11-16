/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] palabras = {"java", "programa", "teclado", "computadora", "variable"};

        Random rand = new Random();
        String palabraSecreta = palabras[rand.nextInt(palabras.length)];

        char[] progreso = new char[palabraSecreta.length()];
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        int intentos = 6;

        System.out.println("Ahorcado");
        System.out.println("Tienes " + intentos + " intentos para adivinar la palabra secreta.");

        while (intentos > 0) {
            System.out.println("\nPalabra: " + String.valueOf(progreso));
            System.out.print("Ingresa una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    progreso[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
            } else {
                System.out.println("La letra esta en la palabra.");
            }

            if (String.valueOf(progreso).equals(palabraSecreta)) {
                System.out.println("\nLe atinaste a la palabra: " + palabraSecreta);
                return;
            }
        }

        System.out.println("\nTe has quedaste sin intentos. La palabra es: " + palabraSecreta);

        sc.close();
    }
}