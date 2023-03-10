
package javaDay01_02;

import java.util.Scanner;


public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los grados centigrados");
        float c = leer.nextFloat();
        float f = 32 + (9 * c / 5);
        System.out.println("F° = " + f);
        
    }
    
}
