//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
//Nota: investigar la función equals() en Java.
package javaDay03_04_05;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String palabra;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("Ingrese una palabra");
        palabra= leer.next();
        
        if (palabra.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println ("es incorrecto");
    }
  }  
}
