/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeVehiculo;

/**
 *
 * @author majes
 */
public class Camion extends Vehiculo {

   private boolean esSencillo;
   private boolean esDoble;
   
   private boolean tipo;
   private int capacidad;

    public Camion(String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.esSencillo = esSencillo;
        this.esDoble = esDoble;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public void impuestoCirculacionCamion() {
        this.impuestoCirculacion = (super.impuestoCirculacion * 0.09) + this.impuestoCirculacion;
        double toneladas = 0;
        if (toneladas > 5) {
            this.impuestoCirculacion = this.impuestoCirculacion + 10;
        }   
    }
    public void cambioCuotaSencillo(){
        if(esSencillo){
             double precio = getcuotaMesGaraje();
             double aumento = getcuotaMesGaraje()*0.75;
             setcuotaMesGaraje(precio + aumento);
        } 
        else if(esDoble){
            double precio = getcuotaMesGaraje();
            double aumento = getcuotaMesGaraje()*1.25;
            setcuotaMesGaraje(precio + aumento);
        }
        
    }
    
}
    
   
