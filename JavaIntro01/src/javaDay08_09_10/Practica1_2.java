//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
//de equipo y define su tipo de dato de tal manera que te permita alojar sus
//nombres más adelante.

package javaDay08_09_10;

import java.util.Scanner;

public class Practica1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] equipo = new String[10];
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Nombre:");
            equipo[i] = sc.nextLine();
          
        }
        
//        for (int i = 0; i < equipo.length; i++) {
//            System.out.println("["+equipo[i]+"]");
//            
//        }
        
        for(String elemento:equipo){
            System.out.print(elemento);
        }
        
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 6;
                System.out.print(matriz[i][j]);
                 }
            System.out.println(" ");
        }
    
        }
    }
    

