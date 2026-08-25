/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author ikaro
 */
public class Rico extends Pessoa {
    
    public double dinheiro;

    public Rico(String nome, double dinheiro) {
        super(nome);
        this.dinheiro = dinheiro;
    }

    public void capital() {
        System.out.println(nome + " é rico(a) com R$ " + dinheiro + " na conta");
    }
}
