//Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
//Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
//por pantalla que diga “CORRECTO”, en caso contrario, 
//se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Lenght() en Java.

package javaDay03_04_05;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        String frase;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrece una palabra: ");
        frase= leer.next();
        if (frase.length()==8){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
            
        }
    }
    }
    

