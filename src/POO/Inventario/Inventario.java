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
    
    public void mostrarProductos() {
        for (Producto p : productos) {
            p.mostrarProducto();
        }
    }
}
