/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionGarajes;

import ClasesVehiculo.Auto;
import ClasesVehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author majes
 */
public class Test{
    public static void main(String[] args) {
        MenuRedGarajes prueba = new MenuRedGarajes();
        prueba.mostrarGarajes();
       
        
    }

    
    
    public void MenuRedGaraje(){
        redGarajes = new ArrayList();
    }
    
    private List<Garaje> redGarajes;
   
    
    public void inicializarGaraje(String nombre, Ubicacion ubicacion, int numEspacios){
   
        redGarajes.add(new Garaje("g1", new Ubicacion("Huila", "Neiva", "Carrera 34 6 65", "3112548792", "g1@empresa.co", "MARIA"), 9));
        redGarajes.add(new Garaje("g2", new Ubicacion("Tolima", "Ibague", "Calle 65 89 87", "3256987412", "g2@empresa.co", "PEDRO"), 10));
        
        
    }
    
     
    public void mostrarGarajes() {
        if (redGarajes.isEmpty()) {
            System.out.println("No hay garajes registrados.");
            
        }
    
        System.out.println("\n=== Lista de Garajes ===");
        for (int i = 0; i < redGarajes.size(); i++) {
            System.out.println((i + 1) + ". " + redGarajes.get(i).getNombre());
        }
       
    }
    
    public void ingresarVehiculo(Vehiculo vehiculo) throws Exception {
        
    }
    
  }
