/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SergioMajé
 */

/*
El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
año. La manera de planificarlas depende de lo siguiente:
Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
un saldo superior a los U$20.000 no pedirá ningún préstamo.
Posteriormente repartirá su presupuesto de la siguiente manera:
• U$5.000 para equipo de computo
• U$2.000 para mobiliario
• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
*/
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es su capital?");
        double capital = sc.nextDouble();
        double prestamo = 0;
        double computo = 5000;
        double mobiliario = 2000;

        if (capital < 0) {
            prestamo = 10000 - capital;
            capital = 10000;
        } else if (capital > 0) {
            prestamo = 20000 - capital;
            capital = 20000;
        }
        double insumos = (capital - computo - mobiliario) / 2;
        double personal = (capital - computo - mobiliario) / 2;
        System.out.println("cantidad destinada para insumos es de $: " + insumos);
        System.out.println("Cantidad destinada para personal es de $: " + personal);
        if (prestamo > 0) {
            System.out.println("Se solicitara un prestamo bancario por $: " + prestamo);
        } else {
            System.out.println("No se necesita solicitar prestamo bancario");
            sc.close();
        }
    }
 }

