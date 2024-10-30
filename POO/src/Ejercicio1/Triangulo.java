/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author majes
 */
public class Triangulo {
    private int base;
    private int altura;
    
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
}
