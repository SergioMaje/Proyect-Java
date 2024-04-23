/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author majes
 */
public class alumno {
    private String nombre; 
    private final double[] notas;
    
public alumno(String nombre){
    this.nombre = nombre; 
    notas = new double [3];
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas[0]+"-"+notas[1]+'-'+notas[2] + '}';
    }
    
    public boolean ponerNota(int evaluacion, double nota) {
        int pos;    
        switch (evaluacion) {
            case 1, 2, 3 -> pos = evaluacion-1;
            default -> {
                return false;
            }
     }
    //Validar nota
     if (nota >= 1 & nota <=10) {
         notas[pos] = nota;
         return true;
     }
     else 
         return false;
     }    
}
    