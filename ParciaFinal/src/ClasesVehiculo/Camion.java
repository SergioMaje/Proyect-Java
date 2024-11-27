/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesVehiculo;

/**
 *
 * @author majes
 */
public class Camion extends Vehiculo {
    
    private double capacidadCarga; // Capacidad de carga en toneladas
    private int numeroEjes;       // Número de ejes del camión

    // Constructor

    public Camion(double capacidadCarga, int numeroEjes, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    // Getter y Setter para capacidadCarga
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Getter y Setter para numeroEjes
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    // Sobrescribir el método toString para mostrar información del camión
    @Override
    public String toString() {
        return "Camion {" +
                "placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", precio=" + getPrecio() +
                ", capacidadCarga=" + capacidadCarga +
                " toneladas, numeroEjes=" + numeroEjes +
                '}';
    }
}


