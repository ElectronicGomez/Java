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
public interface Horarios {
    //Variables que sea static y final
    public static final String INSTITUCION="UPC";
    
    //Dentro de una interface solo puede ir la declaracin de metodos
    public int num_horas(int hora_fin, int hora_ini);
    public void activar_docente(int iddocente, boolean activar);

}
