//Realizar un programa que pida dos números enteros positivos por teclado y 
//muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
//el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
//El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
//si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
//se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa
//(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve
//a mostrar el menú.
package javaDay03_04_05;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num1,num2;
        int opcion;
        String confirmacion = "N";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        do {
        System.out.println("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir o 5 para salir");
        opcion = scanner.nextInt();
        switch(opcion){
            case 1: System.out.println("La suma de los numeros es " + (num1 + num2));
            continue;
            case 2: System.out.println("La resta de los numeros es " + (num1 - num2));
            continue;
            case 3: System.out.println("La multiplicacion de los numeros es " + (num1 * num2));
            continue;
            case 4: System.out.println("La division de los numeros es " + (num1 / num2));
            continue;
            case 5: System.out.println("Esta seguro que desea salir? (S/N)");
                confirmacion = scanner.next();
                if (confirmacion.equals("S")){
                    break;         
                }    
                }
        }while(confirmacion.equals("N"));
        
    }
    }

