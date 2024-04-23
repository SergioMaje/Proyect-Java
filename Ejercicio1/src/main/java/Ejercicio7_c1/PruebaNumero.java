/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_c1;

import java.util.Arrays;

/**
 *
 * @author majes
 */
public class PruebaNumero {
    public static void main(String[] args) {
        int num = 28;
        System.out.println("¿Es " + num + " primo? " + Número.esPrimo(num));
        System.out.println("¿Es " + num + " perfecto? " + Número.esPerfecto(num));
        System.out.println("¿Es " + num + " capicúa? " + Número.esCapicua(num));
        System.out.println();

        int num1 = 220;
        int num2 = 284;
        System.out.println("¿Son amigos " + num1 + " y " + num2 + "? " + Número.sonAmigos(num1, num2));
        System.out.println();

        int[] divisores = Número.extraeDivisores(num);
        System.out.println("Divisores de " + num + ": " + Arrays.toString(divisores));
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(nums));
        Número.duplica(nums);
        System.out.println("Array duplicado: " + Arrays.toString(nums));
        System.out.println();

        int[] nums2 = {3, 1, 4, 1, 5, 9};
        System.out.println("Array original: " + Arrays.toString(nums2));
        Número.ordena(nums2, Número.DESCENDENTE);
        System.out.println("Array ordenado en orden descendente: " + Arrays.toString(nums2));
        System.out.println();

        int[] nums3 = {2, 3, 5, 7, 11, 13};
        System.out.println("Array original: " + Arrays.toString(nums3));
        int[] sinPrimos = Número.eliminaPrimos(nums3);
        System.out.println("Array sin primos: " + Arrays.toString(sinPrimos));
    }
}


