/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.JuegoPersonajes;

/**
 *
 * @author CHALA RAMIREZ
 */
class Personaje {
    protected String nombre;
    private int vida;
    private int poder;

    public Personaje(String nombre, int vida, int poder) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
    }

    public void atacar(Personaje enemigo) {
        enemigo.vida -= this.poder;  // Descuenta el poder del atacante de la vida del enemigo
        System.out.println(this.nombre + " atacó a " + enemigo.nombre + " y le quitó " + this.poder + " puntos de vida.");
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
