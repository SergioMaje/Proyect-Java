/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDeTrajesProject;
/**
 *
 * @author majes
 */


import java.util.List;
  
public class Traje implements Comparable<Traje>{
    
    private String nombreTraje;
    private List<Componente> componentes;

    public Traje(String nombreTraje, List<Componente> componentes) {
        if (nombreTraje == null || nombreTraje.isEmpty()){
            throw new IllegalArgumentException("El nombre del traje no puede ser nulo o vacío.");
        }
        this.nombreTraje = nombreTraje;
        this.componentes = componentes;
    }

    public String getNombreTraje() {
        return nombreTraje;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
    @Override
    public int compareTo(Traje otroTraje){
        return this.nombreTraje.compareTo(otroTraje.nombreTraje);
    }

    @Override
    public String toString() {
        return "Traje{" + "nombreTraje=" + nombreTraje + ", componentes=" + componentes + '}';
    }

    
}

    

    

