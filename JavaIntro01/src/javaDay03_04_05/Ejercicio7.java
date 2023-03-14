//Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
//este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un 
//formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
//ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
//“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no 
//respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java Substring(), Length(), equals().
package javaDay03_04_05;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int correcto = 0;
        int incorrecto = 0;
        String code;
        do{
            System.out.println("Introduzca un codigo"); 
            code = leer.next();
            if (code.length() == 5&& code.substring(0,1).equals("x") && code.substring(4,5).equals("o")){
            correcto++;
            }else{
            incorrecto++;
            }               
        } while  (code.equals("&&&&&") == false);
        System.out.println("La cantidad de codigos correctos son: " + correcto);
        System.out.println("La cantidad de codigos incorrectos son: " + (incorrecto-1));
    } 
}