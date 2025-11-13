/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Persona {
    private String nombre;
    private byte edad;
    private String documento;
    
    public Persona(String nombre, byte edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }
    
    public void mayorEdad() {
        if (this.edad >= 18) {
            System.out.println("La persona " + this.nombre + " es mayor de edad.");
        } else {
            System.out.println("La persona " + this.nombre + " no es mayor de edad.");
        }
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", (byte) 23, "SJ382D");
        Persona p2 = new Persona("Luis", (byte) 17, "HFSKN4W");
        
        p1.mayorEdad();
        p2.mayorEdad();
    }
}
