package com.mycompany.ex9instrumento;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Violao violao = new Violao();
        violao.tocar();
        
        Piano piano = new Piano();
        piano.tocar();
        
        Bateria bateria = new Bateria();
        bateria.tocar();
    }
}
