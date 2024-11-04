/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author majes
 */
public class Main {
    public static void main(String[] args) {
         Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.05, 2019);
        coche1.setMatricula("ABC1234");
        coche1.setDniTitular("12345678A");

        CocheMatriculado coche2 = new CocheMatriculado("DEF5678", "87654321B", 2018, 6, "Ford", "Azul", 15000, 0.06, 2018);

        // Prueba de métodos
        System.out.println("Impuesto de matriculación de coche1: " + coche1.getPrecio() / 20);
        System.out.println("Impuesto de matriculación de coche2: " + coche2.getImpuestoMatriculacion());

        coche1.comprarCoche(coche2);
        System.out.println("Nuevo propietario de coche1: " + coche1.getDniTitular());
    }
}
