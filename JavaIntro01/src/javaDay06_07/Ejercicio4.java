//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
//por parámetro para que nos indique si es o no un número primo, 
//debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

package javaDay06_07;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un número");
        int n = scanner.nextInt();
        if (primo(n) == true){
            System.out.println("el número es primo");
        }else{
            System.out.println("el número no es primo");
        }
    }
    
    
    public static boolean primo(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
