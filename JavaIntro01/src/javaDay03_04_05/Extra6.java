//Leer la altura de N personas y determinar el promedio de estaturas 
//que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package javaDay03_04_05;

import java.util.Scanner;

public class Extra6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas");
        int personas = scanner.nextInt();
        float suma = 0;
        float suma2 = 0;
        float personas2 = 0;
        float estatura = 0;
        
        for(int i = 0; i < personas; i++){
            System.out.println("Ingrese su estatura");
            estatura = scanner.nextFloat();
            
            suma = estatura + suma;
            if (estatura < 1.60){
                suma2 = estatura + suma2;
                personas2++;
            }
        }
        System.out.println("El promedio de las estaturas es: " + (suma / personas));
        System.out.println("El promedio de las estaturas por debajo de 1.6m es " + (suma2 / personas2));
    }
}
