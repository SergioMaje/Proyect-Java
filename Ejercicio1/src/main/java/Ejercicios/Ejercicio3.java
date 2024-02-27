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
Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        
        double descuento = 0;
        double valorConDescuento;
        double valorConIva;
        double valorTotal;
       
       Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuanto vale el aparato?");
        int precioAparato = scanner.nextInt();
        System.out.println("¿Cual es la marca del reproductor? ");
        String marca = scanner.next();
       
        if (precioAparato >= 500) {
            descuento += 0.10;
        }
         if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05; 
        }
        valorConDescuento = precioAparato - (precioAparato*descuento);
        valorConIva = valorConDescuento * 0.19;
        valorTotal = valorConIva + valorConDescuento;
        System.out.println("El valor de tu reproductor es de " + valorTotal);
    }
}
