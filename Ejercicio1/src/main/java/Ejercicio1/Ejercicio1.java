/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio1;


import java.util.Scanner;



/**
 *
 * @author Sergio Majé Montoya
 */

/*
En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
*/


public class Ejercicio1 {

    public static void main(String[] args) {
        /*primero asignamos las variables*/
        double valorComputadora = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos computadores va a comprar?");
        int Computadores = scanner.nextInt();
        int valorComputadores = (int) (valorComputadora * Computadores);
        double descuento = 0;
        if (Computadores < 5) {

            descuento = valorComputadores * 0.1;
        } else if (Computadores < 10) {

            descuento = valorComputadores * 0.2;
        } else {

            descuento = valorComputadores * 0.4;
        }
        double valorTotal = valorComputadores - descuento;
        System.out.println("El valor de los computadores con descuento es" + valorTotal);
    }
}

   
            
             
                
            
        
        
        
        
  

