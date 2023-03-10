//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
//Nota: investigar la funcion Substring y equals() de Java.
package javaDay03;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        String frase,letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        frase = leer.next();
        letra = frase.substring(0,1);
        if (letra.equals("A")){
            System.out.println("Es correcto");
            } else {
            System.out.println("Es incorrecto");
        }
    }
}
