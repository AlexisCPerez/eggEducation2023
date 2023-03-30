//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
//jugadores jugar un juego de adivinanza de números. El primer jugador elige un
//número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
//número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
//después de cada intento. El juego termina cuando el segundo jugador adivina 
//el número o se queda sin intentos. Registra el número de intentos necesarios
//para adivinar el número y el número de veces que cada jugador ha ganado.
package javaDay11_12_13_14_15_16;

import java.util.Scanner;
import javaDay11_12_13_14_15_16.Entidades.Juego;

public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Juego game = new Juego();
        int c = 0;
        
        System.out.print("Jugador 1: ");
        game.setNum(leer.nextInt());
        while (c < 3) {
            System.out.print("Jugador 2 ingrese número: ");
            game.setJugador2(leer.nextInt());
            c += game.iniciarJuego();
        }
    }
}
