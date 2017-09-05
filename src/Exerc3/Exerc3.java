/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc3;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.util.Scanner;

/**
 *
 * @author ricardoneves
 */
public class Exerc3 {
    
    public static void main(String args[]) {

        Scanner x = new Scanner(System.in);
        System.out.println("Digite sua nota [0.0 - 10.0]: ");
        float nota = x.nextFloat();
            if( nota >= 7.0 ){
                System.out.println("\"Parabens, voce passou direto!\n");
            }
            if((nota >= 4.0) && (nota <7.0)){
                System.out.println("Vai ter que fazer prova final");
            }
            if (nota < 4.0){
                System.out.println("Reprovado...");
            } 
    }
}
