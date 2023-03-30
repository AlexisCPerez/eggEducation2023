//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base 
//y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
//con los datos del Rectángulo dados por el usuario. También incluirá un método para 
//calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando 
//la base y la altura. Se deberán además definir los métodos getters, setters 
//y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package javaDay11_12_13_14_15_16.Entidades;

public class Rectangulo {
    private int base;
    private int altura;
    
    public void crearRectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public float calcularSuperficie(){
        return base * altura;
    }
    
    public int calcularPerimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujarRectangulo(){
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < base; j++) {
                    if (i == 0 || j == 0 || i == altura - 1 || j == base - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            System.out.println();
        }
    }
}
