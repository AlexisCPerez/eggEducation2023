//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
//A continuación, se deben crear los siguientes métodos:
//Método constructor con todos los atributos pasados por parámetro.
//Método constructor sin los atributos pasados por parámetro.
//Métodos get y set.
//Método para crearOperacion(): que le pide al usuario los dos números y los guarda en 
//los atributos del objeto.
//Método sumar(): calcular la suma de los números y devolver el resultado al main.
//Método restar(): calcular la resta de los números y devolver el resultado al main
//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera 
//a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, 
//se hace la multiplicación y se devuelve el resultado al main
//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Operacion;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Operacion numero = new Operacion();
        System.out.println("Ingrese dos numeros enteros: ");
        numero.crearOperacion(scanner.nextInt(), scanner.nextInt());
        
        System.out.println("Menu de operaciones\n1-Suma. \n2-Resta. \n3-Multiplicacion. \n4-Division.");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println(numero.getNumero1() + " + " + numero.getNumero2() + " = " + numero.sumar());
                break;
            case 2:
                System.out.println(numero.getNumero1() + " - " + numero.getNumero2() + " = " + numero.restar());
                break;
            case 3: 
                System.out.println(numero.getNumero1() + " * " + numero.getNumero2() + " = " + numero.multiplicar());
                break;
            case 4:
                System.out.println(numero.getNumero1() + " / " + numero.getNumero2() + " = " + numero.dividir());
                break;
            default:
                System.out.println("Opcion no valida");
        }
    } 
}
