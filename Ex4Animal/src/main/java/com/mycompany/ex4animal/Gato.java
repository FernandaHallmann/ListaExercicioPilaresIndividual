package com.mycompany.ex4animal;

/**
 *
 * @author Ferna
 */
public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato miou");
    }

    @Override
    public void mover() {
        System.out.println("O gato andou");
    }
    
}
