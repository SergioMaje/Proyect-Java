/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesVehiculo;

/**
 *
 * @author Sergio Majé
 */
public class Camioneta extends Vehiculo {
    private boolean esSuv;
    private boolean esPickup;
    private boolean esCargaUOtro;
    private int numPasajeros;
    private boolean tieneRemolque;    

    public Camioneta(boolean esSuv, boolean esPickup, boolean esCargaUOtro, int numPasajeros, boolean tieneRemolque, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.esSuv = esSuv;
        this.esPickup = esPickup;
        this.esCargaUOtro = esCargaUOtro;
        this.numPasajeros = numPasajeros;
        this.tieneRemolque = tieneRemolque;
    }

    public Camioneta(boolean esSuv, boolean esPickup, boolean esCargaUOtro, int numPasajeros, boolean tieneRemolque) {
        this.esSuv = esSuv;
        this.esPickup = esPickup;
        this.esCargaUOtro = esCargaUOtro;
        this.numPasajeros = numPasajeros;
        this.tieneRemolque = tieneRemolque;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        if(numPasajeros < 5){
            this.numPasajeros = numPasajeros;
        } else {
            System.out.println("El cupo máximo es de 4 personas.");
        }
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    public void setTieneRemolque(boolean tieneRemolque) {
        this.tieneRemolque = tieneRemolque;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = precio*0.05;
    }
    
    public void setCuotaMesGaraje(double cuotaGaraje){
        if(numPasajeros == 2){
            double cuotaNormal = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje()* 0.5;
            setcuotaMesGaraje(cuotaNormal + nuevaCuota);
        } else if (numPasajeros > 2) {
            double cuotaNormal = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje()* 0.6;
            setcuotaMesGaraje(cuotaNormal + nuevaCuota);
        } 
        
        if (tieneRemolque) {
            double cuotaNormal = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje()*0.1;
            setcuotaMesGaraje(cuotaNormal + nuevaCuota);
        }            
        if(esPickup && esCargaUOtro){
            double cuotaNormal = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje()*0.45;
            setcuotaMesGaraje(cuotaNormal + nuevaCuota);
        }
        
        if(esSuv){
            double cuotaNormal = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje()*0.1;
            setcuotaMesGaraje(cuotaNormal + nuevaCuota);
        }
        }
    }

  
    
 

