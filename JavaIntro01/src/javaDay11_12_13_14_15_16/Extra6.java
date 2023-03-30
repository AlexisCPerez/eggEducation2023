//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
//Luego, crea un método "calcular_aumento" que calcule el aumento salarial de 
//un empleado en función de su edad y salario actual. El aumento salarial debe
//ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de
//30 años.
package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Empleado;

public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre, edad y salario");
        Empleado empleado = new Empleado(leer.next(), leer.nextInt(), leer.nextFloat());
        empleado.calcular_aumento();
    }
    
}
