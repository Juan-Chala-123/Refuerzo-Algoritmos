/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RazonamientoLogicaAlgortimica.PlanificadorTareas;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Tarea {
    private String nombre;
    private int prioridad;
    private boolean completada;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void completar() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return "[Tarea: " + nombre + ", prioridad: " + prioridad +
               ", estado: " + (completada ? "Completada" : "Pendiente") + "]";
    }
}