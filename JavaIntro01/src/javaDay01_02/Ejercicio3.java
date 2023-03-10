
package javaDay01_02;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase:");
        String palabra = leer.nextLine();
        System.out.println("Minusculas: " + palabra.toLowerCase());
        System.out.println("Mayuscualas: " + palabra.toUpperCase());
    }
    
}
