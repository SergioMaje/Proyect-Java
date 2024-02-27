/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Sergio Majé
 */

/*
En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas llantas vas a comprar?");
        int llantas = scanner.nextInt();
        double valorLlantas;
        if (llantas < 5) {
            valorLlantas = 100;
            System.out.println("el valor de cada llanta es de "+ valorLlantas);
        }
        else if (llantas < 10){
            valorLlantas = 75;
            System.out.println("el valor de cada llanta es de "+ valorLlantas);
        }
        else {
            valorLlantas = 50;
            System.out.println("el valor de cada llanta es de "+ valorLlantas);
        }
    
        double valorTotal = llantas*valorLlantas; 
        System.out.println("El precio total de las llantas es de " + valorTotal);
    }
}
