package com.mycompany.ex4animal;

/**
 *
 * @author Ferna
 */
public class Passarinho extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O passarinho piou");
    }

    @Override
    public void mover() {
        System.out.println("O passarinho voou");
    }
    
}
