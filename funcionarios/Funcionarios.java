/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionarios;

/**
 *
 * @author ikaro
 */
public class Funcionarios {

    public String nome;
    public int matricula;

    public Funcionarios(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public static void main(String [] args){
       AssistenteADM a1 = new AssistenteADM("carlos",9483);
     
       a1.imprimir();
       
       Tecnico t1 = new Tecnico("roberto", 9389);
       
       t1.imprimir();
    }
    

    public void imprimir() {
        System.out.println("Matrícula: " + matricula + ", Nome: " + nome);
    }
}
    
