//Crea una clase "Rectángulo_1" que tenga atributos "lado1" y "lado2" y 
//un método "calcular_area" que calcule y devuelva el área del rectángulo. 
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 e 
//imprime el área del rectángulo.
package javaDay11_12_13_14_15_16.Entidades;

public class Rectangulo_1 {
    private final int lado1;
    private final int lado2;

    public Rectangulo_1(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcular_rectangulo() {
        int area = lado1 * lado2;
        System.out.println("El área de un rectangulo de " + lado1 + "x" + lado2 + " es: " + area);
    }
}
