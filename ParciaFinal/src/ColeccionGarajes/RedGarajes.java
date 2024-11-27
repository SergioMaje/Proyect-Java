/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionGarajes;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author majes
 */
public class RedGarajes {
    private ArrayList<Garaje> garajes; //Lista para almacenar los garajes
    
    //contructor
    public RedGarajes() {
        garajes = new ArrayList<>();
    }
    
    public void crearGaraje(String nombre, Ubicacion ubicacion, int numEspacios){
        garajes.add(new Garaje(nombre, ubicacion, numEspacios) {});
    }
    
    //Método para eliminar un garaje por nombre
    public void eliminarGaraje(String nombre) throws Exception {
        Garaje garaje = buscarGaraje(nombre);
        if(garaje == null){
            throw new Exception("Garaje no encontrado");
        } 
            garajes.remove(garaje);      
    }
    
    //Método para buscar un garaje por nombre
    public Garaje buscarGaraje(String nombre) throws Exception {
        for(Garaje garaje : garajes) {
            if(garaje.getNombre().equals(nombre)){
                return garaje;
            }
        }
        return null; // No se encontró el garaje
}

    public void listarGarajes(){
        if (garajes.isEmpty()) {
            System.out.println("No hay garajes en la red.");
        } else {
            System.out.println("Lista de garajes en la red:");
            for (Garaje garaje : garajes) {
                System.out.println("- " + garaje.getNombre() + " ubicado en: " 
                                   + garaje.getUbicacion().getCiudad() + ", " 
                                   + garaje.getUbicacion().getDepartamento());
            }
        }
    }
}
