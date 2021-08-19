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
//extends es que hereda de la clase estudiante
public class Estudiante_UPC extends Estudiante{
    private int nivel_ingles;
    private int ppp;
    private boolean gea;
    
    public Estudiante_UPC(String nombre,String carrera,int edad, int anio_ingreso,
            int nivel_ingles,boolean gea, int ppp){
        super(nombre,carrera,edad,anio_ingreso);
        this.gea=gea;
        this.ppp=ppp;
        this.nivel_ingles=nivel_ingles;
              
    }

    public int getNivel_ingles() {
        return nivel_ingles;
    }

    public int getPpp() {
        return ppp;
    }

    public boolean isGea() {
        return gea;
    }
    
    @Override
    public float pension(int num_creditos){
        return num_creditos*150;
    }
    
    public float pensionCara(int num_creditos){
        return super.pension(num_creditos);
        
    }
    
}
