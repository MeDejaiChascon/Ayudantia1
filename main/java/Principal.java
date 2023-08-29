import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {


        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Crear Auto");
            System.out.println("2. Crear Motocicleta");
            System.out.println("3. Ver Vehiculos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.next();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modeloAuto = scanner.next();
                    System.out.print("Ingrese la cantidad de puertas del auto: ");
                    int cantidadPuertaAuto = scanner.nextInt();
                    Automovil automovil = new Automovil(marcaAuto, modeloAuto, cantidadPuertaAuto);
                    listaVehiculos.add(automovil);
                    System.out.println("Auto creado exitosamente.");
                }
                case 2 -> {
                    System.out.print("Ingrese la marca de la motocicleta: ");
                    String marcaMoto = scanner.next();
                    System.out.print("Ingrese el modelo de la motocicleta: ");
                    String modeloMoto = scanner.next();
                    System.out.print("Ingrese el disenio de la motocicleta: ");
                    String disenioMoto = scanner.next();
                    Motocicleta motocicleta = new Motocicleta(marcaMoto, modeloMoto, disenioMoto);
                    listaVehiculos.add(motocicleta);
                    System.out.println("Motocicleta creada exitosamente.");
                }
                case 3 -> {
                    System.out.println("Lista de Vehiculos:");
                    for (Vehiculo automovil : listaVehiculos) {
                        System.out.println(automovil);
                    }
                }
                case 4 -> {
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        }
    }
}
