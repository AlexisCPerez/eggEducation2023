//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función 
//para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
package javaDay06_07;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("la suma de los numeros es: " + sumar(num1,num2));
        System.out.println("la resta de los numeros es: " + restar(num1,num2));
        System.out.println("la division de los numeros es: " + dividir(num1,num2));
        System.out.println("la multiplicacion de los numeros es: " + multiplicar(num1,num2));
            
    }
    
    public static int sumar(int num1, int num2) {
    	int suma;
    	suma = num1 + num2;
    	return suma;
    }
    
    public static int restar(int num1, int num2){
       int resta;
       resta=num1-num2;
       return Math.abs(resta);
       
    }
    
    public static double dividir(double num1, double num2){
        double division;
        division=num1/num2;
        return division;
    }
    
    public static int multiplicar(int num1, int num2){
        int multi;
        multi= num1*num2;
        return multi;
    }

    }
