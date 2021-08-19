/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.List;
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
        
        System.out.println("Ingrese texto1: ");
        String texto1 = teclado.nextLine();
        
        System.out.println("Ingrese texto2: ");
        String texto2 = teclado.nextLine();
        
        int pequeno=0;
        if(texto1.length()>texto2.length()) pequeno = texto2.length();
        else pequeno = texto1.length();
        
     
        List<Integer> posiciones = new ArrayList<Integer>();
        for(int i=0;i<pequeno;i++){
            if(texto2.charAt(i)==texto1.charAt(i)) posiciones.add(i);
        }
        System.out.println(posiciones);
    }
    
}
