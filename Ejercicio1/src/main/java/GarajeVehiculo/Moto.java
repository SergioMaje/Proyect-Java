/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeVehiculo;



/**
 *
 * @author majes
 */
public final class Moto extends Vehiculo {
    //atributo
    private boolean tieneSidecar;
   
    //Constructor
    public Moto(String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        ajustarCuotaMesGaraje();
        calcularImpuestoCirculacion();
    }

    
    //Setters and Getters
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public double getImpuestoCiculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCiculacion(double impuestoCiculacion) {
        this.impuestoCirculacion = impuestoCiculacion;
    }
    
    //Método - cambio del 50% de la cuota mes garaje si tiene sidecar
    public void ajustarCuotaMesGaraje() {
        if (tieneSidecar) {
            double cuota = getcuotaMesGaraje();
            double nuevaCuota = getcuotaMesGaraje() * 0.5;  
            setcuotaMesGaraje(nuevaCuota + cuota);
        }
    }
    //Método - Aumenta un 10% del impuesto circulacioón si tiene sidecar
    @Override
    public void calcularImpuestoCirculacion(){
        super.calcularImpuestoCirculacion();
        if (tieneSidecar){
            double impuestoNormal = getImpuestoCirculacion();
            double incremento = getPrecio() * 0.1;
            setImpuestoCiculacion(impuestoNormal + incremento);
        }   
    }
}
    


    