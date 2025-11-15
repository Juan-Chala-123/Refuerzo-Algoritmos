/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private byte velocidad;
    
    public Vehiculo(String marca, String modelo, byte velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void setVelocidad(byte velocidad) {
        this.velocidad = velocidad;
    }
    
    public void acelerar() {
        System.out.println("El vehiculo acelero a " + this.velocidad + " Km.");
    }
    
    public void frenar() {
        System.out.println("El vehiculo desacelero a " + this.velocidad + " Km.");
    }
    
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Honda", "2019", (byte) 34);
        
        System.out.println("Marca: " + v.marca);
        System.out.println("Modelo: " + v.modelo);
        System.out.println("Velocidad: " + v.velocidad);
        
        v.setVelocidad((byte) 12);
        
        v.frenar();
    }
}
