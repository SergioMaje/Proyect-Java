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
public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite el segundo numero: ");
        numero2 = scanner.nextInt();
        
        
        if(numero1 > numero2){
            System.out.println("mayor: " + numero1 + " menor: " + numero2);
        }
        
        else{
            System.out.println("mayor: " + numero2 + "menor: " + numero1);
        }
    }
}
