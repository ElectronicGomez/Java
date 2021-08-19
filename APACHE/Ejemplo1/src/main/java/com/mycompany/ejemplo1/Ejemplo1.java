/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Ejemplo1;

/**
 *
 * @author ASUS
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Tipo de datos nativo en JAVA*/
        boolean bol = true;//bol = true/false booleano
        byte mi_byte = 0b01011100;//tipo byte de 8 bits
        byte mi_otrob = 0x5C;//tipo byte de 8 bits
        char car = 'p';//car es una variable entera de 16 bits
        short val = 30000;//val es una variable entera de 32 bits
        int num = -45000;//num es una variable entera de 32 bits
        long largo = 250000000;//largo es una variable entera de 64 bits
        float pi = 3.141516f;//pi es una varbiale de 32 bits de como flotante.Siempre se le agrega una f al final para definirlo como flotante
        double j = 2.567123;//j es una bariable de 64 bits de coma flotante
        
        String saludo = "Hola Mundo";//Los string son inmutables
        car = saludo.charAt(0);//con el punto llamamos a sus metodos
        
        
        String mensaje = saludo + " como te va?";
        String mensaje2 = saludo +" "+ Integer.toString(num);
        
        if(saludo.equals("Hola Mundo")){
            System.out.println("Está saludando al mundo");
            System.out.println(mensaje2);
        }
        else{
            System.out.println("No está saludando al mundo");
        }
        System.out.println(car);
        
        int aleatorio = (int)(Math.random()*20);
        System.out.println("El número aleatorio es "+ Integer.toString(aleatorio));
        
    }
    
}
