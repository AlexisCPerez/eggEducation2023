//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
//con los valores ingresados por el usuario.
package javaDay08_09_10;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        int suma = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese numeros para sumarlos");
            int num = scanner.nextInt();
            suma += num;
        }
        
        System.out.println("La suma de los numeros es " + suma);
    }
}
