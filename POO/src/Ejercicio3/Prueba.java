/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author majes
 */
public class Prueba {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.marca="BMW";
        miCoche.color="Black";
        miCoche.cilindrada=2500;
        miCoche.matricula="XYZ809";
        
        System.out.println("Marca: " + miCoche.marca);
        miCoche.color="Negro";
        miCoche.decirSiEsMetalizado();
        System.out.println("Cilindrada: " + miCoche.cilindrada);
        System.out.println("Color Inicial: " + miCoche.color);
        miCoche.cambiarColor("Red");
        System.out.println("Color actulizado: " + miCoche.color);
    }
}
