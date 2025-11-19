/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDeControl;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int aleatorio = rand.nextInt(50);
        
        System.out.println("Ingresa un numero: ");
        
        int intento = 0;

        do {
            System.out.println("Ingresa nuevamente el numero: ");
            intento = sc.nextInt();
            
            if (intento > aleatorio) {
                System.out.println("Mas bajo.");
            } else if (intento < aleatorio) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Es correcto le atinaste al numero.");
            }
        } while (intento != aleatorio);
        
        sc.close();
    }
}
