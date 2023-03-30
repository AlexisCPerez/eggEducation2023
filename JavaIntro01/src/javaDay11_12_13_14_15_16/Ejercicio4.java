//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base 
//y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
//con los datos del Rectángulo dados por el usuario. También incluirá un método para 
//calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando 
//la base y la altura. Se deberán además definir los métodos getters, setters 
//y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("Ingrese la base y altura del rectangulo");
        rectangulo.crearRectangulo(scanner.nextInt(), scanner.nextInt());
        
        System.out.println("La superficie del rectangulo es: " + rectangulo.calcularSuperficie());
        System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
        
        rectangulo.dibujarRectangulo();
    }
    
}
