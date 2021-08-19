/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

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
        System.out.println("Ingrese el primero texto: ");
        String texto1 = teclado.nextLine();
        
        System.out.println("Ingrese el segundo texto: ");
        String texto2 = teclado.nextLine();
        
        boolean mayor = texto1.length()>texto2.length();
        int tamanio;
        if(mayor==false) tamanio = texto1.length();
        else tamanio = texto2.length();
        System.out.println("Las cooincidencias se dan en las posiciones: ");
        for(int i=0;i<tamanio;i++){
            if(texto1.charAt(i)==texto2.charAt(i)){
                System.out.printf("%d-",i);
            }
        }
        
        
    }
    
}
