package com.mycompany.ex10produto;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Harry Potter");
        livro.setPreco(40);
        livro.setAutor("J. K. Rowling");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Autor: " + livro.getAutor());
        
        Eletronico eletronico = new Eletronico();
        eletronico.setCor("Preto");
        System.out.println("\nCor do eletrônico: " + eletronico.getCor());
        
        Roupa roupa = new Roupa();
        roupa.setTamanho("Pequeno");
        System.out.println("\nTamanho da roupa: " + roupa.getTamanho());
    }
}
