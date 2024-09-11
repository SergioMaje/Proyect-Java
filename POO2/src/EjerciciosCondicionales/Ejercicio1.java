/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosCondicionales;

import java.util.Scanner;

/**
 *
 * @author majes
 */

/*
En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
*/
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int precio = 500;
        double descuento = 0;
        double total = 0;
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos equipos deseas comprar?");
        int numEquipos = scanner.nextInt();
        
        
        if(numEquipos < 5) {
            descuento = numEquipos * (precio*0.1);
        }
        
        else if(numEquipos >= 5 && numEquipos < 10) {
            descuento = numEquipos * (precio*0.2);
        }
        
        else if(numEquipos <= 10) {
            descuento = numEquipos * (precio*0.4);
        }     
        
        total = (precio * numEquipos) - descuento;
        
        System.out.println("El precio total de su compra es: " + total);
    }
    
}
