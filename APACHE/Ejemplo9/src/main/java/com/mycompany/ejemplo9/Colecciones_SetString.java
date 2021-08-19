/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author u201623659
 */
public class Colecciones_SetString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> nombres = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de los alumnos");
        while(true){
            String valor = scanner.nextLine();
            if(valor.equals("")) break;
            nombres.add(valor);
            System.out.println("Ingrese el nombre del siguiente alumno: ");
        }
        System.out.println("Los alumnos ingresados son: ");
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
    
}
