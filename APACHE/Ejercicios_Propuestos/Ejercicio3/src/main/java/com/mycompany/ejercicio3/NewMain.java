/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Integer> notas = new ArrayList<Integer>();
        //List<Integer> copia = new ArrayList<Integer>();
        Scanner teclado = new Scanner(System.in);
        int promedio=0;
        int nota;
        for(int i=0;i<10;i++){
            System.out.printf("Ingrese nota %d: \n",(i+1));
            nota = teclado.nextInt();
            notas.add(nota);
            promedio+=nota;
        }
        //Collections.sort(copia);
        //System.out.println("La Maxima nota es"+copia.get(copia.size()-1));
        //System.out.println("La Minima nota es"+copia.get(0));
        System.out.println("Las notas son: "+notas);
        System.out.println("La Maxima nota es: " + Collections.max(notas));
        System.out.println("La Minima nota es: " + Collections.min(notas));
        System.out.println("El promedio de notas es : " + promedio/notas.size());
        
        int ap=0;
        for(int i:notas){
            if(i>=13)  ap++;
        }
        System.out.println("El número de aprobados es "+ Integer.toString(ap));
    }
    
}
