/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Relaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHALA RAMIREZ
 */
class Curso {
    private String nombre;
    private Docente docente;
    private List<Estudiante> estudiantes;

    public Curso(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarListadoEstudiantes() {
        System.out.println("Listado de estudiantes del curso: " + nombre);
        System.out.println("Docente: " + docente.getNombre());
        System.out.println("Especialidad del Docente: " + docente.getEspecialidad());
        System.out.println("-------------------------------");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
