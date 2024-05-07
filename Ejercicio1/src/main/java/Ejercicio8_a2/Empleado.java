/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8_a2;

/**
 *
 * @author majes
 */
public class Empleado {
    String nombre; 
    String dni; 
    int edad; 
    boolean casado; 
    double salario; 

    public Empleado(String nombre, String dni, int entero, boolean casado, double salario){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = entero;
        this.casado = casado;
        this.salario = salario;
    }

    Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void clasificar(){
        if(edad <= 21){
            System.out.println("Clasificación: Principiante");
        } else if(edad >= 22 && edad <= 35) {
            System.out.println("Clasificación: Intermedio");
        } else {
            System.out.println("Clasificación: Senior");
        }
    }
    
    
    
    
    
    
}
