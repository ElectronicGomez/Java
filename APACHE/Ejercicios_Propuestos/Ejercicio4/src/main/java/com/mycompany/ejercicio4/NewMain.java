/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int aleatorio;
        int numero;
        int i;
        String c="Y";
        while(c.equals("Y")){
            aleatorio = (int)(Math.random()*10);
            for(i=0;i<3;i++){
                System.out.printf("Intento %d\n",i+1);
                System.out.println("Ingrese numero: ");
                numero = teclado1.nextInt();
                Thread.sleep(1500);
                if(numero==aleatorio){
                    System.out.println("Felicidades!!");
                    break;
                }
            }
            System.out.println(i);
            if(i==3){
                System.out.println("Desea continuar? Y/N");
                c = teclado2.nextLine();
            }
            else c="N";
        }
    }
}
