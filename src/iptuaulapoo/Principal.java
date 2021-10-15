/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iptuaulapoo;

import java.util.Scanner;
public class Principal {
    
    
   
    public static void main(String[] args) {
      double valorIptu, juros, valorJuros, valorMulta, totalPagar;
      int meses;
      
      Scanner leia;
      leia  = new Scanner(System.in);
      
      
      System.out.println("Valor do IPTU: ");
      valorIptu = leia.nextDouble();
      
      System.out.println("Meses em atraso: ");
      meses = leia.nextInt();
      
      if (valorIptu <= 50){
         juros = 1;
      }
      else{
         if ((valorIptu >= 50.01) && (valorIptu <= 500)) {
             juros = 4;
         }
         else{
             if ((valorIptu >= 500.01) && (valorIptu <= 1200)){ 
                 juros = 9;
             }
             else{
                 juros = 15;
                 
             }
             
         }
      }
      
     valorJuros = (valorIptu * juros / 100)  * meses;
     valorMulta = valorIptu * 5 / 100;
     totalPagar = valorIptu + valorMulta + valorJuros;
     System.out.println("Valor IPTU.....: " + valorIptu);
     System.out.println("multa..........: " + valorMulta);
     System.out.println("juros..........: " + valorJuros);
     System.out.println("-----------------------------");
     System.out.println("Total a pagar..: " + totalPagar);
 
      
    }
    
}
