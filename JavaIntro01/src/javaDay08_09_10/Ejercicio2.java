//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
//y le pida al usuario un número a buscar en el vector. 
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido
package javaDay08_09_10;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = scanner.nextInt();
        int contador = 0;

        int[] vector = new int[N];
        
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);        
        }
        System.out.println("Ingrese numero");
        int numero = scanner.nextInt();
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
//            System.out.println(vector[i]);
            if (vector[i] == numero){
                System.out.println("El numero " + numero + " se encuentra en la posicion " + i);
                contador++;
            }
        }
        System.out.println("Se encontro el numero " + contador + " veces");
    }
    
}
