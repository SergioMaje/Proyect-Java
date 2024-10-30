/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author majes
 */
public class Programar extends Empleado{
    //Atributos
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programar(int lineasDeCodigoPorHora, String lenguajeDominante) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public Programar() {
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public double calculaSalario(){
        return 10*lineasDeCodigoPorHora;
    }
    
}
