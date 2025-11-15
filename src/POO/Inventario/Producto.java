/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Inventario;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Producto {
    private String nombre;
    private int precio;
    private byte cantidad;
    private int total;
    
    public void mostrarProducto() {
        System.out.println("Nombre: " + this.nombre + "\nPrecio: " + this.precio + "\nCantidad: " + this.cantidad);
    }
    
    public void valorTotal(int precio, byte cantidad) {
        System.out.println("Valor total");
        total += (precio*cantidad);
        System.out.println("Total: " + total);
    }
}
