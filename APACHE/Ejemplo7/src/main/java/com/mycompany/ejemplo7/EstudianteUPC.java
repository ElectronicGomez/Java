/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo7;

/**
 *
 * @author u201623659
 */
public class EstudianteUPC {
    private String nombre;
    private int edad;
    private String codigo;
    private String carrera;
    
    public EstudianteUPC(String nombre, int edad, String codigo, String carrera ){
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }
    
    
    
}
