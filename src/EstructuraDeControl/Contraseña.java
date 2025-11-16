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
public class Contraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una contraseña: ");
        String contrasena = sc.nextLine();

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;

        // Validar longitud
        if (contrasena.length() >= 8) {

            // Recorrer cada carácter de la contraseña
            for (int i = 0; i < contrasena.length(); i++) {
                char c = contrasena.charAt(i);

                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                }
                if (Character.isLowerCase(c)) {
                    minuscula = true;
                }
                if (Character.isDigit(c)) {
                    numero = true;
                }
            }

            if (mayuscula && minuscula && numero) {
                System.out.println("Contraseña válida.");
            } else {
                System.out.println("La contraseña debe contener:");
                System.out.println("- Al menos una mayúscula");
                System.out.println("- Al menos una minúscula");
                System.out.println("- Al menos un número");
            }

        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }
    }
}
