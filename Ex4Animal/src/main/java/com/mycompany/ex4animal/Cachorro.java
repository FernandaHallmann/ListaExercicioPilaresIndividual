package com.mycompany.ex4animal;

/**
 *
 * @author Ferna
 */
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro andou");
    }
    
}
