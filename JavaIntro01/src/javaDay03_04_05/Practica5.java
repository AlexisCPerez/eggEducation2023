//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
//e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

package javaDay03_04_05;

import java.util.Scanner;

public class Practica5 {

    public static void main(String[] args) {
        int num1,num2,num3,num4, j;
        String asterisco = "*";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los cuatro valores");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        
        System.out.print(num1 + " ");
        for (j = 0;j < num1; j++){
            System.out.print(asterisco);}
        System.out.println("");
        System.out.print(num2 + " ");
        for (j = 0;j < num2; j++){
            System.out.print(asterisco);}
        System.out.println("");
        System.out.print(num3 + " ");
        for (j = 0;j < num3; j++){
            System.out.print(asterisco);}
        System.out.println("");
        System.out.print(num4 + " ");
        for (j = 0;j < num4; j++){
            System.out.print(asterisco);}
        System.out.println("");
        }
    }
