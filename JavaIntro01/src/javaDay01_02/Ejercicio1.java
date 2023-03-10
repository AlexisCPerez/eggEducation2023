
package javaDay01_02;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Ingrese los numeros");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("La suma de los numeros es " + (num1 + num2));
        
    }
}
