/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica.PlanificadorTareas;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {
    public static void main(String[] args) {
        Planificador plan = new Planificador();

        plan.agregarTarea("Estudiar Java", 1);
        plan.agregarTarea("Hacer ejercicio", 2);
        plan.agregarTarea("Comprar comida", 3);

        plan.listarPendientes();

        plan.completarTarea("Hacer ejercicio");

        plan.listarPendientes();
        plan.listarFinalizadas();
        plan.listarTodas();
    }
}
