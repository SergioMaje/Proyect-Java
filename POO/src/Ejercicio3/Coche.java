/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author majes
 */
public class Coche {
   
    //atributos
    public String marca; 
    public String color; 
    public String matricula;
    public int cilindrada;
    
    
    //constructores

    public Coche(String marca, String color, String matricula, int cilindrada) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
    }

    public Coche() {
    }
    
    //Métodos
    //Visivilidad de retorno nombreMetodo( <Argumentos> )
    public void decirSiEsMetalizado(){
        if(color.equals("Negro")){
            System.out.println("Es metalizado");
        }
        else {
            System.out.println("No es metalizado");
        }
    }
    
    public int decirCilindrada(){
        return cilindrada;
    }
    
    public void cambiarColor(String color){
        this.color = color;
    }
}
