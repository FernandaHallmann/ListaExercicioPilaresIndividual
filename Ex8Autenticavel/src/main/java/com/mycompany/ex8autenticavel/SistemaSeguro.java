package com.mycompany.ex8autenticavel;

/**
 *
 * @author Ferna
 */
public class SistemaSeguro extends Autenticavel {
    private boolean autentico;

    public boolean isAutentico() {
        return autentico;
    }

    public void setAutentico(boolean autentico) {
        this.autentico = autentico;
    }

    @Override
    public void desautenticar() {
        if (autentico) {
            autentico = false;
            System.out.println("Está desautenticado");
        } else {
            System.out.println("Já está desautenticado");
        }
    }

    @Override
    public void autenticar() {
        if (autentico) {
            System.out.println("Já está autenticado");
        } else {
            autentico = true;
            System.out.println("Está autenticado");
        }
    }
    
}
