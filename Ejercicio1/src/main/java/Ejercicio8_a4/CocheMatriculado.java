/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8_a4;

/**
 *
 * @author majes
 */
final class CocheMatriculado extends Coche {
    // Atributos adicionales
    private int aniomatriculacion;
    private int mesMatriculacion;
    private double impuestoMatriculacion;

    // Constructor
    public CocheMatriculado(String matricula, String dniTitular, int anioMatriculacion, int mesMatriculacion, String marca, String color, double precio, double factor_contaminacion, int anio) {
        super(marca, color, precio, factor_contaminacion, anio);
        setMatricula(matricula);
        setDniTitular(dniTitular);
        this.aniomatriculacion = anioMatriculacion;
        this.mesMatriculacion = mesMatriculacion;
        calculaImpuestoMatriculacion();
    }

    // Métodos adicionales
    public void calculaImpuestoMatriculacion() {
        double impuestoBase = getPrecio() / 20;
        if (getAnio() < (aniomatriculacion + 10)) {
            impuestoMatriculacion = impuestoBase;
        } else {
            impuestoMatriculacion = impuestoBase + 100;
        }
    }

    // Getter y Setter adicional
    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion() {
        calculaImpuestoMatriculacion();
    }
}
