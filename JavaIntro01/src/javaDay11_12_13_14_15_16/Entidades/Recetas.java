
package javaDay11_12_13_14_15_16.Entidades;

import java.util.Scanner;

public class Recetas {
    Scanner leer = new Scanner(System.in);

    private String nombre;
    private String[] ingredientes = new String[3];

    public Recetas(String nombre) {
        this.nombre = nombre;
    }

    public void setIngre() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el ingrediente " + (i + 1) + " de la receta " + nombre);
            this.ingredientes[i] = leer.next();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void getIngredientes() {
        System.out.println("La receta " + nombre + " contiene los ingredientes:");
        for (int i = 0; i < 3; i++) {
            System.out.println(this.ingredientes[i]);
        }
    }
    
    public boolean buscarIng(String _ingre){
        for (int i = 0; i < 3; i++) {
            if (this.ingredientes[i].equalsIgnoreCase(_ingre)) {
                return true;
            }
        }
        return false;
    }
}
