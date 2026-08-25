/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author ikaro
 */
public class Pessoa {

   public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public static void main(String [] args){
        Rico rico1 = new Rico("haroldo",878347847.49);
        rico1.capital();
        
        
        Pobre p1 = new Pobre("paulo");
        p1.trabalhar();
        
        
        Miseravel m1 = new Miseravel("cleber");
        m1.pedir();
    }
     
    }

