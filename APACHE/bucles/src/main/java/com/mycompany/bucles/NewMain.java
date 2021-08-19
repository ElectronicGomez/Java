/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bucles;

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
        String cifra;
        int i=0;
        while(true){
            System.out.println("Ingrese un número binario");
            cifra = teclado.nextLine();
            for(i=0;i<cifra.length();i++){
                if(cifra.charAt(i)!='0' && cifra.charAt(i)!='1'){
                    break;
                }
            }
            if(i==cifra.length()){
                break;
            }
            else{
                System.out.println("Ingrese un número con 1s y 0s nada más");
                continue;
            }
        }
        int numerodec=0;
        for(i=0;i<cifra.length();i++){
            if(i==0){
                numerodec +=cifra.charAt(i)-'0';
                //System.out.println(Integer.toString(numerodec));
            }
            else{
                numerodec<<=1;//corre una cifra a la izquierda
                //System.out.println(Integer.toString(numerodec));
                numerodec += cifra.charAt(i)-'0';
                //System.out.println(Integer.toString(numerodec));
            }
        }
        System.out.println("El número en decimal es "+Integer.toString(numerodec));
    }
    
}
