package com.mycompany.ex5biblioteca;

import java.util.HashMap;

/**
 *
 * @author Ferna
 */
public class Biblioteca {
    private HashMap<String, String> livros;
    private String titulo;
    private String autor;
    
    public Biblioteca() {
        livros = new HashMap<>();
    }
    
    public void adicionarLivro(String titulo, String autor) {
        livros.put(titulo, autor);
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void buscarLivro(String autor) {
        boolean encontrado = false;
        for (int i = 0; i < livros.size(); i++) {
            if (getAutor().equals(autor)) {
                System.out.println("Livro encontrado: " + titulo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro encontrado para o autor: " + autor);
        }
    }
    
    public String getAutor() {
        return autor;
    }

    public void informacoes() {
        System.out.println("Título do livro: " + titulo 
                + "\nAutor: " + autor);
    }
}
