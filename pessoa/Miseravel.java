/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author ikaro
 */
public class Miseravel extends Pessoa {
     public Miseravel(String nome) {
        super(nome);
    }

    public void pedir() {
        System.out.println(nome + " esta pedindo ajuda");
    }
    
}
