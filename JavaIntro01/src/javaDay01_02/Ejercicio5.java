
package javaDay01_02;

import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número:");
        int n = leer.nextInt();
        double raiz = Math.sqrt(n);
        float raiz2 = (float) Math.sqrt(n);
        System.out.println("Doble: " + 2*n + ", Triple: " + 3*n + ", Raiz: " + raiz + ", Raiz: " + raiz2);
    }
    
}
