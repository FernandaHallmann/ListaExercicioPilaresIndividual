package com.mycompany.ex1shape;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Circulo circ = new Circulo();
        System.out.println("Área do círculo: " + circ.calcularArea(4.3));
        System.out.println("Perímetro do círculo: " + circ.calcularPerimetro(4.3));
        
        Retangulo ret = new Retangulo();
        System.out.println("\nÁrea do retângulo: " + ret.calcularArea(4, 5));
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro(4, 5));
        
        Triangulo tri = new Triangulo();
        System.out.println("\nÁrea do triângulo: " + tri.calcularArea(7, 6));
        System.out.println("Perímetro do triângulo: " + tri.calcularPerimetro(4, 7, 3));
    }
    
}
