/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        int[] mi_jugada  = {12,45,9,10,23,17,12};
        Tinka mi_juego = new Tinka(mi_jugada);
        mi_juego.jugar();
    }
    
}
