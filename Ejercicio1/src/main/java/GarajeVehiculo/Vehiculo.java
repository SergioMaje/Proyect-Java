/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeVehiculo;

/**
 *
 * @author majes
 */
public class Vehiculo {
    //Atributos
   private String placa; 
   private String marca; 
   private double precio;
   private int cilindraje;
   public double impuestoCirculacion;
   private double cuotaMesGaraje;
   private static final double CUOTA_MES_GARAJE_POR_DEFECTO = 100;
    //Constructor
    public Vehiculo(String placa,String marca, double precio, int cilindraje) {
        this.placa = placa; 
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_MES_GARAJE_POR_DEFECTO;
        calcularImpuestoCirculacion();
    }

    Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
    //Setters And Getters - Modifico el set de cuotaMesGaraje para que no pueda elegir un numero negativo
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindrada) {
        this.cilindraje = cilindrada;
    }
    
    public double getImpuestoCirculacion(){
        return impuestoCirculacion;
    }
    
    public double getcuotaMesGaraje(){
        return cuotaMesGaraje;
    }
    
    public void setcuotaMesGaraje(double cuotaMesGaraje){
        if(cuotaMesGaraje >=0){
            this.cuotaMesGaraje = cuotaMesGaraje;
        } else {
            System.out.println("Error: La cuota mensual del garaje no puede ser negativa");
        }
    }
    // Metodos - el impuesto de circulación y que sean seis caracteres los de la matricula 
    public void calcularImpuestoCirculacion(){
        this.impuestoCirculacion = this.precio * 0.02;
    }
    
    public boolean matricular(String matricula){
        if(matricula.length()==6){
            this.placa = matricula;
            return true;
        } else {
            return false; 
        }
    }
}
