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
public class Geometria {
    public static float pi = 3.141516f;
    
    public static float areaCirculo(float radio){
        return pi*radio*radio;
    }
    public static float areaRectangulo(float lado, float ancho){
        return lado*ancho;
    }
    public static float areaCuadrado(float lado){
        return lado*lado;
    }
    
    
    
    
}
