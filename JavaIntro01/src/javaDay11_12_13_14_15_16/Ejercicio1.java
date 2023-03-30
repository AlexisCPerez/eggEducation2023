//Crear una clase llamada Libro que contenga los siguientes atributos: 
//ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
//los datos al usuario y luego informar mediante otro método el número de ISBN, 
//el título, el autor del libro y el número de páginas.
package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Libro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Libro libro = new Libro();
        
        System.out.println("Ingrese el titulo, el numero ISBN, el autor y la cantidad de paginas");
        libro.ingresarDatos(scanner.nextLine(),scanner.nextInt(),scanner.next(),scanner.nextInt());
        
        System.out.println(libro.toString());
    }
    
}
