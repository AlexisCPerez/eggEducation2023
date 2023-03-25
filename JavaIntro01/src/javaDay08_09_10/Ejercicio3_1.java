/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaDay08_09_10;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n= leer.nextInt();
        int[] vector=  new int [n];
        
        for (int i=0;i<n;i++){
            vector[i] = (int) (Math.random()*99999);
            System.out.println(vector[i]);
        }
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        int digitos;
        for(int i=0;i<n;i++){
            digitos = (int)(Math.log10(vector[i])+1);//googlear
            switch(digitos){
                case 1: 
                    cont1++;
                    break;
                case 2: 
                    cont2++;
                    break;
                case 3: 
                    cont3++;
                    break;
                case 4: 
                    cont4++;
                    break;
                case 5: 
                    cont5++;
                    break;
            }
        }
        System.out.println("De 1 digito hay: "+cont1);
        System.out.println("De 2 digitos hay: "+cont2);
        System.out.println("De 3 digitos hay: "+cont3);
        System.out.println("De 4 digitos hay: "+cont4);
        System.out.println("De 5 digitos hay: "+cont5);
    }
    
}
  