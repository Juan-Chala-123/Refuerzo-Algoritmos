/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Relaciones;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {
    public static void main(String[] args) {
        // Crear docentes
        Docente d1 = new Docente("Dr. Pérez", "Matemáticas");
        Docente d2 = new Docente("Lic. Gómez", "Ciencias");

        Estudiante e1 = new Estudiante("Juan", "12345");
        Estudiante e2 = new Estudiante("Ana", "12346");
        Estudiante e3 = new Estudiante("Carlos", "12347");

        Curso c1 = new Curso("Matemáticas Avanzadas", d1);
        Curso c2 = new Curso("Ciencias  Moderna", d2);

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);
        c2.agregarEstudiante(e3);

        c1.mostrarListadoEstudiantes();
        System.out.println();
        c2.mostrarListadoEstudiantes();
    }
}