/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import java.util.Scanner;

/**
 *
 * @author majes
 */


public class taller {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿cuantos camiones desea ingresar?");
        int nCamion = scanner.nextInt();
        double[][] datosCamion = new double[nCamion][6];
       
        double tipoProducto = 0;
        double tipoServicio = 0;
        double valorParqueadero = 0;
        double tiempo = 0;
        double peso = 0;
        double largo = 0;
        
        
        char continuar = 0;

        //ingreso manual
       
        do{
        for (nCamion = 0; nCamion < datosCamion.length; nCamion++) {
            System.out.println("Servicio a realizar (Servicio a realizar(1 - Descarga 2 - Carga)");
            tipoServicio = scanner.nextDouble();

            //validar que el servicio sea 1 o 2
            if (tipoServicio == 1) {
                System.out.println("Tipo de producto (1 -perecedero 2 - No perecedero");
                tipoProducto = scanner.nextDouble();
                System.out.println("Peso de la carga en toneladas: ");
                peso = scanner.nextDouble();

                switch ((int) tipoProducto) {
                    case 1:
                        if (peso < 8) {
                            valorParqueadero = 15000 * peso;
                        } else {
                            valorParqueadero = 9000 * peso;
                        }
                        break;

                    case 2:
                        if (peso < 8) {
                            valorParqueadero = 60000;
                        } else {
                            valorParqueadero = 60000 + (peso - 10) * 7000;
                        }
                }
            } else {
                System.out.println("Tiempo que permanecen en el parqueadero: ");
                tiempo = scanner.nextDouble();
                System.out.println("Cual es la medida del camión en metros: ");
                largo =  scanner.nextDouble();
                
                if(tiempo <= 2){
                    valorParqueadero = 0;
                } else {
                    if(largo < 4){
                        valorParqueadero = (tiempo - 2)*4000;
                    } else {
                        valorParqueadero = (tiempo - 2)*4000*1.25;
                    }
                }
            }  System.out.println("Valor a pagar: " + valorParqueadero);
                System.out.println("¿Desea agregar uno más? (S/N)");
                continuar = scanner.next().charAt(0);
                
                datosCamion[nCamion][0] = tipoServicio;
                datosCamion[nCamion][1] = tipoProducto;
                datosCamion[nCamion][2] = peso;
                datosCamion[nCamion][3] = tiempo;
                datosCamion[nCamion][4] = largo;
                datosCamion[nCamion][5] = valorParqueadero;
                
                if(continuar == 's' || continuar == 'S'){
                    nCamion++;
                }
            }
        }while((continuar =='S' || continuar == 's'));
            
            //variables
            
            double sumaDescarga = 0; 
            double sumaCarga = 0; 
            int contadorDescarga = 0; 
            int contadorCarga = 0;
            double sumaPerecederos = 0;
            double sumaNoPerecederos = 0; 
            int contadorPerecederos = 0; 
            int contadorNoPerecederos = 0; 
            int vehiculosMenosDeDosHoras = 0;
            double sumaParqueaderoPerecederos = 0;
            
            // recorro el arreglo - todos los elementos que estén en la columna cero
            
            for (int i = 0; i < datosCamion.length; i++) {
                tipoServicio = datosCamion[i][0]; // la columna 0 es el tipo de servicio
                valorParqueadero = datosCamion[i][5]; // la columna 5 es el valorParqueadero
                tiempo = datosCamion[i][3]; // la columna 3 tiempo de permanencia
                tipoProducto = datosCamion[i][2]; // la columna 2 es el tipo de Producto
                
                
                if(tipoServicio == 1){
                    sumaDescarga += valorParqueadero; 
                    contadorDescarga++; 
                } else if (tipoServicio == 2){
                    sumaCarga += valorParqueadero;
                    contadorCarga++;
                }
                
                // contar vehículos que duraron menos de dos horas
                if(tiempo > 2){
                    vehiculosMenosDeDosHoras++;
                }
                
                if(tipoServicio == 1 && tipoProducto == 1){
                    sumaParqueaderoPerecederos += valorParqueadero;
                } 
                
        }
            
            // Calculo los promedios
            
            double promedioDescarga;
            if(contadorDescarga > 0){
                promedioDescarga = sumaDescarga / contadorDescarga;
            } else {
                promedioDescarga = 0;
            }
            
            double promedioCarga; 
            if(contadorCarga > 0){
                promedioCarga = sumaCarga / contadorCarga;
            } else {
                promedioCarga = 0;
            }
            
            // mostrar el informe
            
            System.out.println("--Informe del Parqueadero--");
            System.out.println("Promedio de costo por servicio de Descarga: "  + promedioDescarga);
            System.out.println("Promedio de costo por servicio de carga: " + promedioCarga);
            System.out.println("Cantidad de vehiculos: " + nCamion);
            System.out.println("Vehiculos que duraron menos de dos horas: " + vehiculosMenosDeDosHoras);
            System.out.println("Costo total del parqueadero para vehiculos con productos perecederos que van a descargar: " + sumaParqueaderoPerecederos);
            
            System.out.println("saliendo..");
            scanner.close();
    }
}   
 

        

