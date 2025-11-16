/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.JuegoPersonajes;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {
    public static void main(String[] args) {
        Personaje personaje1 = new Personaje("Guerrero", 100, 20);  // Nombre, Vida, Poder
        Personaje personaje2 = new Personaje("Mago", 80, 25);       // Nombre, Vida, Poder

        while (personaje1.estaVivo() && personaje2.estaVivo()) {
            personaje1.atacar(personaje2);
                if (!personaje2.estaVivo()) {
                    System.out.println(personaje2.nombre + " ha sido derrotado.");
                    break;  // Si el segundo personaje muere, termina la batalla
                }

            personaje2.atacar(personaje1);
            if (!personaje1.estaVivo()) {
                System.out.println(personaje1.nombre + " ha sido derrotado.");
                break;
            }
        }
    }
}
