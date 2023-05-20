package com.mycompany.ex4animal;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.mover();
        
        Gato gato = new Gato();
        gato.emitirSom();
        gato.mover();
        
        Passarinho passaro = new Passarinho();
        passaro.emitirSom();
        passaro.mover();
    }
}
