/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class GrupoCopaAmerica {
    private String pais1, pais2, pais3, pais4;
    private List<Equipo> grupo = new ArrayList<Equipo>();
    
    //Constructor
    
    public GrupoCopaAmerica(String pais1, String pais2, String pais3, String pais4){
        this.pais1 = pais1;
        this.pais2 = pais2;
        this.pais3 = pais3;
        this.pais4 = pais4;
    }
    
    private void generaResultados(){
        Equipo pais1 = new Equipo(this.pais1);
        Equipo pais2 = new Equipo(this.pais2);
        Equipo pais3 = new Equipo(this.pais3);
        Equipo pais4 = new Equipo (this.pais4);
        
        /* El grupo tiene 4 paises, cada fecha son 2 partidas, en total son
        3 fechas, lo cual me dará un total de 6 partidos y en 6 partidos habrá
        12 scores 
        */
        int [] goles = new int[12];
        for(int i=0;i<12;i++){
            goles[i]=(int)(Math.random()*10); //Goles de 0 a 9
        }
        //Fecha 1:
        pais1.acumulaResultado(goles[0], goles[1]);
        pais4.acumulaResultado(goles[1], goles[0]);
        pais2.acumulaResultado(goles[2], goles[3]);
        pais3.acumulaResultado(goles[3], goles[2]);
        //Fecha 2:
        pais1.acumulaResultado(goles[4], goles[5]);
        pais3.acumulaResultado(goles[5], goles[4]);
        pais2.acumulaResultado(goles[6], goles[7]);
        pais4.acumulaResultado(goles[7], goles[6]);
        //Fecha 3:
        pais1.acumulaResultado(goles[8], goles[9]);
        pais2.acumulaResultado(goles[9], goles[8]);
        pais3.acumulaResultado(goles[10], goles[11]);
        pais4.acumulaResultado(goles[11], goles[10]);
        
        grupo.add(pais1);
        grupo.add(pais2);
        grupo.add(pais3);
        grupo.add(pais4);       
                              
    }
    
    public void mostrarTabla(){
        generaResultados();
        System.out.println("Puesto      Pais        PJ   PG   PE  PP  GF  GC  DIF  PTS");
        Collections.sort(grupo);
        for(int i=0;i<grupo.size();i++)
        {
            System.out.println(Integer.toString(i+1)+") "+
                    grupo.get(i).pais+" "+grupo.get(i).pj+" "+
                    grupo.get(i).pg+" "+grupo.get(i).pe+" "+
                    grupo.get(i).pp+" "+grupo.get(i).gf+" "+
                    grupo.get(i).gc+" "+grupo.get(i).dif+" "+
                    grupo.get(i).pts+" ");
        }
        
    }
}
