//Una obra social tiene tres clases de socios:
//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
//los mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real 
//que represente el costo del tratamiento (previo al descuento) y determine 
//el importe en efectivo a pagar por dicho socio.

package javaDay03_04_05;

import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su tipo de socio A|B|C");
        String operacion = scanner.next();
        
        System.out.println("Ingrese el monto a pagar");
        int monto = scanner.nextInt();
        switch (operacion){
            case "A": System.out.println("Usted debe abonar " + (monto*0.5));
            break;
            case "B": System.out.println("Usted debe abonar " + (monto*0.65));
            break;
            case "C": System.out.println("Usted debe abonar " + (monto));
            break;
        }
    }
    
}
