/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author u201623659
 */
public class Colecciones_ListString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> nombres = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres de los alumnos: ");
        while(true){
            String valor = scanner.nextLine();
            if(valor.equals("")) break;
            nombres.add(valor);
            System.out.println("Ingrese el nombre del siguiente alumno: ");
        }
        System.out.println("Los alumnos ingresados son: ");
        for(int i=0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        
        for(String nombre:nombres){
            System.out.println(nombre);
        }
    }
}
