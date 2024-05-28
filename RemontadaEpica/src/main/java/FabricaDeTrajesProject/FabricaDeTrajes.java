/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDeTrajesProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author majes
 */
public class FabricaDeTrajes implements IFabricaDeTrajes {
    
    ArrayList <Componente> componentesEnAlmacen;
    
    TreeSet<Traje> trajesEnAlmacen;
    
    boolean sonRebajas = false;

   public FabricaDeTrajes(){
       componentesEnAlmacen = new ArrayList<>();
       trajesEnAlmacen = new TreeSet<>();
   }
    
    


    public static void main(String[] args) {
        FabricaDeTrajes Bodega = new FabricaDeTrajes();
        Bodega.ejecutarMenu();
       
       
    }
 
    
    public void escribirMenu(){
        System.out.println("MENU FABRICA DE TRAJES");
        System.out.println("1. - Añadir Componente a Almacén");
        System.out.println("2. - Listar Componentes del Almacén");
        System.out.println("3. - Crear traje y añadir a Almacén");
        System.out.println("4. - Listar trajes del Almacén");
        System.out.println("7. - Activar/Desactivar Rebajas");
        System.out.println("8. - Crear envío");
        System.out.println("9. - Crear componentes de Prueba");
        System.out.println("0. - Salir");
    }
    
    
    public void ejecutarMenu(){
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            
            do {
                escribirMenu();
                System.out.println("Seleccione una opción: ");
                //para que el input sea un número entero
                while(!scanner.hasNextInt()){
                    System.out.println("Por favor, ingrese un número válido.");
                    scanner.next();
                    System.out.println("Selecciones una opción: ");
                }
                opcion = scanner.nextInt();
                
                switch (opcion){
                    case 1 -> {
                        //Creando el menú en el que el usuario va a añadir los componentes
                        System.out.println("Seleccione el tipo de componente:");
                        System.out.println("1.Blusa");
                        System.out.println("2.Chaqueta");
                        System.out.println("3.Falda");
                        System.out.println("4.Pantalon");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.println("Ingresa las caracteristicas del componente");
                        System.out.println("ID:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        
                        //validar que el Id no exista
                        if(buscarComponentePorId(id) != null){
                            System.out.println("El ID ya existe. No se puede crear el componente.");
                            return;
                        }
                        
                        String nombre = "";
                        switch (tipo) {
                            case 1 -> nombre = "blusa";
                            case 2 -> nombre = "chaqueta";
                            case 3 -> nombre = "falda";
                            case 4 -> nombre = "pantalon";
                            default -> {
                                System.out.println("Tipo de componente no valido.");
                                return;
                            }
                        }
                        
                        System.out.println("Talla");
                        String talla = scanner.nextLine();
                        
                        System.out.println("Color");
                        String color = scanner.nextLine();
                        
                        System.out.println("Es Comunitario? f/v");
                        boolean esComunitario = scanner.next().equalsIgnoreCase("v");
                        
                        System.out.println("Precio");
                        double precio = scanner.nextDouble();
                        scanner.nextLine();
                        
                        Componente Almacenados = new Componente(id, nombre, talla, color, esComunitario, precio);
                        añadirComponenteAAlmacen(Almacenados);
                        
                        System.out.println("El componente " + nombre + " ha sido añadido al almacén.");
                    }

                    
                    case 2 -> listarComponentes();
                    case 3 -> {
                        añadirTrajeAlmacen();
                    }
                    
                    case 4 -> listarTrajes();
                    case 7 -> activarDesactivarRebajas();
                    case 8 -> crearEnvio();
                    case 9 -> crearComponentePrueba();
                    case 0 -> System.out.println("Saliendo del menú.");
                    default -> System.out.println("Opción no valida. Por favor, intente de nuevo");
                }
            } while (opcion != 0);
        }
    } 
    

   

