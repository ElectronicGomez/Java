/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

/**
 *
 * @author ASUS
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HorarioElectronica hor_ele = new HorarioElectronica();
        Medicina hor_med = new Medicina();
        System.out.println("El nunmero de horas entre 9 y 4 en eletrónica es "+
                Integer.toString(hor_ele.num_horas(9, 4)));
        System.out.println("El nunmero de horas entre 9 y 4 en Medicina es "+
                Integer.toString(hor_med.num_horas(9, 4)));
        System.out.println(hor_ele.carrera());
        hor_ele.carrera(true);
        hor_ele.carrera(4);
        hor_ele.carrera(3.17f);
        System.out.println(hor_ele.carrera(1));
        
        //Instanciar el objeto: Se instancia cuando la clase no es static
        //Geometria obj = new Geometria();
        /*System.out.println("El radio de un circulo de radio 2.3 es "+Float.toString(obj.areaCirculo(2.3f)));
        System.out.println("El radio de un cuadrado de lado 4.5 es "+Float.toString(obj.areaCuadrado(4.5f)));
        */
        System.out.println("El radio de un circulo de radio 2.3 es "+Float.toString(
                Geometria.areaCirculo(2.3f)));
        System.out.println("El radio de un cuadrado de lado 4.5 es "+Float.toString(
                Geometria.areaCuadrado(4.5f)));
        float mi_pi = Geometria.pi;
        //Las clases estaticas se obtienen desde la clase misma
        HorarioElectronica.Horario_dictado();
        
        
        
        
        
       
    }
    
}
