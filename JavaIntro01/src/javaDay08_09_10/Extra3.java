//Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
// por parámetro. Después haremos otra función o procedimiento que imprima el vector.
package javaDay08_09_10;

public class Extra3 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        int arreglo[] = {2,4,5,6,2};
        rellenar(arreglo,vector);
        mostrar(vector);
    }
    
    public static void rellenar(int arreglo[],int vector[]){
        System.arraycopy(arreglo, 0, vector, 0, 5);
//        for (int i = 0; i < 5; i++) {
//            vector[i] = arreglo[i];
//        }
    }
    
    public static void mostrar(int vector[]){
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }
    }
}

    