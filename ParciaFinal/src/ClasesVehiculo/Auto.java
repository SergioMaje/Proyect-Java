/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesVehiculo;

/**
 *
 * @author Sergio Majé
 */
public class Auto extends Vehiculo{
    // Atributos
    boolean tieneRadio;
    boolean tieneNavegador;
    // Constructor - Incluyendo los nuevos Atributos
    public Auto(boolean tieneRadio, boolean tieneNavegador, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }
    //Método - Aumentar 1& impuestoCirculación si tieneRadio y 2% si tieneNavegador
    public void impuestoCirculacionAuto(){
        if(tieneRadio){
          double impuestoRadio = (getPrecio()*0.01) + super.impuestoCirculacion;
          this.impuestoCirculacion = impuestoRadio;   
        } if(tieneNavegador){
           double impuestoNavegador = (getPrecio()*0.02) + super.impuestoCirculacion;
           this.impuestoCirculacion = impuestoNavegador;
        }
    }
    
    //Método - Aumentar cuotaMesGaraje un 20% si el cilindraje pasa de 2499
    public void aumentoCuota(){
        if(getCilindraje() > 2499){
           double aumentoCuotaGaraje = getcuotaMesGaraje() * 0.2;
           setcuotaMesGaraje(aumentoCuotaGaraje);
        }
    }
}

