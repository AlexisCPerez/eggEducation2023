
package javaDay01_02;

import java.util.Scanner;

public class Practica2 {


    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Ingrese palabra");
    String palabra = leer.nextLine();
   
    if (palabra.length() == 4 ) {
        palabra = palabra.concat("!");
        System.out.println(palabra);
    } else {
        palabra = palabra.concat("?");
        System.out.println(palabra);
    }
    }
}   
