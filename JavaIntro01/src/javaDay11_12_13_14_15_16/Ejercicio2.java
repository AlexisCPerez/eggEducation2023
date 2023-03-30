//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real.
//A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

package javaDay11_12_13_14_15_16;

import javaDay11_12_13_14_15_16.Entidades.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float radio = 0;
        
        Circunferencia circulo = new Circunferencia(radio);
        
        System.out.println("Ingrese el radio de la circunferencia");
        circulo.crearCircunfencia(scanner.nextInt());
        
        System.out.println("El perimetro de la circunferencia es: " + circulo.perimetro());
        System.out.println("El area de la circunferencia es: " + circulo.area());
    }
    
}
