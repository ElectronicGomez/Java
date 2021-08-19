/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String binario;
        int decimal=0;
        int i;
        while(true){
            System.out.println("Ingrese numero binario de 8 bits: ");
            binario = teclado.nextLine();
            for(i=0;i<binario.length();i++){
                if(binario.charAt(i)!='1' && binario.charAt(i)!='0'){
                    break;
                }
                if(binario.length()!=8) break;
            }
            if (i==binario.length()) {
                for(i=0;i<binario.length();i++){
                    if(binario.charAt(i)=='1') decimal+=Math.pow(2, binario.length()-i-1);
                }
                break;
            }
        }
        System.out.println(decimal);
        
    }
    
}
