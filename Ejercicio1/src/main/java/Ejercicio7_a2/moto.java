/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7_a2;

/**
 *
 * @author majes
 * 
 */
public class moto {
    private int velocidadActual;

    public moto(int velocidadInicial) {
        this.velocidadActual = velocidadInicial;
    }

    public void acelerar(int aumentoVelocidad) {
        if (aumentoVelocidad > 0) {
            int nuevaVelocidad = velocidadActual + aumentoVelocidad;
            if (nuevaVelocidad <= 150) {
                this.velocidadActual = nuevaVelocidad;
                System.out.println("Acelerando... La velocidad actual es: " + velocidadActual);
            } else {
                System.out.println("No se puede acelerar más la velocidad máxima es 150 ");
            }
        } else {
            System.out.println("Erroe: la aceleración tiene que ser positiva");
        }
    }
    
    public void frenar(int disminuirVelocidad){
        if (disminuirVelocidad > 0) {
            this.velocidadActual -= disminuirVelocidad;
            if (velocidadActual < 0){
                System.out.println("Frenando... la velocidad minima es 0 y La velocidad actual es: " + velocidadActual);
            } else {
                System.out.println("Frenando... La velocidad actual es: " + velocidadActual);
            } 
            } else {
                System.out.println("Error: La velocidad de disminución debe ser un valor positivo.");
            } 
        }
 



           
        
    // Método para obtener la velocidad actual de la moto
    public int getvelocidadActual(){
        return velocidadActual;
    }
}