/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

/**
 *
 * @author u201623659
 */
public class Tinka {
    private  int[] num_clientes = new int[6];
    private int[] jug_ganadora = new int[6];
    
    public Tinka(int[] valores) throws Exception{
        int tam = 0;
        tam = valores.length;
        if(tam!=6){
            Exception ex = new Exception("La Tinka se juega con 6 bolillas!");
            throw ex;
        }
        else{
            for(int i=0;i<6;i++){
                this.num_clientes[i]=valores[i];
                this.jug_ganadora[i] = (int)(Math.random()*45);
            }
        }
    }
    public void jugar(){
        int aciertos = 0;
        System.out.println("La jugada ganadora es: ");
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(this.jug_ganadora[i]==this.num_clientes[j]) aciertos++;
            }
            System.out.printf("%d-",this.jug_ganadora[i]);
        }
        System.out.println(" ");
        switch(aciertos){
            case 6:
                System.out.println("Felicitaciones es usted millonario");
                System.out.println("Tuvo 6 aciertos");
                break;
            case 5:
                System.out.println("Felicitaciones ha ganado S/.5000.0");
                System.out.println("Tuvo 5 aciertos");
                break;
            case 4:
                System.out.println("Felicitaciones ha ganado S/.50.00");
                System.out.println("Tuvo 4 aciertos");
                break;
            case 3:
                System.out.println("Felicitaciones ha ganado S/.5.00");
                System.out.println("Tuvo 3 aciertos");
                break;
            case 2:
                System.out.println("Felicitaciones ha ganado una Tinka gratis");
                System.out.println("Tuvo 2 aciertos");
                break;
            case 1:
            case 0:
                System.out.println("Que piña. Vuelva a intentar!");
                //
                break;
                
        }
    }
    
    
}
