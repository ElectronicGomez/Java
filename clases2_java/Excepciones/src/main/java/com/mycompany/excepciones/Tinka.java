/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

/**
 *
 * @author ASUS
 */
public class Tinka {
    private int[] num_cliente = new int[6];
    private int[] jug_ganadora = new int[6];
    
    public Tinka(int[] valores)throws Exception{
        int tam = 0;
        
        int aux2 = 0;
        
        tam = valores.length;
        if(tam!=6){
            Exception ex = new Exception("La tinka se juega con 6 bolillas");
            throw ex;
        }
        else{
            for(int i=0;i<6;i++){
                this.num_cliente[i] = valores[i];
                aux2 = (int)(Math.random()*45)+1;
                this.jug_ganadora[i]=aux2;
                
            }
        }
    }
    public void jugar(){
        int aciertos = 0;
        int[] bolillas = new int[6];
        System.out.println("La jugada ganadora es: ");
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(this.jug_ganadora[i]==this.num_cliente[j])
                {
                    bolillas[i] = this.jug_ganadora[i];
                    aciertos++;
                    
                    
                }
            }
            
            System.out.printf("%d-",this.jug_ganadora[i]);
        }
        System.out.println(" ");
        switch(aciertos){
            case 6:
                System.out.println("Felicitaciones es usted millonario!!");
                System.out.println("Tuvo 6 aciertos");
                break;
            case 5:
                System.out.println("Felicitaciones ha ganado S/.5000");
                System.out.println("Tuvo 5 aciertos");
                break;
            case 4:
                System.out.println("Felicitaciones ha ganado S/.50");
                System.out.println("Tuvo 4 aciertos");
                break;
            case 3:
                System.out.println("Felicitaciones ha ganado S/.5");
                System.out.println("Tuvo 3 aciertos");
                break;
            case 2:
                System.out.println("Felicitaciones ha ganado una tinka gratis");
                System.out.println("Tuvo 2 aciertos");
                break;
            case 1:
            case 0:
                System.out.println("Que piña, vuelva a intentarlo");
                System.out.println("Tuvo "+Integer.toString(aciertos)+" aciertos");
                break;
                
        }
        
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++){
                if(bolillas[i]==this.jug_ganadora[j]){
                    System.out.println("Bolilla acertada: "+Integer.toString(bolillas[i]));
                }
            }
            
        }
        
    }
}
