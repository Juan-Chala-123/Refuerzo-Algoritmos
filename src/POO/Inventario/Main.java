/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Inventario;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Coca-Cola", 2114, (byte) 10);
        Producto p2 = new Producto("Pepsi", 1233, (byte) 8);
        Producto p3 = new Producto("Agua", 1316, (byte) 15);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        Producto encontrado = inventario.buscarProducto("Pepsi");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Producto no encontrado");
        }

        double valorTotal = inventario.calcularValorTotal();
        System.out.println("El valor total del inventario es: " + valorTotal);
    }
}
