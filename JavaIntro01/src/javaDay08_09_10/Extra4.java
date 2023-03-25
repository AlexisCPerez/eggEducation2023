//Los profesores del curso de programación de Egg necesitan llevar un registro de las 
//notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
//y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
//2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
//Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados 
//y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor 
//o igual al 7 de sus notas del curso.

package javaDay08_09_10;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] notas = new float[10][5];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println("El alumno " + (i + 1));
            for (int j = 0; j < 5; j++) {
                notas[i][j] = (int)(Math.random() * 10);
                
                if(j == 0){
                    notas[i][j] *= 0.1;
                }
                if(j == 1){
                    notas[i][j] *= 0.15;
                }
                if(j == 2){
                    notas[i][j] *= 0.25;
                }
                if(j == 3){
                    notas[i][j] *= 0.5;
                }
                if(j == 4){
                notas[i][4] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
                    System.out.println("Promedio: " + notas[i][4]);
                    if (notas [i][4] >= 7){
                        System.out.println("Has pasado este nivel");
                    } else {
                        System.out.println("Siga participando");
                    }
                }
                if (j < 4){
                    System.out.println(notas[i][j]);
                }
            }
        } 
        
    }  
}
