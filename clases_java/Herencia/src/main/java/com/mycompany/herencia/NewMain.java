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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante_UPC juan = new Estudiante_UPC("Juan Valdez","Ing. Electrónica",21,
        2017,4,false,2);
        System.out.println("El nombre del estudiante es "+juan.getNombre());
        System.out.println("la edad de "+juan.getNombre()+" es de "+Integer.toString(juan.getEdad())+" años");
        System.out.println(juan.getNombre()+"tiene "+juan.getPpp()+" creditos de PPP");
        System.out.println(juan.getNombre()+" ingresó a la UPC en el año "+Integer.toString(juan.anio_ingreso));
        System.out.println(juan.getNombre()+" tiene que pagar mensualidad de S/."+juan.pension(15));
        System.out.println(juan.getNombre()+" tendría que pagar una mensualidad en una universidad cara de de S/."+juan.pensionCara(15));
        
        
    }
    
}
