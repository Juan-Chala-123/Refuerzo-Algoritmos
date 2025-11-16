/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CHALA RAMIREZ
 */

public class SimulacionFila {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Queue<Integer> fila = new LinkedList<>();

        System.out.print("¿Cuantos clientes hay en la fila? ");
        int cantidadClientes = sc.nextInt();

        for (int i = 0; i < cantidadClientes; i++) {
            int tiempoAtencion = random.nextInt(10) + 1;
            fila.add(tiempoAtencion);
        }

        int tiempoTotal = 0;
        int clienteNum = 1;

        System.out.println("\nSimulacion de Atencion");

        while (!fila.isEmpty()) {
            int tiempo = fila.poll();
            System.out.println("Cliente " + clienteNum + ": " + tiempo + " minutos de atención");
            tiempoTotal += tiempo;
            clienteNum++;
        }

        double tiempoPromedio = (double) tiempoTotal / cantidadClientes;

        System.out.println("\nTiempo total de espera: " + tiempoTotal + " minutos");
        System.out.printf("Tiempo promedio por cliente: %.2f minutos\n", tiempoPromedio);

        sc.close();
    }
}