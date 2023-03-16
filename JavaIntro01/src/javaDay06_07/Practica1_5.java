
package javaDay06_07;

import java.util.Scanner;

public class Practica1_5 {

    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String phrase = input.nextLine();
        
        String exit = NewPhrase(phrase);
        
        System.out.println("Texto códificado: " + exit);
        
    }
    
    public static String NewPhrase(String phrase) {
       String result = "";
        
       for (char c : phrase.toCharArray()) {
           switch (c){
                 case 'a':
                case 'A':
                    result = result.concat("@");
                    break;
                case 'e':
                case 'E':
                    result = result.concat("#");
                    break;
                case 'i':
                case 'I':
                    result = result.concat("$");
                    break;
                case 'o':
                case 'O':
                    result = result.concat("%");
                    break;
                case 'u':
                case 'U':
                    result = result.concat("*");
                    break;
                default:
                    result = result.concat(Character.toString(c));
                    break;
           }
       } 
       
        
        return result;
                
    
    }
    
}
