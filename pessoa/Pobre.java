/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author ikaro
 */
public class Pobre extends Pessoa{
     public Pobre(String nome) {
        super(nome);
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando pra ser rico");
    }
    
}
