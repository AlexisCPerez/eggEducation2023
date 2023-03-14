//Dado un tiempo en minutos, calcular su equivalente en días y horas. 
//Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
//1 día, 2 horas.
package javaDay03_04_05;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int min = scanner.nextInt();
        int days = 0;
        int hours = 0;
        while(min >=60){
            if (min>=1440){
                days++;
                min = min -1440;
            } else {
                hours++;
                min = min-60;
            }
        }
        System.out.println(days + " dia/s " + hours + " hora/s");
    }
    
}
