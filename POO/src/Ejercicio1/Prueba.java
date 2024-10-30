/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author majes
 * Crear una clase Triangulo que representa un triángulo equilátero, con los atributos enteros base y
altura. Crear métodos para dar valor y poder consultar los atributos, un método constructor, y un
método para calcular el área del triángulo.
Crear una clase Prueba que en su main cree varios objetos de Triángulo, consulte sus atributos, cambie
el valor nuevamente de los atributos y pruebe su método.
 */
public class Prueba {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(5,8);
        Triangulo triangulo2 = new Triangulo(10,7);
        Triangulo triangulo3 = new Triangulo(12,4);
        
            System.out.println("Triangulo 1: "+ triangulo1);
            triangulo1.setBase(6);
            triangulo2.setAltura(14);
            System.out.println("Triangulo 1 modificado es: " + triangulo1);
            
            System.out.println("Triangulo 2: "+ triangulo2);
            triangulo2.setBase(8);
            triangulo2.setAltura(16);
            System.out.println("Triangulo 2 modificado es: "+ triangulo2);
            
            System.out.println("Traingulo 3: "+ triangulo3);
            triangulo3.setBase(10);
            triangulo3.setAltura(20);
            
            System.out.println("/nAreas de los triángulos: ");
            System.out.println("El area del triangulo 1 es: "+ triangulo1.calcularArea());
            System.out.println("El area del triangulo 2 es: "+ triangulo2.calcularArea());
            System.out.println("El area del triangulo 3 es: "+ triangulo3.calcularArea());
    }
}
