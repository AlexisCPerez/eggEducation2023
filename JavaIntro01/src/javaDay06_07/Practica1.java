//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
//terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: 
//cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
//(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
//Utilice la estructura “según” para la transformación. 
//Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

package javaDay06_07;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        codigo(frase);
    }
    
    public static void codigo(String frase){
        String frase2 = "";
        for(int i = 0; i <= frase.length()-1; i++){
        int j = i + 1;
            
            switch(frase.substring(i,j)){
                case "A":
                case "a": frase2 = frase2.concat("@");
                break;
                case "E":
                case "e": frase2 = frase2.concat("#");
                break;
                case "I":
                case "i": frase2 = frase2.concat("$");
                break;
                case "O":
                case "o": frase2 = frase2.concat("%");
                break;
                case "U":
                case "u": frase2 = frase2.concat("*");
                break;
                default: frase2 = frase2.concat(frase.substring(i,j));
            }
        
    }
        System.out.println(frase);
        System.out.println(frase2);
}
}
