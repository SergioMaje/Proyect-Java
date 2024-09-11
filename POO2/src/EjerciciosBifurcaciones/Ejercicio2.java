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
public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3; 
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digita el segundo numero: ");
        numero2 = scanner.nextInt();
        System.out.println("Digita el tercer numero: ");
        numero3 = scanner.nextInt();
        if(numero1 == numero2 && numero2 == numero3){
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("los numeros son diferentes");
        }
    }
}
