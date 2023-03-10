//Crear un programa que dado un número determine si es par o impar.
package javaDay03;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        float numero;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        numero = scanner.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("El numero es par");
            }else { 
                System.out.println("El numero es impar");
            }
        }
    }

