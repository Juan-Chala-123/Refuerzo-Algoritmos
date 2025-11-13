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
        
        System.out.println("Ingresa tu año: ");
        int anio = sc.nextInt();
        
        System.out.println("Ingresa tus meses: ");
        byte mes = sc.nextByte();
        
        System.out.println("Ingresa el dia: ");
        byte dia = sc.nextByte();
        
        LocalDate.now();
        
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
