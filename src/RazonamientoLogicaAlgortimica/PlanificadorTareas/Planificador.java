/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica.PlanificadorTareas;

/**
 *
 * @author CHALA RAMIREZ
 */
import java.util.ArrayList;
import java.util.List;

public class Planificador {

    private List<Tarea> tareas;

    public Planificador() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String nombre, int prioridad) {
        tareas.add(new Tarea(nombre, prioridad));
        System.out.println("Tarea agregada: " + nombre);
    }

    public void completarTarea(String nombre) {
        for (Tarea t : tareas) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                t.completar();
                System.out.println("Tarea completada: " + nombre);
                return;
            }
        }
        System.out.println("No se encontró la tarea: " + nombre);
    }

    public void listarPendientes() {
        System.out.println("\nTareas Pendientes");
        for (Tarea t : tareas) {
            if (!t.estaCompletada()) {
                System.out.println(t);
            }
        }
    }

    public void listarFinalizadas() {
        System.out.println("\nTareas Finalizadas");
        for (Tarea t : tareas) {
            if (t.estaCompletada()) {
                System.out.println(t);
            }
        }
    }

    public void listarTodas() {
        System.out.println("\nTodas las tareas");
        for (Tarea t : tareas) {
            System.out.println(t);
        }
    }
}