    @Override
    public void añadirComponenteAAlmacen(Componente componente) { 
        if(buscarComponentePorId(componente.getId())!= null) {
            try {
                throw new IdException("El ID " + componente.getId() + " ya existe. No se puede añadir al componente.");
            } catch (IdException ex) {
                Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!componente.isEscomunitario()){
            int extraComunitariosCount = 0;
            for (Componente c : componentesEnAlmacen){
                if (!c.isEscomunitario()){
                    extraComunitariosCount++;
                }
            }
            if (extraComunitariosCount >= componentesEnAlmacen.size() / 2) {
                try {
                    throw new MuchoExtraComunitarioException("No se puede añadir el componente extraComunitario. Ya hay mas del 50% de componentes extracomunitarios en el almacen.");
                } catch (MuchoExtraComunitarioException ex) {
                    Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        //Voy a validar la blusa de manga larga y manga corta del mismo color
        
        if(componente.getNombre().equalsIgnoreCase("blusa")){
            System.out.println("¿Es una blusa de manga corta? (s/n): ");
            Scanner scanner = new Scanner(System.in);
            String respuesta = scanner.nextLine();
            
            
            
            if(respuesta.equalsIgnoreCase("s")){
                //con este condicional verifico si hay una blusa de manga larga del mismo color
                boolean blusaMangaLargaExistente = false;
                for(Componente c : componentesEnAlmacen) {
                    if(c.getNombre().equalsIgnoreCase("blusa") && !c.getTalla().equalsIgnoreCase("corta") && c.getColor().equalsIgnoreCase(componente.getColor())){
                       blusaMangaLargaExistente = true;
                       break;
                    }
                }
            
            if(!blusaMangaLargaExistente) {
                    try {
                        throw new MangaException("No se puede añadir una blusa de manga corta sin una blusa de manga larga del mismo color en el almacén. ");
                    } catch (MangaException ex) {
                        Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        } else if(!respuesta.equalsIgnoreCase("n")){
            System.out.println("Respuesta no válida por favor ponga 's' para sí o 'n' para no.");
            return;
        }
            
        componentesEnAlmacen.add(componente);
        System.out.println("Añadiendo componetente al almacén.");
        }
    
        //ahora voy a ajustar el precio - este código no me quiso funcionar y después de intentar este no se que cambíe y no me toman otros componentes
        //por cuestiones de tiempo no lo alcancé a terminar
        /* double precioAjustado = componente.getPrecio();
        if( componente.getNombre().equalsIgnoreCase("Chaqueta")){
            // Preguntar al usuario cuántos botones tiene la chaqueta
            System.out.println("Ingrese la cantidad de botones que tiene la chaqueta:");
            int numBotones = scanner.nextInt();
            //debo añadir 2 euro por botón
            precioAjustado += 2 * numBotones;
        } else  if (componente.getNombre().equalsIgnoreCase("Pantalon")){
            //Preguntamos si el pantalon tiene cremallera
            System.out.println("Ingrese la cantidad de cremalleras que tiene el pantalon: ");
            int conCremalleras = scanner.nextInt();
            //debo añadir 1 euro por cremallera
            precioAjustado += 1*conCremalleras;
        } else if (componente.getNombre().equalsIgnoreCase("Falda")){
            // preguntamos si la falda tiene cremallera
            System.out.println("Ingrese la cantidad de cremalleras que tiene el pantalon: ");
            int conCremalleras = scanner.nextInt();
            //debo añadir 1 euro por cremallera
            precioAjustado += 1*conCremalleras;
        }
        }
        */
        
    }
    @Override
    public void listarComponentes() {
        System.out.println("Listando los componentes del almacen");
        for(Componente componente : componentesEnAlmacen ){
            System.out.println(componente);
        }   
    }
    

 
    @Override
     public void añadirTrajeAlmacen() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Componente> componentesSeleccionados = new ArrayList<>();

        System.out.println("Blusas disponibles: ");
        listarComponentesPorTipo("blusa");
        System.out.println("Elija el tipo de blusa por su ID:");
        int blusaId = scanner.nextInt();
        Componente blusa = buscarComponentePorId(blusaId);
        if (blusa != null) {
            componentesSeleccionados.add(blusa);
        } else {
            System.out.println("Blusa no encontrada.");
            return;
        }

        System.out.println("Chaquetas disponibles: ");
        listarComponentesPorTipo("chaqueta");
        System.out.println("Elija el tipo de chaqueta por su ID:");
        int chaquetasId = scanner.nextInt();
        Componente chaqueta = buscarComponentePorId(chaquetasId);
        if (chaqueta != null) {
            componentesSeleccionados.add(chaqueta);
        } else {
            System.out.println("Chaqueta no encontrada.");
            return;
        }

        System.out.println("Faldas y Pantalones disponibles: ");
        listarComponentesPorTipo("falda");
        listarComponentesPorTipo("pantalon");
        System.out.println("Elija una falda o un pantalón por ID:");
        int faldaOPantalonId = scanner.nextInt();
        Componente faldaOPantalon = buscarComponentePorId(faldaOPantalonId);
        if (faldaOPantalon != null) {
            componentesSeleccionados.add(faldaOPantalon);
        } else {
            System.out.println("Falda o pantalón no encontrado.");
            return;
        }

        scanner.nextLine(); // Consumir la línea restante
        System.out.println("Nombre del traje: ");
        String nombreTraje = scanner.nextLine();

        // Verificar si el nombre del traje ya existe
        for (Traje t : trajesEnAlmacen) {
            if (t.getNombreTraje().equals(nombreTraje)) {
                try {
                    throw new TrajeYaExisteException("El traje con el nombre " + nombreTraje + " ya existe en el almacén.");
                } catch (TrajeYaExisteException ex) {
                    Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        // Verificar colores
        String colorBase = componentesSeleccionados.get(0).getColor();
        for (Componente c : componentesSeleccionados) {
            if (!c.getColor().substring(0, 1).equalsIgnoreCase(colorBase.substring(0, 1))) {
                try {
                    throw new ColoresException("Los componentes del traje no tienen colores compatibles.");
                } catch (ColoresException ex) {
                    Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        // Verificar tallas
        String tallaBase = componentesSeleccionados.get(0).getTalla();
        for (Componente c : componentesSeleccionados) {
            if (!c.getTalla().equalsIgnoreCase(tallaBase) && !c.getNombre().equalsIgnoreCase("falda")) {
                try {
                    throw new TallaException("Los componentes del traje no tienen la misma talla.");
                } catch (TallaException ex) {
                    Logger.getLogger(FabricaDeTrajes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        

        Traje nuevoTraje = new Traje(nombreTraje, componentesSeleccionados);
        trajesEnAlmacen.add(nuevoTraje);

        for (Componente componente : componentesSeleccionados) {
            componentesEnAlmacen.remove(componente);
        }

        System.out.println("El traje " + nombreTraje + " ha sido añadido al almacén");
        }
     }
    private void listarComponentesPorTipo(String tipo) {
        for (Componente componente : componentesEnAlmacen) {
            if (componente.getNombre().equalsIgnoreCase(tipo)) {
                System.out.println(componente);
            }
        }
    }

    private Componente buscarComponentePorId(int id) {
        for (Componente componente : componentesEnAlmacen) {
            if (componente.getId() == id) {
                return componente;
            }
        }
        return null;
    }

    
    @Override
    public void listarTrajes() {
    System.out.println("Listando los trajes del almacén:");
    if (trajesEnAlmacen.isEmpty()) {
        System.out.println("No hay trajes en el almacén.");
    } else {
        for (Traje traje : trajesEnAlmacen) {
            System.out.println(traje);
        }
    }
  }
    
    @Override
    public void activarDesactivarRebajas() {
        sonRebajas = !sonRebajas;
        System.out.println("Rebajas " + (sonRebajas ? "activadas" : "desactivadas"));
    }

    @Override
    public void crearEnvio() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Traje> envio = new ArrayList<>();
        
        while(true){
            System.out.println("Trajes Disponibles: ");
            for(Traje traje : trajesEnAlmacen) {
                System.out.println(traje.getNombreTraje());
            }
            
            System.out.println("Ingrese el nombre del traje a añadir al envío (o 'terminar' para finalizar): ");
            String nombreTraje = scanner.nextLine();
            
            if (nombreTraje.equalsIgnoreCase("terminar")){
                break;
            }
            
            Traje trajeSeleccionado = null;
            for(Traje traje : trajesEnAlmacen){
                if(traje.getNombreTraje().equalsIgnoreCase(nombreTraje)){
                    trajeSeleccionado = traje;
                }
            }
            // con este condicional me dio cuenta si hay trajes o no en el almacen para añadirlos al envío
            if (trajeSeleccionado != null) {
                envio.add(trajeSeleccionado);
                trajesEnAlmacen.remove(trajeSeleccionado);
                System.out.println("El traje " + nombreTraje + " ha sido añadido al envío.");
            } else {
                System.out.println("El traje " + nombreTraje + " no se encuentra en el almacén");
            }
        }
        System.out.println("Envío creado con éxito. Trajes en el envío: ");
        for(Traje traje : envio){
            System.out.println(traje);
        }
    }
    private void crearComponentePrueba() {
        // Voy a crear varios componentes para probar
        Componente componente1 = new Componente(1,"blusa","M","azul",true,20.0);
        Componente componente2 = new Componente(2,"chaqueta","M","rojo",true,50.0);
        Componente componente3 = new Componente(3,"falda","M","rojo",true,30.0);
        Componente componente4 = new Componente(4,"pantalon","M","rojo",false,40.0);
        
        
        añadirComponenteAAlmacen(componente1);
        añadirComponenteAAlmacen(componente2);
        añadirComponenteAAlmacen(componente3);
        añadirComponenteAAlmacen(componente4);
        
        System.out.println("Componentes de prueba creados y añadidos al almacén");  
        listarComponentes();
    }

    
}
   
