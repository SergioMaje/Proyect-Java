/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_a2;

/**
 *
 * @author majes
 */
public class prueba {
    public static void main(String[] args) {
        moto mimoto = new moto(50);
        
        mimoto.acelerar(80);
        mimoto.acelerar(80);
        
        mimoto.frenar(10);
        mimoto.frenar(10);
        
        System.out.println("La velocidad actual de la moto es: " + mimoto.getvelocidadActual());
    }
}
