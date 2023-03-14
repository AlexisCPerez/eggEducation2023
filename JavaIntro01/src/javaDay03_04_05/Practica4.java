//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
//salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
//El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
//pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
package javaDay03_04_05;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int nro, suma = 0;
         for (int i= 0; i< 20; i++){
            System.out.print("Ingrese un valor: ");
            nro = scanner.nextInt();
           if (nro == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            } else if (nro > 0) {
                suma += nro;
            } else {
                System.out.println("El número ingresado es negativo. No se sumará.");
            }
        }
        
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
    }
