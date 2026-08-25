/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingresso;

import java.util.Scanner;


/**
 *
 * @author ikaro
 */
public class Ingresso{
    
    
    public static void main(String [] args){
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite 1 para ingresso normal e 2 para VIP: ");
        int tipoIngresso = scanner.nextInt();
        Ingresso ingresso;

        if (tipoIngresso == 1) {
            System.out.println("O ingresso é normal");
        } else {
            System.out.print("Digite 1 para camarote superior e 2 para camarote inferior: ");
            int tipoVip = scanner.nextInt();
            
             VIP v1 = new VIP(tipoVip);
             v1.imprimirValor();
            
        }
         
     
    }
}
  
