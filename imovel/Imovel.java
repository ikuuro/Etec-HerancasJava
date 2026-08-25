/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imovel;
import java.util.Scanner;

/**
 *
 * @author ikaro
 */
public class Imovel {
    
    
    public static void main(String [] args){
  
  Scanner scanner = new Scanner(System.in);
        
    System.out.print("Digite 1 para imóvel novo e 2 para imóvel velho: ");
        int tipoImovel = scanner.nextInt();

        if (tipoImovel == 1) {
            imovelNovo in1 = new imovelNovo();
            in1.imprimirValor();
            
        } else {
            imovelVelho iv1 = new imovelVelho();
            iv1.imprimirValor();
        }
        
        
          
        
        scanner.close();
    }
}
 
    

