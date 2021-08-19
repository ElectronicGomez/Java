/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo7;

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
        //Listas
        List<String> alumnos = new ArrayList<String>();
        List<Integer> notas = new ArrayList<Integer>();
        List<Double> notas1 = new ArrayList<Double>();
        String[] nombres = {"Juan","Fiorella","Claudia"};
        
        Scanner teclado = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.println("Ingrese el nombre del alumno "+Integer.toString(i+1)+": ");
            String nombre = teclado.nextLine();
            if(nombre.equals("")) break;
            alumnos.add(nombre);
            i++;
        }
        System.out.println("Los nombres de los alumnos ingresados son: ");
        for(i = 0;i<alumnos.size();i++){
            System.out.println(alumnos.get(i));
        }
        //alumnos.set(i, element)
        //alumnos.remove(3);
        //System.out.println("Los nombres de los alumnos ingresados son: ");
        //for(i = 0;i<alumnos.size();i++){
        //    System.out.println(alumnos.get(i));
        //}
        i=0;
        List<EstudianteUPC> estudiantes = new ArrayList<EstudianteUPC>();
        while(true){
            System.out.println("Ingrese el nombre del alumno "+Integer.toString(i+1)+": ");
            Scanner teclado1 = new Scanner(System.in);
            String nombre = teclado1.nextLine();
            if(nombre.equals("")) break;
            System.out.println("Ingrese el codigo del alumno "+Integer.toString(i+1)+": ");
            Scanner teclado2 = new Scanner(System.in);
            String codigo = teclado2.nextLine();
            System.out.println("Ingrese el carrera del alumno "+Integer.toString(i+1)+": ");
            Scanner teclado3 = new Scanner(System.in);
            String carrera = teclado3.nextLine();
            System.out.println("Ingrese el edad del alumno "+Integer.toString(i+1)+": ");
            Scanner teclado4 = new Scanner(System.in);
            int edad = teclado4.nextInt();
            i++;
            estudiantes.add(new EstudianteUPC(nombre,edad,codigo,carrera));
        }
        
        float promedio=0.0f;
        
        for(i=0;i<estudiantes.size();i++){
            System.out.println("El alumno "+Integer.toString(i+1)+" es " 
                               + estudiantes.get(i).getNombre());
            promedio+=estudiantes.get(i).getEdad();
        }
        System.out.println(Float.toString(promedio/estudiantes.size()));
    }
    
}