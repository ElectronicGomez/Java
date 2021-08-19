/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Ejemplo2;

/**
 *
 * @author u201623659
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        // TODO code application logic here
        System.out.println("Probando la promación POO");
        Trabajador obj1 = new Trabajador();
        Trabajador obj2 = new Trabajador("Juan","Rodríguez Salazar",34,"Siemens");
        Trabajador obj3 = new Trabajador("Jaime","Vargas Soliz",23,"Graña y Montero",5000);
        System.out.println(obj2.empresa);//obj2.nombre no se puede por que es privada :-)
        obj2.empresa = "CISCO";
        System.out.println(obj2.empresa);//como empresa es variable publica, se puede modifica
        
        /*Por los getters a pesar de ser privada*/
        System.out.println(obj2.getNombreCompleto());
        /**/
        obj3.setSueldo(5500.2f);
        System.out.println(obj3.SueldoBruto());
    }
    
}
