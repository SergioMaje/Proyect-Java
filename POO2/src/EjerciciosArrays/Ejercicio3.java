/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;

import java.util.Random;

/**
 *
 * @author majes
 */

/*
Crear un array de 15 enteros, rellenarlo con valores aleatorios, y escribe sus valores por pantalla
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int[]array = new int[10];
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("El contenido del indice " + i + " es:" + array[i]);
            if(i > array[i]){
                System.out.println("soy el número mayor");
            }
        }
    }
}
