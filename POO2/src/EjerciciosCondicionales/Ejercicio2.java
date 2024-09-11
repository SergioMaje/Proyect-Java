/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author majes
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
        
        int precio = 0;
        double total;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas llantas desea comprar?");
        int llantas = scanner.nextInt();
        
        
        if(llantas < 5 && llantas > 0) {
           precio = 100;
        }
        
        else if(llantas > 5 && llantas < 10){
            precio = 75;
        }
        
        else if(llantas < 0) {
            System.out.println("Escribe un número positivo");
        }
        
        else {
            precio = 50;
        }
        
        total = llantas * precio;
        System.out.println("El total que debes pagar es de: " + total);
    }
}
