package com.mycompany.ex5biblioteca;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Biblioteca livro = new Biblioteca();
        livro.adicionarLivro("Harry Potter", "J. K. Rowlling");
        livro.buscarLivro("J. K. Rowlling");
        livro.informacoes();
    }
}
