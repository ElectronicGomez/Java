/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String fecha_ini;
        String fecha_fin;
        Scanner teclado = new Scanner(System.in);
        
        //fecha = 14-10-2020 18:49:40
        System.out.println("Utilice el formato dd-MM-yyyy HH-mm-ss");//HH->24h
        
        System.out.println("Ingrese fecha y hora inicial en el formato: ");
        fecha_ini = teclado.nextLine();
        
        System.out.println("Ingrese fecha y hora final en el formato: ");
        fecha_fin = teclado.nextLine();
        
        GregorianCalendar jcal1 = new GregorianCalendar();
        GregorianCalendar jcal2 = new GregorianCalendar();
        
        //jcal1.set(year, month(0-11), date, hourofdate, minutes, seconds);
        jcal1.set(Integer.parseInt(fecha_ini.substring(6,10)),//6-9(siempreunomenos)
                  Integer.parseInt(fecha_ini.substring(3,5))-1,//siempre en el formato de 0-11
                  Integer.parseInt(fecha_ini.substring(0, 2)),
                  Integer.parseInt(fecha_ini.substring(11, 13)),
                  Integer.parseInt(fecha_ini.substring(14, 16)),
                  Integer.parseInt(fecha_ini.substring(17, 19)));
        
        
        jcal2.set(Integer.parseInt(fecha_fin.substring(6,10)),//6-9(siempreunomenos)
                  Integer.parseInt(fecha_fin.substring(3,5))-1,//siempre en el formato de 0-11
                  Integer.parseInt(fecha_fin.substring(0, 2)),
                  Integer.parseInt(fecha_fin.substring(11, 13)),
                  Integer.parseInt(fecha_fin.substring(14, 16)),
                  Integer.parseInt(fecha_fin.substring(17, 19)));
        
        
        //.getTime().getTime()->milisegundos
        long diferencia = jcal2.getTime().getTime() - jcal1.getTime().getTime();
        
        double minutos = diferencia/(1000*60);
        System.out.printf("El numero de minutos entre "+fecha_fin+" y "+fecha_ini+
                           " es de %2.2f\n",minutos);
        
        //LocalDate fecha_hoy = LocalDate.now();
        //LocalTime hora_hoy = LocalTime.now();

        //System.out.println(fecha_hoy);
        //System.out.println(hora_hoy);
        
        
        /*Para definir un formato en específico:
            yyyy-MM-dd	"1988-09-29"	
            dd/MM/yyyy	"29/09/1988"	
            dd-MMM-yyyy	"29-Sep-1988"	
            E, MMM dd yyyy	"Thu, Sep 29 1988"
        */
        LocalTime hora_hoy = LocalTime.now();
        
        DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("HH:mm:ss");
        int hora = hora_hoy.getHour();
        int minuto = hora_hoy.getMinute();
        int segundos = hora_hoy.getSecond();
        int i=0;
        while(i<200){
            if(segundos<59){
                segundos++;
            }
            else{
                segundos=0;
                if(minuto<59){
                    minuto++;
                }
                else{
                    minuto=0;
                    hora++;
                }
            }
            Thread.sleep(1000);
            i++;
            System.out.println(hora+":"+minuto+":"+segundos);
        }

    }
    
}
