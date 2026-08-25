/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animais;

/**
 *
 * @author ikaro
 */
public class Gato extends Animais {
    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.println(nome + ": Miau!!");
    }
}
