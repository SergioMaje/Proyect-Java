/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author majes
 */
public class Empleado {
   //Atributos
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado() {
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
        if(edad >= 18 && edad <= 45){
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 18 y 45 años.");
        }
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

    
    public String clasifica(){
        if(edad <= 21){
          return "Principiante";
        } else if(edad >= 22 && edad <= 35){
          return "Intermedio";
        } else if(edad > 35){
            return "Senior";
        }
        return null;
    }
    
    
    public void subirSalario(int porcentaje){
        if(porcentaje > 0){
            this.salario += this.salario * porcentaje / 100;
        }
    }
    
     @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    
   
    
}
