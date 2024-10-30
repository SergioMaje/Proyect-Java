/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author majes
 */
public class Prueba {
    public static void main(String[] args) {
        //Creo dos libros
        Libro libro1 = new Libro("cien años de soledad", "Gabriel García Márquez", 5, 2);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 3,1);
        
        
        //Mostrar la información de los libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        
        //Probar el método prestar
        System.out.println("Intentando Prestar 'Cien Años de Soledad': " + (libro1.prestar() ? "Préstamos realizado" : "No quedan ejemplares disponibles"));
        System.out.println("Intentando prestar 'Don Quijote de la Mancha': " + (libro2.prestar() ? "Préstamo realizado" : "No quedan ejemplares disponibles"));

        // Mostrar la información de los libros después de los préstamos
        System.out.println("\nDespués del préstamo:");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        // Probar el método devolver
        System.out.println("\nDevolviendo 'Cien años de soledad': " + (libro1.devolver() ? "Devolución realizada" : "No se puede devolver"));
        System.out.println("Devolviendo 'Don Quijote de la Mancha': " + (libro2.devolver() ? "Devolución realizada" : "No se puede devolver"));

        // Mostrar la información de los libros después de las devoluciones
        System.out.println("\nDespués de la devolución:");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
}
