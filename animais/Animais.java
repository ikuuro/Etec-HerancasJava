/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animais;

/**
 *
 * @author ikaro
 */
public class Animais {

    
    public String nome;

    public Animais(String nome) {
       this.nome = nome;
    }
    
    

    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }
    public static void main(String [] args){
        Cachorro c1 = new Cachorro("Scooby");
        c1.caminhar();
        c1.latir();
    
        
        Gato g1 = new Gato("Tom");
        g1.caminhar();
        g1.miar();
    }
}
    
