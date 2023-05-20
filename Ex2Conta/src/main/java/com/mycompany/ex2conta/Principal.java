package com.mycompany.ex2conta;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setTitular("Fernanda Hallmann");
        conta.setSaldo(300);
        conta.depositar(500);
        conta.sacar(240);
        conta.obterSaldo();
        System.out.println("Titular: " + conta.getTitular());
    }
    
}
