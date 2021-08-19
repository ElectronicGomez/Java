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
public class Medicina implements Horarios{
    private boolean activo;
    @Override
    public int num_horas(int hora_fin, int hora_ini){
        return hora_fin-hora_ini+(hora_fin-hora_ini)*15;
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
        return "Medicina";
    }
    
    

    
}
