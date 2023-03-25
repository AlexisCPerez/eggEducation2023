//Escriba un programa que averigüe si dos vectores de N enteros son iguales 
//(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
package javaDay08_09_10;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimension de los vectores");
        int n = scanner.nextInt();
        System.out.println("");
        int[] vector = new int[n];
        int[] vector2 = new int[n];
        
            for (int i = 0; i < n; i++) {
                vector[i] = (int) (Math.random() * 2);
                vector2[i] = (int) (Math.random() * 2);
                System.out.println("vector 1 en la posicion " + i + " es: " + vector[i]);
                System.out.println("vector 2 en la posicion " + i + " es: " + vector2[i]);
                System.out.println("");
                if (vector[i] != vector2[i]){
                    System.out.println("Los numeros no son iguales");
                    break;
                } else if (vector[i] == vector2[i] && i == n - 1){
                    System.out.println("Todos los numeros son iguales");
                }
            }
    }
    
}
