//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
//Crear un programa que permita introducir un cuadrado por teclado y determine 
//si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
//son correctos, es decir, están entre el 1 y el 9.
package javaDay08_09_10;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int [3][3];
        int diagonal = 0;
        int horizontal = 0;
        int vertical = 0;
        int vertical2 = 0;
        int vertical3 = 0;
        int contador = 1;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese valores del 1 al 9! " + contador + " de 9");
                    matriz[i][j] = scanner.nextInt();
                    if (matriz[i][j] <= 0 || matriz[i][j] >= 10){
                        System.out.println("Numero incorrecto");
                    } else {
                        contador++;
                    }
                } while (matriz[i][j] <= 0 || matriz[i][j] >= 10);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j){
                    diagonal += matriz[i][j];
                }
                if (j == 0){
                    horizontal += matriz[i][j];
                }
                if (i == 0){
                    vertical += matriz[i][j];
                }
                if (i == 1){
                    vertical2 += matriz[i][j];
                }
                if (i == 2){
                    vertical3 += matriz[i][j];
                }
            }
        }
        
        if (diagonal == horizontal && horizontal == vertical && vertical == vertical2 && vertical2 == vertical3 && vertical3 == diagonal){
            System.out.println("Sudoku!");
                } else {
                    System.out.println("La matriz no es magica");
        }
    }   
}
