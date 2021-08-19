/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.condicionales;

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
        int a = 80;
        if(a<10) System.out.println("a es menor que 10");
        else if(a>=10 && a<30) System.out.println("a está entre 10 y 20");
        else System.out.println("a es mayor o igual 30");
        
        System.out.println("Quien ganará mañana el partido?");
        System.out.println("a) Peru");
        System.out.println("b) Brasil");
        System.out.println("c) Empate");
        
        /*PIDE DATO*/
         Scanner teclado = new Scanner(System.in);//alt+enter para importar clases que necesitamos
        String respuesta = teclado.nextLine();
        /*GUARDA DATO*/
        
        
        respuesta=respuesta.toUpperCase();
        char car = respuesta.charAt(0);
        switch(car){
            case 'A':
                System.out.println("Usted confia en su selección");
                break;
            case 'B':
                System.out.println("Usted debe ser  brasilero");
                break;
            case 'C':
                System.out.println("Usted cree en las estadísticas");
                break;   
        }

    }
    
}
