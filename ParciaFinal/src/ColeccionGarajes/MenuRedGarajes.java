/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColeccionGarajes;

import ClasesVehiculo.Auto;
import ClasesVehiculo.Camion;
import ClasesVehiculo.Moto;
import ClasesVehiculo.Vehiculo;
import ColeccionGarajes.Garaje.LimiteVehiculosExcepcion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.lang.model.SourceVersion;

/**
 *
 * @author majes
 */
public class MenuRedGarajes {

    public static void main(String[] args) {
        MenuRedGarajes menu = new MenuRedGarajes();
        try {
            menu.mostrarMenu(); //llamar al menú
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private List<Garaje> redGarajes;

    public MenuRedGarajes() {
        redGarajes = new ArrayList<>();
        inicializarGarajes(); // Método para agregar algunos garajes de ejemplo.
    }

    private void inicializarGarajes() {
        redGarajes.add(new Garaje("Garaje Centro", new Ubicacion("Cundinamarca", "Bogotá", "Calle 123", "3123456789", "admin1@parqueadero.com", "pepito perez"), 50));
        redGarajes.add(new Garaje("Garaje Norte", new Ubicacion("Antioquia", "Medellín", "Carrera 45", "3109876543", "admin2@parqueadero.com", "Gumercindo"), 20));
    }

    public void mostrarMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("1. Mostrar garajes");
            System.out.println("2. Ingresar un vehículo");
            System.out.println("3. Eliminar un vehículo");
            System.out.println("4. Eliminar un garaje");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea.

            switch (opcion) {
                case 1:
                    mostrarGarajes();
                    break;
                case 2:
                    ingresarVehiculo(scanner);
                    break;
                case 3:
                    eliminarVehiculo(scanner);
                    break;
                case 4:
                    eliminarGaraje(scanner); // Llamada al método para eliminar un garaje
                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    public void eliminarGaraje(Scanner scanner) {
        if (redGarajes.isEmpty()) {
            System.out.println("No hay garajes registrados.");
            return;
        }

        // Mostrar la lista de garajes
        mostrarGarajes();
        System.out.print("Seleccione el garaje que desea eliminar (número): ");
        int indiceGaraje = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea.

        // Verificar si el índice es válido
        if (indiceGaraje < 0 || indiceGaraje >= redGarajes.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        // Eliminar el garaje
        Garaje garajeEliminado = redGarajes.remove(indiceGaraje);
        System.out.println("Garaje '" + garajeEliminado.getNombre() + "' eliminado exitosamente.");
    }

    private void eliminarVehiculo(Scanner scanner) {
        if (redGarajes.isEmpty()) {
            System.out.println("No hay garajes registrados.");
            return;
        }

        // Mostrar los garajes disponibles.
        mostrarGarajes();
        System.out.print("Seleccione el garaje por número: ");
        int indiceGaraje = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea.

        if (indiceGaraje < 0 || indiceGaraje >= redGarajes.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Garaje garajeSeleccionado = redGarajes.get(indiceGaraje);

        // Mostrar los vehículos del garaje seleccionado.
        if (garajeSeleccionado.getVehiculos().isEmpty()) {
            System.out.println("No hay vehículos en este garaje.");
            return;
        }

        System.out.println("=== Vehículos en el garaje " + garajeSeleccionado.getNombre() + " ===");
        List<Vehiculo> vehiculos = garajeSeleccionado.getVehiculos();
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ". " + vehiculos.get(i).getPlaca() + " - " + vehiculos.get(i).getMarca());
        }

        System.out.print("Seleccione el vehículo que desea eliminar por número: ");
        int indiceVehiculo = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea.

        if (indiceVehiculo < 0 || indiceVehiculo >= vehiculos.size()) {
            System.out.println("Índice de vehículo inválido.");
            return;
        }

        // Eliminar el vehículo
        Vehiculo vehiculoSeleccionado = vehiculos.get(indiceVehiculo);
        garajeSeleccionado.eliminarVehiculo(vehiculoSeleccionado);

        System.out.println("Vehículo " + vehiculoSeleccionado.getPlaca() + " eliminado del garaje " + garajeSeleccionado.getNombre() + " exitosamente.");
    }

    private void mostrarGarajes() {
        if (redGarajes.isEmpty()) {
            System.out.println("No hay garajes registrados.");
            return;
        }

        System.out.println("\n=== Lista de Garajes ===");
        for (int i = 0; i < redGarajes.size(); i++) {
            System.out.println((i + 1) + ". " + redGarajes.get(i).getNombre());
        }
    }

    private void ingresarVehiculo(Scanner scanner) throws Exception {
        if (redGarajes.isEmpty()) {
            System.out.println("No hay garajes registrados.");
            return;
        }
   
        // Mostrar garajes y seleccionar uno.
        mostrarGarajes();
        System.out.print("Seleccione el garaje por número: ");
        int indiceGaraje = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea.

        if (indiceGaraje < 0 || indiceGaraje >= redGarajes.size()) {
            System.out.println("Índice inválido.");
            return;
        }

        Garaje garajeSeleccionado = redGarajes.get(indiceGaraje);

        // Seleccionar tipo de vehículo.
        System.out.println("\n=== Tipos de Vehículos ===");
        System.out.println("1. Camión");
        System.out.println("2. Moto");
        System.out.println("3. Auto");
        System.out.print("Seleccione el tipo de vehículo: ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea.

        // Solicitar datos del vehículo.
        System.out.print("Ingrese la placa: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea.

        Vehiculo nuevoVehiculo = null;

        switch (tipoVehiculo) {
            case 1: // Camión
                System.out.print("Ingrese la capacidad de carga (en toneladas): ");
                double capacidadCarga = scanner.nextDouble();
                System.out.print("Ingrese el número de ejes: ");
                int numeroEjes = scanner.nextInt();
                System.out.println("Ingrese el cilindraje: ");
                int cilindrajeCamion = scanner.nextInt();
                nuevoVehiculo = new Camion(capacidadCarga, numeroEjes, placa, marca, precio, cilindrajeCamion);
                break;
            case 2: // Moto
                System.out.print("Ingrese el cilindraje: ");
                int cilindrajeMoto = scanner.nextInt();
                System.out.print("¿Tiene sidecar? (true/false): ");
                boolean tieneSidecar = scanner.nextBoolean();
                nuevoVehiculo = new Moto(placa, marca, precio, cilindrajeMoto, tieneSidecar);
                break;
            case 3: // Auto
                System.out.print("Ingrese el número de puertas: ");
                int numeroPuertas = scanner.nextInt();
                System.out.print("Ingrese el tipo de combustible: ");
                scanner.nextLine(); // Consumir el salto de línea.
                String tipoCombustible = scanner.nextLine();
                System.out.println("¿Tiene radio? (true/false): ");
                boolean tieneRadio = scanner.nextBoolean();
                System.out.println("¿Tiene navegador (true/false): ");
                boolean tieneNavegador = scanner.nextBoolean();
                System.out.println("Ingrese el cilindraje del auto: ");
                int cilindrajeAuto = scanner.nextInt();
                nuevoVehiculo = new Auto(tieneRadio, tieneNavegador, placa, marca, precio, cilindrajeAuto);
                break;
            default:
                System.out.println("Tipo de vehículo inválido.");
                return;
        }

        // Intentar ingresar el vehículo al garaje seleccionado.
        try {
            garajeSeleccionado.ingresarVehiculo(nuevoVehiculo);
            System.out.println("Vehículo ingresado exitosamente al garaje " + garajeSeleccionado.getNombre());
        } catch (LimiteVehiculosExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

