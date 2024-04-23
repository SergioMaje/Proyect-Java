/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author majes
 */
public class cuentaCorriente extends Cuenta  {
    private double maximoRetirable;

    public cuentaCorriente(double maximoRetirable, long numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

   

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public String toString() {
        return "cuentaCorriente{" + "maximoRetirable=" + maximoRetirable + super.toString()+'}';
    }
    
    
    
}
