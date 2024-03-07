/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author majes
 */

/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas manzanas va  a llevar?");
       int kilos = scanner.nextInt();
       
       int precioKilo = 9000;
       double descuento = 0;
       double precioAcumulado;
       double precio; 
       
       
       if (kilos <= 2) { 
          
          descuento += 0;
       }
       else if (kilos <=5){
        
          descuento += 0.10; 
       }
       else if (kilos <=10) {
          descuento += 0.15;
       }
       else {
           descuento += 0.20;
       }
       precioAcumulado = precioKilo * kilos;
       precio = precioAcumulado - (precioAcumulado*descuento);
       System.out.println("El precio de tu producto es: "+ precio);
    }
}
