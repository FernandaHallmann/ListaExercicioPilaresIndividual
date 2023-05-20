package com.mycompany.ex1shape;

/**
 *
 * @author Ferna
 */
public class Circulo extends Shape {
    public double calcularArea(double r) {
        return r * r  * 3.14;
    }
    
    public double calcularPerimetro(double r) {
        return 2 * 3.14 * r;
    }
}
