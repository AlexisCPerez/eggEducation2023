//Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
//Se deberá definir además dos constructores: uno vacío que inicializa el título y 
//el autor a cadenas vacías y otro que reciba como parámetros el título y el autor 
//de la canción. 
//Se deberán además definir los métodos getters y setters correspondientes.
package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Cancion;

public class Extra1 {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        
        ingresar(cancion);
        mostrar(cancion);
    }
    
    public static void ingresar(Cancion cancion) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el nombre del Autor: ");
        cancion.setAutor(leer.next());
        System.out.print("Ingrese el nombre de la canción: ");
        cancion.setTitulo(leer.next());
    }
    
    public static void mostrar(Cancion cancion) {
        System.out.println("Autor: " + cancion.getAutor() + "\nTitulo: " + cancion.getTitulo());
    }
    
}
