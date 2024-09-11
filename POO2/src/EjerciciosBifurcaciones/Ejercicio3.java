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
public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        numero = scanner.nextInt();
        
        if(numero == 1){
            System.out.println("Dia lunes");
        }
        else if(numero == 2){
            System.out.println("Dia martes");
        } 
        else if(numero == 3) {
            System.out.println("Dia miercoles");
        }
        else if(numero == 4) {
            System.out.println("Dia jueves");
        }
        else if(numero == 5) {
            System.out.println("Dia viernes");
        }
        else if(numero == 6) {
            System.out.println("Dia sabado");
        }
        else if(numero == 7) {
            System.out.println("Dia domingo");
        }
    }
}
