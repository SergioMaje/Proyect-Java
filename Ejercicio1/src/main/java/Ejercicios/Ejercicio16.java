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
Una heladería desea obtener un reporte semanal de ventas. Para ello debe capturar en un
sistema todas las facturas de ventas realizadas. Cada factura contiene la cantidad y el sabor de
las paletas vendidas. Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
fresa ($2000) y crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
sabor, el valor vendido y la venta total. Considere que una factura puede tener varias paletas de
diferentes sabores.
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        // Precios de cada sabor de paleta
        int[] precios = {2500, 2800, 2600, 2000, 3000};
        String[] sabores = {"limón", "nuez", "lulo", "fresa", "crema"};
        int[] cantidades = new int[precios.length];
        int ventaTotal = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de facturas:");
        int numFacturas = sc.nextInt();

        for (int i = 0; i < numFacturas; i++) {
            System.out.println("Ingrese el número de paletas vendidas para la factura " + (i + 1) + ":");
            int numPaletas = sc.nextInt();
            for (int j = 0; j < numPaletas; j++) {
                System.out.println("Ingrese el sabor de la paleta " + (j + 1) + " (limón, nuez, lulo, fresa, crema):");
                String sabor = sc.next();
                for (int k = 0; k < sabores.length; k++) {
                    if (sabor.equals(sabores[k])) {
                        cantidades[k]++;
                        ventaTotal += precios[k];
                        break;
                    }
                }
            }
        }

        // Imprimir el reporte
        System.out.println("Reporte Semanal de Ventas:");
        for (int i = 0; i < sabores.length; i++) {
            int cantidad = cantidades[i];
            int valorVendido = cantidad * precios[i];
            System.out.println("Sabor: " + sabores[i] + ", Cantidad Vendida: " + cantidad + ", Valor Vendido: $" + valorVendido);
        }
        System.out.println("Venta Total: $" + ventaTotal);
        sc.close();
    }
  }


