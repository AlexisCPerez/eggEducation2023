//Realice un programa que compruebe si una matriz dada es antisimétrica. 
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
//pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A 
//se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
package javaDay08_09_10;

//import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int matrizA[][] = {{0,-2,4},{2,0,2},{-4,-2,0}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
//                System.out.println("Ingrese un numero a la matriz");
//                matrizA[i][j]= leer.nextInt();    
                  System.out.print(matrizA[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizB[i][j]=-1*(matrizA[j][i]);
            }            
        }
        for(int i=0;i<3;i++){
            System.out.println("");
            for(int j=0;j<3;j++){
               if (matrizB[i][j] == (matrizA[i][j])){
                   System.out.print(matrizB[i][j]);
               } 
                   
            }
        }
        System.out.println("");
    }    
}