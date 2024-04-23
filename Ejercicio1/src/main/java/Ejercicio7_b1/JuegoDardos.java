/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_b1;

/**
 *
 * @author majes
 */
public class JuegoDardos {
   public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Eva");
        Jugador jugador2 = new Jugador("Luis");

        while (true) {
            jugador1.lanzar();
            if (jugador1.getPuntuacion() == 0) {
                System.out.println("¡" + jugador1.getNombre() + " ha ganado!");
                break;
            }

            jugador2.lanzar();
            if (jugador2.getPuntuacion() == 0) {
                System.out.println("¡" + jugador2.getNombre() + " ha ganado!");
                break;
            }
        }
    }
}
