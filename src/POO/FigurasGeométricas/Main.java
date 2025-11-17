/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.FigurasGeométricas;

/**
 *
 * @author CHALA RAMIREZ
 */
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}
