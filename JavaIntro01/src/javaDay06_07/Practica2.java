//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que 
//el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
package javaDay06_07;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos números");
        esMultiplo(scanner.nextInt(),scanner.nextInt());
    }
    
    public static void esMultiplo(int num1, int num2){
        if (num2 % num1 == 0){
            System.out.println("el primer número es multiplo del segundo");
        }else{
            System.out.println("el primer número no es multiplo del segundo");
        }
    }
}
