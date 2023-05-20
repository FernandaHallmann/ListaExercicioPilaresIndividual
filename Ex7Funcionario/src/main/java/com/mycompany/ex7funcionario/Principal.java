package com.mycompany.ex7funcionario;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(3000);
        gerente.setSetor("Desenvolvimento");
        System.out.println("Salário do gerente: " + gerente.getSalario());
        System.out.println("Setor: " + gerente.getSetor());
        
        Analista analista = new Analista();
        analista.setNome("Albert");
        System.out.println("\nNome do Analista: " + analista.getNome());
        
        Programador programador = new Programador();
        programador.setProjeto("Aplicativo de Banco");
        System.out.println("\nNome do Projeto: " + programador.getProjeto());
    }
}
