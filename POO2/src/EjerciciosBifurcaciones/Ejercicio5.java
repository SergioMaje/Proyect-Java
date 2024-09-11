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

/*
Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que
faltan para llegar a la medianoche.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int horas;
        int minutos;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las horas: (0-23)");
        horas = scanner.nextInt();
        System.out.println("Ingrese los minutos: (0-59)");
        minutos = scanner.nextInt();
        
        int segundosFaltantes = calcularSegundosParaMedianoche(horas,minutos);
        
        System.out.println("Faltan " + segundosFaltantes + "segundos para medianoche.");
        
        scanner.close();
    }
        
        public static int calcularSegundosParaMedianoche(int horas, int minutos){
            
            int segundosActuales = (horas * 3600) + (minutos * 60);
            
            int segundosDia = 24 * 3600;
            
            return segundosDia - segundosActuales;
        }
    }
