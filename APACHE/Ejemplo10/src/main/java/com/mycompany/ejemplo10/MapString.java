/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author u201623659
 */
public class MapString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String,String> usuarios = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de los alumnos: ");
        while(true){
            System.out.println("Ingrese el usuario: ");
            String usuario = scanner.nextLine();
            if(usuario.equals("")) break;
            System.out.println("Ingrese su clave: ");
            String clave = scanner.nextLine();
            usuarios.put(clave, usuario);
            //usuarios.put(usuario, clave);//si se ingresa de esta forma, con usuarios.get(usuario) se obtiene la clave
        }
        System.out.println("Ingrese una clave: ");
        String clave = scanner.nextLine();
        String usuarioelegido = usuarios.get(clave);
        System.out.println("El usuario con la clave "+clave+" es "+usuarioelegido);
        
        
    }
    
}
