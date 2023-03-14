//Escriba un programa que valide si una nota esta entre 0 y 10, sino esta entre 0 y 10 
//la nota se pedirá de nuevo hasta que la nota sea correcta.

package javaDay03_04_05;

import java.util.Scanner;


public class Practica3 {

    public static void main(String[] args) {
        int nota;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = scanner.nextInt();
        }while(nota < 0 || nota > 10);
        
        System.out.println("La nota " + nota + " es correcta" );
    }
}
