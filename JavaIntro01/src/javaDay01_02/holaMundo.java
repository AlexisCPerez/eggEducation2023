
package javaDay01_02;

import java.util.Scanner;

public class holaMundo {

    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Hola mundo! Soy " + nombre + " y estoy estudiando programacion");
    }
}
