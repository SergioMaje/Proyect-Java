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
17. El sistema meteorológico local requiere un sistema para capturar la temperatura promedio de cada
día de la semana e imprimir el nombre del día y un mensaje de la percepción de la temperatura
de acuerdo con el valor capturado según la siguiente tabla:
Temperatura Mensaje
Menor o igual que cero Congelante
1 a 10°C Muy frío
11 a 20°C Frío

Temperatura Mensaje
21 a 24°C Templado
25 a 29°C Agradable
30 a 35°C Caliente
36°C o más Muy caliente
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {"lunes","martes", "miercoles"," jueves"," viernes"," sabado", "domingo"};
        double[] temp = new double [diasSemana.length];
        
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("ingrese el día de la semana " );
            String dia = sc.next();
            System.out.println("ingrese la temperatura promedio para el día " + dia + ":");
            double temperatura = sc.nextDouble();
            temp[i] = temperatura;
        
            if (temperatura < 10){
                System.out.println("El día está muy Frío");
            }
            else if (temperatura < 20){
                System.out.println("El día está Frío");
            }
            else if (temperatura < 24){
                System.out.println("El día está Templado");
            }
            else if (temperatura < 29){
                System.out.println("El día está Agradable");
            }
            else if (temperatura < 35){
                System.out.println("El día está caliente");
            }
            else if (temperatura >35){
                System.out.println("El día está muy Caliente");
            }
            
            System.out.println("la temperatura promedio del día" + dia + " fue de " + temp[i]);
        }
      
  }
}
