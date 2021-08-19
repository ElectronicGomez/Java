/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

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
        Scanner teclado =new Scanner(System.in);
        System.out.println("Inrgese numero: ");
        int numero = teclado.nextInt();
        List<Integer> primos = new ArrayList<Integer>();
        int i=2;
        while(primos.size()!=numero){
            if(Num_primo.EsPrimo(i)) primos.add(i);
            i++;
        }
        System.out.println(primos);
    }
    
}
