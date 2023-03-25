//Realizar un programa que llene una matriz de tamaño NxM 
//con valores aleatorios y muestre la suma de sus elementos.
package javaDay08_09_10;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de la matriz");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int suma = 0;
        
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]= (int)(Math.random()*9);
                System.out.print(matriz[i][j]);
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los numeros es: " + suma);
    } 
}
