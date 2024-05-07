/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeVehiculo;

import java.util.ArrayList;

/**
 *
 * @author majes
 */
public class Garaje implements iGaraje{
    //los atributos
    private static final int NumeroEspacios = 10;
    private ArrayList<Vehiculo> espacios; 
    
    //el constructor

    public Garaje(ArrayList<Vehiculo> espacios) {
        this.espacios = espacios;
    }

    Garaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    //metodo en el que agregue un vehiculo en el garaje
    public void agregarVehiculo(Vehiculo vehiculo){
            if(espacios.size() < NumeroEspacios){
                espacios.add(vehiculo);
                System.out.println("Se agregó un Vehiculo al garaje");
            } else {
                System.out.println("El garaje está lleno no pude agregar más");
            }
    }
    
    @Override
    public double calcularIngresos(){
        double ingresos = 0; 
        for(Vehiculo vehiculo : espacios){
            ingresos += vehiculo.getcuotaMesGaraje();
        }
        return ingresos;
    }
    
 
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v){
        int contador = 0;
        for (Vehiculo vehiculo : espacios){
            if (vehiculo.getClass().equals(v.getClass())){
                contador++;
            }
        }
        return contador; 
    }

    @Override
    public int calcularOcupacionPorVehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

