/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese las notas de los alumnos");
        int [] notas = new int[6];
        for(int i=0;i<8;i++){
            Scanner teclado = new Scanner(System.in);
            try{
                notas[i]=teclado.nextInt();
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.print("Trata de acceder a un indice fuera de rango "+
                        Integer.toHexString(i));
            }catch(InputMismatchException ex){
                System.out.println("El error fue que ingresó otro tipo de dato por teclado");
                System.out.println("El error fue "+ex.getMessage());
            }
        }
        System.out.println("Ingrese un numero aleatorio entre 0 y 10");
        Scanner teclado = new Scanner(System.in);
        String num = teclado.nextLine();
        int numero=-1;
        try{                    
            numero = Integer.parseInt(num); //paserInt convierte un string a entero
        }catch(Exception ex){
            System.out.println("El error fue "+ex.getMessage());
            
        }
        int aleat = ((int)(Math.random()*5000))%11;
        
        if(aleat==numero){
            System.out.print("Adivinó el numero. Felicitaciones");
        }
        else{
            System.out.println("Lo sentimos perdió el juego. El numero era "+
                    Integer.toString(aleat));
        }
        
        
    }
    
}
