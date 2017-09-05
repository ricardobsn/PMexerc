/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopm;

import java.util.Scanner;

/**
 *
 * @author ricardoneves
 */
public class ExercicioPM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner s = new Scanner(System.in);  
        System.out.println("Entre com o primeiro lado");    
        lado1 = s.nextInt();
        System.out.println("Entre com o segundo lado"); 
        lado2 = s.nextInt();
        System.out.println("Entre com o terceiro lado"); 
        lado3 = s.nextInt();
         
        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1+lado2)){
            if (lado1 == lado2 && lado1 == lado3){
               System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
            }
            else if((lado1 == lado2) || (lado1 == lado3)){
               System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
            }
             else
                System.out.println("Três lados diferentes.");
        }
    }
}
