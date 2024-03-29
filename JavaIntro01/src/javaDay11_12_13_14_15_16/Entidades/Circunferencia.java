//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real.
//A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
package javaDay11_12_13_14_15_16.Entidades;

public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunfencia(float radio){
        this.radio = radio;
    }
    
    public float area(){
        return (float) (Math.PI * (radio * radio));
    }
    
    public float perimetro(){
        return (float) (2 * Math.PI * radio);
    }
}
