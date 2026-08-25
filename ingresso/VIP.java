/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ingresso;

/**
 *
 * @author ikaro
 */
public class VIP extends Ingresso {
     public int tipoCamarote;

    public VIP(int tipoCamarote) {
        this.tipoCamarote = tipoCamarote;
    }

 
    public void imprimirValor() {
        if (tipoCamarote == 1) {
            System.out.println("VIP Camarote Superior");
        } else {
            System.out.println("VIP Camarote Inferior");
        }
    }
    
}
