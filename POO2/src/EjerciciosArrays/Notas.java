/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;

import java.util.Scanner;

/**
 *
 * @author majes
 */
public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamaño = 8;        
        double[] notas = new double[tamaño];
        
        // Así se rellena el arreglo con valores proporcionados por el usuario
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introduce la nota: " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }
        
        System.out.println("notas introducidas: ");
        for(double nota: notas){
            System.out.println(nota);
        }
        
        // le damos una posición a max en el arreglo
        double max = notas[0];
        double min = notas[1];
        
        //iteramos los datos que se ingresaron en el arreglo
        
        for (int i = 0; i < notas.length; i++) {
            //condicionamos que si alguno de esos datos es mayor a max entonces max se convirtiera en ese dato
            //así nos aseguramos de que sea el mayor
            if(notas[i] > max){
                max = notas[i];
            }
        }
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] < min){
                min = notas[i];
            }
        }
        
        int suma = 0;
        for(double nota: notas){
            suma += nota;
        }
        
        double media = suma/notas.length;
        
        int contadorAprobadas = 0;
        
        for(double nota: notas){
            if(nota > 5 && nota < 10 ){
            contadorAprobadas++;
        }    
        }
        
        
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
        System.out.println("Este es el promedio de notas: " + media);
        
        System.out.println("Las notas que aprobaron fueron: " + contadorAprobadas);
        /*
         for (int i = 0; i < 8; i++) {
            System.out.println("estas son las posiciones " + i);
            System.out.println("estos son los datos dentro del arreglo:  " + notas[i]);
        }
        */
       
        
    }
}
