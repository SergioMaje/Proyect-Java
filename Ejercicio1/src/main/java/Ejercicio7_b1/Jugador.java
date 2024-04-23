/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_b1;

import java.util.Random;

/**
 *
 * @author majes
 */
public class Jugador {
  private final String nombre;
    private int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 501; // Cada jugador comienza con 501 puntos
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void lanzar() {
        Random random = new Random();
        int totalTirada = 0;

        System.out.println("Ha Tirado " + nombre + ":");

        for (int i = 1; i <= 3; i++) {
            int num = random.nextInt(21); // Genera un número entre 0 y 20
            int tipo = random.nextInt(3) + 1; // Genera un número entre 1 y 3

            String zona;
            int puntos;

            switch (tipo) {
                case 1:
                    zona = "simple";
                    puntos = num;
                    break;
                case 2:
                    zona = "doble";
                    puntos = num * 2;
                    break;
                case 3:
                    zona = "triple";
                    puntos = num * 3;
                    break;
                default:
                    zona = "simple";
                    puntos = num;
            }

            if (num == 0) {
                puntos = 50; // Si es un 0, se suma siempre 50 puntos
            }

            totalTirada += puntos;
            System.out.println("Dardo " + i + ": num " + num + " tipo: " + tipo + " (" + zona + ")");
        }

        if (puntuacion - totalTirada >= 0) {
            puntuacion -= totalTirada;
        }

        System.out.println("Total de la tirada: " + totalTirada);
        System.out.println("Puntuación actual de " + nombre + ": " + puntuacion);
        System.out.println();
    }
}
    



