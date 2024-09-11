/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosBifurcaciones;

import java.util.Scanner;

/**
 *
 * @author majes
 */
public class Ejercicio1 {
     public static void main(String[] args) {
        int numero;
        boolean esPar;
        Scanner scanner = new Scanner(System.in);
         System.out.println("digite un numero");
         numero = scanner.nextInt();
        
         if(numero >= 0) {
             System.out.println("este número es positivo");
         }           
         
         if(numero % 2 == 0){
             System.out.println("El numero " + numero + " es par");
         }
         else {
             System.out.println("El numero " + numero + " es impar");
         }
         
         if(numero % 5 == 0){
             System.out.println("El numero " + numero + " es multiplo de 5");
         }
    }
}
