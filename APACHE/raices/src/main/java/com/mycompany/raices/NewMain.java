/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raices;

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
        /*
        5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio 
        se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
        Usa la constante PI y el método pow de Math
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese radio; ");
        String radio = sc.nextLine();
        double area = Math.PI*Math.pow(Double.parseDouble(radio),2);
        System.out.printf("El area es = %2.2f",area);
        
    }
    
}
