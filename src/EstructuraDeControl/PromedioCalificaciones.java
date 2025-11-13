/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDeControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de estudiantes: ");
        byte e = sc.nextByte();
        
        System.out.println("Ingresa la cantidad de notas que vas a ingresar: ");
        byte n = sc.nextByte();
        
        byte encima = 0;
        
        List<Double> promedios = new ArrayList<>();
        List<String> nombres = new ArrayList<>();
        
        for (int i = 0; i < e; i++) {
            System.out.println("Estudiante " + (i+1));
            System.out.println("Nombre Estudiante: ");
            sc.nextLine();
            String nombre = sc.nextLine();
            nombres.add(nombre);
            
            List<Double> notas = new ArrayList<>();
            double suma = 0;

            for (int a = 0; a < n; a++) {
                System.out.println("Ingresa la nota " + (a+1));
                double nota = sc.nextDouble();
                notas.add(nota);
                suma += nota;
            }

            double promedio = (suma / n);
            promedios.add(promedio);
            System.out.println("Promedio del Estudiante " + nombre + ": " + promedio);         
        }
        
        double total = 0;
        for (double p : promedios) {
            total += p;
        }
        
        double pGeneral = total / e;
        
        for (double p : promedios) {
            if (p > pGeneral) {
                encima++;
            }
        }
        
        System.out.println("\nPromedio general del grupo: " + pGeneral);
        System.out.println("Estudiantes por encima del promedio general: " + encima);
        
        sc.close();
    }
}
