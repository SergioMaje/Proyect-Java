/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author majes 
 * 
 * /** 7.a.3. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca.
La clase debe guardar el título del libro, autor/a, número de ejemplares del libro (número de
ejemplares totales de un determinado libro) y número de ejemplares prestados (irá cambiando a
medida que prestamos/devolvemos libros). La clase contendrá los siguientes métodos:
- Constructor por defecto.
- Constructor con parámetros.
- Métodos setters/getters.
- Método prestar() que incremente el atributo correspondiente cada vez que se realice un préstamo
del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
Devuelve true si se ha podido realizar la operación y false en caso contrario.

JYOC - JAVA - EJERCICIOS 44

- Método devolver() que decrementa el atributo correspondiente cuando se produzca la devolución
de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
Una vez creada la clase, escribe una clase LibroMain.java con un método main, crea 2 libros y ejecuta
las operaciones disponibles para probar la funcionalidad de la clase.
}
**/

public class Libro {
   //atributos
    
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }
    
    
    public boolean prestar(){
        if(numEjemplaresPrestados < numEjemplares){
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean devolver(){
        if(numEjemplares > 0){
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numEjemplaresPrestados=" + numEjemplaresPrestados + '}';
    }
}