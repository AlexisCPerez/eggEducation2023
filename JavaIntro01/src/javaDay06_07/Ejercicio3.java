//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
//La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
//será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

package javaDay06_07;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros y la moneda a la que desee convertirlos");
        int euros = scanner.nextInt();
        String moneda = scanner.next();
        conversionEuros(euros,moneda);
    }
    
    public static void conversionEuros(int euros,String moneda){
        if (moneda.equalsIgnoreCase("libras")){
            int libras = (int)(euros*0.86);
            System.out.println("€" + euros + " equivale a " + libras + " libras" );
        }else if(moneda.equalsIgnoreCase("yenes")){
            int yenes = (int)(euros*129.852);
            System.out.println("€" + euros + " equivale a " + yenes + " yenes" );
        }else if(moneda.equalsIgnoreCase("dolares")){
            int dolares = (int)(euros*1.28611);
            System.out.println("€" + euros + " equivale a " + dolares + " dolares" );
        }
    }
}