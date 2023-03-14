//Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion 
//solicite numeros al usuario hasta que la suma de los numeros introducidos supere 
//el limite inicial.
package javaDay03_04_05;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int numeros,limite,suma;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero limite");
        limite = scanner.nextInt();
        suma = 0;
        while (suma <= limite){
            System.out.println("Ingrese numeros para superar el limite");
        numeros = scanner.nextInt();
        suma = suma + numeros;
        }
    }
    
}
