//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
//la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
//cambiando sus filas por columnas (o viceversa).
package javaDay08_09_10;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                
                matriz[i][j]=(int) (Math.random()*9);
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
                
    }
}
   