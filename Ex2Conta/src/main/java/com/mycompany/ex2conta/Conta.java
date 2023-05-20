package com.mycompany.ex2conta;

/**
 *
 * @author Ferna
 */
public class Conta {
    private double saldo;
    private String titular;
    
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Não foi possível realizar o saque");
        }
    }
    
    public void obterSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
}
