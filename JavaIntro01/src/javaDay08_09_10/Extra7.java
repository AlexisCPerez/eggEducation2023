
package javaDay08_09_10;

import java.util.Scanner;

public class Extra7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int n = scanner.nextInt();
        int[] vector = new int [n];
        int suma = 0;
        for (int i = 0; i<n; i++) {
            if (i == 0) {
                suma ++;
                vector[i] = suma;
            } else if (i == 1) {
                vector[i] = suma;
            } else {
                    vector[i] = vector[i-1] + vector[i-2];
                    }
        }
        
        for (int i=0; i<n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
    }
    
}
