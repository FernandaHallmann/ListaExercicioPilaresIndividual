package com.mycompany.ex6midia;

/**
 *
 * @author Ferna
 */
public class Principal {

    public static void main(String[] args) {
        Cd cd = new Cd();
        cd.reproduzir();
        
        Dvd dvd = new Dvd();
        dvd.reproduzir();
        
        Bluray blu = new Bluray();
        blu.reproduzir();
    }
}
