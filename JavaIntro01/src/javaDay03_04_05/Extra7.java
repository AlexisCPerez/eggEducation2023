//Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
//y el promedio de n números (n>0). El valor de n se solicitará al principio del programa 
//y los números serán introducidos por el usuario. Realice dos versiones del programa, 
//una usando el bucle “while” y otra con el bucle “do - while”.
package javaDay03_04_05;

import java.util.Scanner;

public class Extra7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int max = 0, min = 0, n, i, num;
        float prom = 0;
        do {
            System.out.println("¿Cuantos números?");
            n = scanner.nextInt();
            i = n;
        } while (n <= 0);
        
        System.out.println("Ingrese números");
        while (i >= 1) {
            num = scanner.nextInt();
            if (i != n) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                max = num;
                min = num;
            }
            prom = prom + num;
            i--;
        }
        prom = prom / n;
        System.out.println("Menor número: " + min + "\nMayor número: " + max + "\nPromedio: " + prom);
    }
}
    
    

