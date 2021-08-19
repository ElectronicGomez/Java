/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    private String nombre;
    private String carrera;
    private int edad;
    public int anio_ingreso;
    
    //Constructor
    
    public Estudiante(String nombre,String carrera,int edad, int anio_ingreso){
        this.edad=edad;
        this.nombre=nombre;
        this.carrera=carrera;
        this.anio_ingreso=anio_ingreso;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }
    
    public float pension(int num_creditos){
        return num_creditos*400;
    }
    
    
    
    
}
