/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosBucles;

import java.util.Scanner;

/**
 *
 * @author majes
 */

/*
Pedir por teclado 10 números e indicar si cada uno de ellos es positivo o negativo y si es par o impar.
MEJORA 1: No hay un número fijo de números, el programa pide repetidamente números hasta que
se introduzca un 0.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("dime un numero: ");
            numero = scanner.nextInt();
            
            if(numero % 2 == 0){
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }
    }
}
