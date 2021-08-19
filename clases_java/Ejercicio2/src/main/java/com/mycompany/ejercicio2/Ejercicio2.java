/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author ASUS
 */
public class Ejercicio2 {
     //Modificador de acceso: public, private , protected -> tiene que darse
    //Si no le damos, por defecto es public y se podrá modificar
    //si es privada, no se puede cambiar
    private final double IGV = 0.18;//final = const-> no se puede modificar
    private int edad;
    private float sueldo;
    private String nombre;
    private String apellidos;
    public String empresa;
     /*El constructor : Se caracteriza por tener el mismo nombre de la clase y tiene que ser public*/
    
    
    /*ESTAMOS APLICANDO POLIMORFISMO ES NUESTRO CONSTRUCTOR Trabajador, ES DECIR, SE USA 
    UNA MISMA CLASE CON DIFERENTES PARAMETROS*/
    
    /*El constructor por defecto*/
    //Si lo llamo a este, no le paso nada
    public Ejercicio2(){
        
    }
    /*El constructor de un Trabajador mas detallado*/
    /*Pero si llamo a ese, tengo que pasarle los parámtros como nombre
    apellidos, edad,empresa*/
    public Ejercicio2(String nombre, String apellidos, int edad, String empresa){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.empresa = empresa;
    }
    /*Otro constructor mas detallado aún*/
    public Ejercicio2(String nombre, String apellidos, int edad, String empresa, float sueldo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.empresa = empresa;
        this.sueldo = sueldo;
        
    }
    /*Creando getters -> permite ver variables privadas que yo eliga*/
   
    public String getNombreCompleto(){
        return this.nombre+" "+this.apellidos;
    }

    /*Creando setters -> permite modificar una variable privada*/
       
    
    public void setSueldo(float newsueldo) {
        this.sueldo = newsueldo;
    }
    public float SueldoBruto(){
        return this.sueldo - this.descuento();
    }
    private float descuento(){
        return 0.18f*this.sueldo+this.sueldo*0.13f;
    }

   
    


    

    
}
