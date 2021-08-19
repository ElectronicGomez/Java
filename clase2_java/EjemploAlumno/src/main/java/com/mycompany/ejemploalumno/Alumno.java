/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploalumno;

/**
 *
 * @author ASUS
 */
public class Alumno {
    private String nombre;
    private float pc1;
    private float lb1;
    private float lb2;
    private float pc2;
    private float ea;
    private float tf;
    private float dd;
    
    public Alumno(String nombre, float pc1,float lb1,float lb2,float pc2,
    float ea,float tf)
    {
        this.nombre=nombre;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.lb1 = lb1;
        this.lb2 = lb2;
        this.ea = ea;
        this.tf = tf;
        this.dd = dd;
    }

    public float promediofinal()
    {
        float pf=(float)(this.pc1*0.15+this.pc2*0.15+this.lb1*0.15+
        this.lb2*0.15+this.ea*0.2+this.tf*0.15+this.dd*0.05);

        return pf;
    }
    public String getNombre(){
        return this.nombre;
    }
}
    
    

