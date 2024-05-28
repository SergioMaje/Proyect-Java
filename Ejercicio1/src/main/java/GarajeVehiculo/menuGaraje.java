/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GarajeVehiculo;

import java.util.Scanner;

/**
 *
 * @author majes
 */
public class menuGaraje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();

        int opcion;
        do {
            System.out.println("--Menú de garaje---");
            System.out.println("1. Alquilar un espacio");
            System.out.println("2. Retirar Vehiculo");
            System.out.println("3. Consultar ingresos mensuales");
            System.out.println("4. Consultar proporcion de autos/motos");
            System.out.println("5. listar matriculas, cuota mensualy tipo de vehiculo");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n-- alquilar un espacio----");
                    System.out.println("ingrese los datos del vehiculo");
                    System.out.println("placa: ");
                    String placa = scanner.next();
                    System.out.println("marca: ");
                    String marca = scanner.next();
                    System.out.println("precio: ");
                    int precio = scanner.nextInt();
                    System.out.println("Cilindraje: ");
                    int cilindraje = scanner.nextInt();
                    
                    
                    Vehiculo vehiculo;
                    if(Cilindraje > 0){
                        System.out.println("¿Es un Auto, un Camion, o una Moto? (a/c/m)");
                        String tipo = scanner.next().lowerCase();
                        if(tipo.equals(a)){
                            vehiculo = new Auto(placa,marca,precio,cilindraje);
                        } else if(tipo.equals(c)){
                            vehiculo = new Camion(placa,marca,precio,cilindraje);
                        }   else if(tipo.equals(m)){
                            vehiculo = new Moto(Placa,marca,precio,cilindraje);
                        }      else{
                            System.out.println("tipo de vehiculo invalido, no puede alquilar el espacio");
                            continue
                                    }
                    }
                    garaje.agregarVehiculo(vehiculo);
           
                case 2 
                    System.out.println("\n --- Retirar Vehiculo ---");
                    System.out.println("Ingrese la placa para retirar: ");
                    String placaRetiro = scanner.next();
                    if(garaje.retirarVehiculo(placaRetiro)){
                        System.out.println("Vehiculo retirado exitosamente");
                    } else {
                        System.out.println("No se encontró ningun vehiculo con esa placa en el garaje");
                    }
                    break;
                
                
                case 3 
                    System.out.println("Consultar Ingresos Mensuales");
                    System.out.println("Los ingresos mensuales son: "+ garaje.calcularIngresos());
                
                    break;
                
                case 4 
                    
                
}
        
   
