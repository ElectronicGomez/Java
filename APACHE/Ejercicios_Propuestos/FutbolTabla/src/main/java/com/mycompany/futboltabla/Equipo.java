/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.futboltabla;

/**
 *
 * @author u201623659
 */
//se usa implements Comparable<Clase> para comparar dos clases(dos objetos)
public class Equipo implements Comparable<Equipo>{
    public String pais;
    public int pj,pg,pe,pp,gf,gc,dif,pts;

    public Equipo(String pais) {
        this.pais = pais;
        this.pj = 0;
        this.pg = 0;
        this.pe = 0;
        this.pp = 0;
        this.gf = 0;
        this.gc = 0;
        this.dif = 0;
        this.pts = 0;
    }
   public void acumulaResultado(int gf, int gc){
       this.pj++;
       this.gf+=gf;
       this.gc+=gc;
       this.dif=this.gf-this.gc;
       if(gf>gc){
           this.pg++;
           this.pts+=3;
       }
       else if(gf==gc){
           this.pe+=1;
           this.pts+=1;
       }
       else this.pp+=1;
   }
   
   //molde para comparar dos clases(dos objetos) 
   @Override
   public int compareTo(Equipo obj){
       if(this.pts>obj.pts){
           return -1;
       }
       else if(this.dif>obj.dif){
           return -1;
       }
       else if(this.pts>obj.pts){
           return 1;
       }
       else if(this.dif>obj.dif){
           return 1;
       }
       return 0;
   }
}
