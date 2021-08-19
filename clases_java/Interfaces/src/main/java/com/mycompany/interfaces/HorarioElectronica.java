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
public  class HorarioElectronica implements Horarios{
    private boolean activo;
    @Override
    public int num_horas(int hora_fin, int hora_ini){
        return hora_fin-hora_ini;
    }
    @Override
    public void activar_docente(int iddocente, boolean activar){
        if(iddocente !=0){
            this.activo = activar;
        }
        else{
            this.activo = false;
        }
    }
    public String carrera(){
        return "Ing. Electrónica";
    }
    
    public String carrera(boolean num){
        if(num){
            System.out.println("Este horario es de Ing. Electrónica");
            
        }
        else{
            System.out.println("Este horario es de otra carrera");
        }
        return "OK";
    }
    
    public String carrera(int val){
        for(int i=0; i<val;i++){
            System.out.println("La carrera es electrónica por "+Integer.toString(i)+" vez");
        }
        return "OK";
    }
    
    public String carrera(float num){
        System.out.println("Este metodo carrera funciona con flotante");
        return "OK";
    }
    public static void Horario_dictado(){
        System.out.println("El horario de dictado en UPC electrónica es de 7:00am a 23:00");
    }
}
