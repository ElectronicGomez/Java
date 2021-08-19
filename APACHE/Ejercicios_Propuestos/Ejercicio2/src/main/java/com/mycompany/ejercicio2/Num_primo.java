/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author u201623659
 */
public class Num_primo {
    public static boolean EsPrimo(int numero){
        List<Integer> divisores = new ArrayList<Integer>();
        int i=2;
        while(i<=numero){
            if(numero%i==0){
                divisores.add(i);
            }
            i++;
        }
        if(divisores.size()==1) return true;
        else return false;
    }
    public static List<Integer> divisores(int numero){
        List<Integer> divisores = new ArrayList<Integer>();
        int i=2;
        while(i<=numero){
            if(numero%i==0){
                divisores.add(i);
            }
            i++;
        }
        return divisores;
    }
    
}
