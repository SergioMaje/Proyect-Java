/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ColeccionGarajes;

import ClasesVehiculo.Vehiculo;
import ColeccionGarajes.RedGarajes;

/**
 *
 * @author Sergio Majé
 */
public interface IGaraje {
    String eliminarGaraje(String nombre);
    int calcularOcupacionPorVehiculo(Vehiculo moto);
}
