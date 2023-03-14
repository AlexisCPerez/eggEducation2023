//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
package javaDay03_04_05;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = scanner.next();
        
        if (!letra.equals("a") && !letra.equals("e") && !letra.equals("i") && !letra.equals("o") && !letra.equals("u")){
            System.out.println("Esta letra NO es una vocal");
        }
        }
    }
