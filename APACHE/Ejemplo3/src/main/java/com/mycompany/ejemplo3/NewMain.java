/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo3;

/**
 *
 * @author u201623659
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5, b = 97, c = 8;
        c = a+b;
        c=a-b;
        c=a*b;
        c=a/b;
        c=a++;
        c=a%b;
        c=a++;//c=5 y a =6
        c=++a;//c=7 y a = 6
        c=b--;
        byte num1=0b00110011, num2 = (byte)0b11001100, num3= (byte)0b11111100;//bit mas significativo en 0 ya que si es uno es negativo
        num3 = (byte)(num1  & num2);//AND
        System.out.println(Byte.toString(num3));
        System.out.printf("OP AND %h\n", num3);//hexadecimal
        num3 = (byte)(num1 | num2);//OR
        System.out.println(Byte.toString(num3));
        System.out.printf("OP OR %h\n", num3);
        num3 = (byte)(num1 ^ num2);//XOR
        System.out.println(Byte.toString(num3));
                System.out.printf("OP XOR %h\n", num3);;
        num3 = (byte)(~num1);//NOT
        System.out.println(Byte.toString(num3));
        System.out.printf("OP NOT %h\n", num3);
        
        
        Integer aa=5;//objeto de tipo Integer
        aa +=a;
        System.out.println(aa.toString());
        System.out.printf("OP AND %h", aa);
        
        
        boolean val;
        val = a==b;
        val = a!=b;
        val =a>b;
        val = a>=b;
        val = a <b;
        val = a<=b;
        val = a>b && b==a; //ANSI C => val 800 && -96
        val = a>b || b==a;
        val = !(a>b);
        a = (int)Math.pow(a, b);
    }
    
}
