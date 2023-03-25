//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package javaDay08_09_10;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = scanner.nextInt();
        int[] vector = new int[n];
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() *99999);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
            if((vector[i] / 10) < 1 ){
                cont1++;
            }else if ((vector[i] / 10) < 10){
                        cont2++;
                        }
                    else if ((vector[i] / 10) < 100) {
                            cont3++;
                            }
                        else if ((vector[i] / 10 ) < 1000) {
                                cont4++;
                                }
                            else if ((vector[i] / 10) < 10000) {
                                    cont5++;
                                    }
            }
        System.out.println("");
        System.out.println("Numeros con 1 digito " + cont1);
        System.out.println("Numeros con 2 digito " + cont2);
        System.out.println("Numeros con 3 digito " + cont3);
        System.out.println("Numeros con 4 digito " + cont4);
        System.out.println("Numeros con 5 digito " + cont5);
    }
    
}
