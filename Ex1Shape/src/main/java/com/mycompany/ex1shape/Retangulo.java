package com.mycompany.ex1shape;

/**
 *
 * @author Ferna
 */
public class Retangulo extends Shape {
    public double calcularArea(double a, double b) {
        return a * b;
    }
    
    public double calcularPerimetro(double a, double b) {
        return 2 * a + 2 * b;
    }
}
