/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaOnline;

import java.util.Scanner;

/**
 *
 * @author majes
 */
public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String carrito [][] = new String[100][2];
        int numProductos = 0;
        boolean continuar = true;
        
        //Menú
        while(continuar){
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Mostrar Carrito");
            System.out.println("4. Calcular total");
            System.out.println("5. salir");
            System.out.println("Seleccione una opción: ");
            int opcion = scanner.nextInt();     
            
            //utilizar condicionales y bucles para implementar cada opción
            switch(opcion){
                case 1: 
                    //Agregar producto al carrito
                    System.out.println("Cual es el nombre del producto que desea comprar?");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    
                    if(numProductos < carrito.length){
                        carrito[numProductos][0] = nombre;
                        carrito[numProductos][1] = String.valueOf(precio);
                        numProductos++;
                        System.out.println("Producto agregado al carrito");
                    } else {
                        System.out.println("El carrito está lleno");
                    }
                    break;
                case 2: 
                    //Eliminar producto del carrito
                    System.out.println("Cual es el nombre del producto que desea eliminar?");
                    String productoEliminar = scanner.next();
                    boolean encontrado = false;
                    
                    for (int i = 0; i < numProductos; i++) {
                        if(carrito[i][0].equals(productoEliminar)){
                            encontrado = true;
                        //Desplazar los elementos hacia abajo para eliminar el producto
                            for (int j = 0; j < numProductos - 1; j++) {
                                carrito[j][0] = carrito[j + 1][0];
                                carrito[j][1] = carrito[j + 1][1];
                            }
                            numProductos--;
                            System.out.println("Producto eliminado");
                            
                        }
                    }
                        if(!encontrado){
                        System.out.println("Producto eliminado. ");
                    }
                    break;
                case 3: 
                    //Mostrar Carrito
                    System.out.println("Contenido de tu carrito: ");
                    System.out.println("Producto/tprecio");
                    for (int i = 0; i < numProductos; i++) {
                        System.out.println(carrito[i][0] + "/t$" + carrito[i][1]);
                    }
                    
                    break;
                
                case 4: 
                    //Calcular Total
                    
                    double total = 0;
                    for (int i = 0; i < numProductos; i++) {
                        total += Double.parseDouble(carrito[i][1]);
                    }
                    System.out.println("Total del carrito: " + total);
                    
                    break;
                
                case 5: 
                    System.out.println("hasta luego");
                    continuar = false; 
                    break;
                   
                   
                    //salir
            }        
        } 
    }
}
