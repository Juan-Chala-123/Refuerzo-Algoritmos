/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Inventario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Inventario {
    private List<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            // Usamos .equals() para comparar los nombres correctamente
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null; // Si no encuentra el producto, retorna null
    }
    
    public int calcularValorTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.valorTotal();
        }
        return total;
    }
}
