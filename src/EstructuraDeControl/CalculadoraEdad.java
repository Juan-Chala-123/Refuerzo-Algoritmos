/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDeControl;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author CHALA RAMIREZ
 */
public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir fecha de nacimiento
        System.out.print("Ingresa tu día de nacimiento: ");
        int diaNac = sc.nextInt();

        System.out.print("Ingresa tu mes de nacimiento: ");
        int mesNac = sc.nextInt();

        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNac = sc.nextInt();

        LocalDate hoy = LocalDate.now();
        int diaHoy = hoy.getDayOfMonth();
        int mesHoy = hoy.getMonthValue();
        int anioHoy = hoy.getYear();

        // Días por mes
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Comprobar si el año actual es bisiesto
        boolean bisiesto = (anioHoy % 4 == 0 && anioHoy % 100 != 0) || (anioHoy % 400 == 0);
        if (bisiesto) {
            meses[1] = 29;
        }

        int anios = anioHoy - anioNac;
        int mes = mesHoy - mesNac;
        int dias = diaHoy - diaNac;

        if (dias < 0) {
            mes--;
            int mesAnterior = (mesHoy - 2 + 12) % 12;
            dias += meses[mesAnterior];
        }

        if (mes < 0) {
            anios--;
            mes += 12;
        }

        System.out.println("\nTu edad exacta es: " + anios + " años, " + mes + " meses y " + dias + " días.");
        
        sc.close();
    }
}
