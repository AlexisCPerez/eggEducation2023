//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
//los muestre por pantalla en orden descendente.
package javaDay08_09_10;

public class Ejercicio1 {

    public static void main(String[] args) {
       int N = 100;
       int[] arreglo = new int[N];
       
        for (int i = 0; i < N; i++) {
            arreglo [i] = i + 1; 
        }
        
        for (int i = N - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
    
}
