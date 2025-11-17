/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Estudiante {
    private String nombre;
    private String programa;

    
    public Estudiante(String nombre, String programa) {
        this.nombre = nombre;
        this.programa = programa;
    }
    
    public void calcular(double promedio) {
        System.out.println("Su promedio es de: " + promedio);
    }
    
    public void aprobar(double promedio) {
        if (promedio >= 3.0) {
            System.out.println("El estudiante aprueba el programa.");
        } else {
            System.out.println("El estudiante no aprueba el programa.");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante e = new Estudiante("Juan", "Ingenieria");
        double suma = 0;    
        List<Double> notas = new ArrayList<>();
        
        System.out.println("Ingresa el numero de notas que va ingresar: ");
        byte n = sc.nextByte();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa la nota " + (i+1));
            double nota = sc.nextDouble();
            notas.add(nota);
            suma += nota;
        }
        double promedio = suma / (double) n;
        e.calcular(promedio);
        
        e.aprobar(promedio);

        sc.close();
    }
}
