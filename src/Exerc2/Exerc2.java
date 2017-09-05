/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc2;

import java.util.Scanner;

/**
 *
 * @author ricardoneves
 */
public class Exerc2 {
    public static void main(String args[]) {

        Scanner x = new Scanner(System.in);
        System.out.println("Escreva um número");
        int y = x.nextInt();
        for(int i = y; i>0;i--){//não pode fazer divisoes com zero
            if(y%i==0){
                System.out.println(i);
            }
        }
    }
    
}
