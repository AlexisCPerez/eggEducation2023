//Implementar un programa que le pida dos números enteros al usuario y 
//determine si ambos o alguno de ellos es mayor a 25.

package javaDay03_04_05;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num1 > 25){
            System.out.println("El primer numero es mayor de 25");
        }
        if (num2 > 25){
            System.out.println("El segundo numero es mayor de 25");
        }
    }
    
}
