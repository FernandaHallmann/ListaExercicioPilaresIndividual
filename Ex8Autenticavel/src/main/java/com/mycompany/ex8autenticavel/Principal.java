package com.mycompany.ex8autenticavel;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        SistemaSeguro sistema = new SistemaSeguro();
        sistema.setAutentico(true);
        sistema.autenticar();
        sistema.desautenticar();
    }
}
