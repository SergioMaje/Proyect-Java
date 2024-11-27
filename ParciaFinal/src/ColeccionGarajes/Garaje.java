/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionGarajes;

import ClasesVehiculo.Camion;
import ClasesVehiculo.Moto;
import ClasesVehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergio Majé
 */
public class Garaje{
    private String nombre;
    private Ubicacion ubicacion;
    private int numEspacios; //numero máximo de plazas
    private ArrayList<Vehiculo> vehiculos; // Lista de vehículos en el garaje
    
    private static final int LIMITE_CAMIONES_PEQUEÑO = 10;
    private static final int LIMITE_CAMIONES_GRANDE = 20;

    public Garaje(String nombre, Ubicacion ubicacion, int numEspacios) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numEspacios = numEspacios;
        this.vehiculos = new ArrayList<>();
        
    }
     public double consultarIngresosMensuales() {
        double ingresosTotales = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            ingresosTotales += vehiculo.getcuotaMesGaraje();
        }
        return ingresosTotales;
    }

    public void ingresarVehiculo(Vehiculo vehiculo) throws Exception {
        if (vehiculo instanceof Camion) {
            int limiteCamiones = (numEspacios < 100) ? LIMITE_CAMIONES_PEQUEÑO : LIMITE_CAMIONES_GRANDE;
            if(contarCamiones() >= limiteCamiones) {
                throw new LimiteVehiculosExcepcion("No se puede ingresar más camiones en el garaje");
            }
        } else if(vehiculo instanceof Moto){
            int limiteMotos = (int) (numEspacios * 0.2);
            if(contarMotos() >= limiteMotos){
                throw new LimiteVehiculosExcepcion("No se puede ingresar más motos al garaje");
            }
        }
        
        if(vehiculos.size() >= numEspacios){
            throw new EspacioInsuficienteExcepcion("No hay más espacio en el garaje.");
        }
        
        vehiculos.add(vehiculo);
    }

    // Método para retirar un vehículo
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.contains(vehiculo)) {
        vehiculos.remove(vehiculo);
        System.out.println("Vehículo " + vehiculo.getPlaca() + " eliminado del garaje.");
        } else {
        System.out.println("El vehículo no se encuentra en el garaje.");
    }
 }


    public Vehiculo buscarVehiculo(String placa){
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getPlaca().equals(placa)){
                return vehiculo;
            }
        }
        return null;
    }
    
    private int contarCamiones() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
            contador++;
        }
    }
        return contador;    
    }
    
    private int contarMotos(){
        int contador = 0;
        for(Vehiculo v : vehiculos) {
            if(v instanceof Moto) {
                contador++;
            }
        }
        return contador;
    }
    
    

    
    
    // Getters y Setters para numEspacios y vehiculosOcupados

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumEspacios() {
        return numEspacios;
    }

    public void setNumEspacios(int numEspacios) {
        this.numEspacios = numEspacios;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    
    
    
    //Excepciones
    
    public class LimiteVehiculosExcepcion extends Exception {
        public LimiteVehiculosExcepcion(String mensaje){
            super(mensaje);
        }
    }
    
    public class EspacioInsuficienteExcepcion extends Exception {
        public EspacioInsuficienteExcepcion(String mensaje){
            super(mensaje);
        }
    }
    
    public class VehiculoEncontradoExcepcion extends Exception{
        public VehiculoEncontradoExcepcion(String mensaje){
            super(mensaje);
        }
    }
}