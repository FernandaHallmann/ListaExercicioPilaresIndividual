package com.mycompany.ex1shape;

/**
 *
 * @author Ferna
 */
public class Triangulo extends Shape {
    public double calcularArea(double a, double b) {
        return (a * b) / 2;
    }
    
    public double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }
}
