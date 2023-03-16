//Diseñe una función que pida el nombre y la edad de N personas e imprima 
//los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package javaDay06_07;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        
        do{
            System.out.println("ingrese la edad y el nombre");
            int edad = scanner.nextInt();
            String nombre = scanner.next();
            respuesta = respuesta(edad,nombre);
        }while(respuesta == 1);
    }
       
    
    
    public static int respuesta(int edad, String nombre){
        Scanner scanner = new Scanner(System.in);
        int devolucion;
        
        System.out.println(nombre + " tiene " + edad+ " años");
        if (edad < 18){
            System.out.println(nombre + " es menor de edad");
        }else{
            System.out.println(nombre+ " es mayor de edad");
        }
        System.out.println("desea seguir ingresando personas? 1.SI 2.NO");
        devolucion = scanner.nextInt();
        return devolucion;
        
    }
}
