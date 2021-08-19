/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo6;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Colecciones
        int val=10;
        int[] numeros = new int[]{1,45,-96,12,18,-1};
        //int[] numeros = {1,45,96,12,18,-1};
        int[] valores = new int[val];
        String[] nombres = new String[]{"Juan","Jose","Fiorella","Ricardo","Benghy","Maikol"};
        //String[] nombres = {"Juan","Jose","Fiorella","Ricardo","Benghy","Maikol"};
        for(int i=0;i<6;i++){
            System.out.println(numeros[i]);
            System.out.println(nombres[i]);
            valores[i]=numeros[i];
            if(numeros[i]==-96){
                val =i;
            }
        }
        System.out.println("La posición de -96 es "+Integer.toString(val));
        
        
        
        Integer[] seq = {1,23,4,5,6,67,7};//objetvo
        System.out.println(Integer.toString(seq.length));
        
        
        String mensaje = "Universidad Peruana de Ciencias Aplicadas";
        val = mensaje.indexOf("de");
        System.out.println(val);
        
        int[][] matriz = new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                matriz[i][j]=seq[i];
            }
        }
    }
    
}
