import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ArrayList<ProductoElectronico> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar un teléfono");
            System.out.println("2. Agregar una computadora");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Solicitar información del teléfono
                    System.out.println("Ingresar información del teléfono:");
                    System.out.print("Serie a la que pertenece el telefono: ");
                    String nombreTelefono = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioTelefono = scanner.nextDouble();
                    System.out.print("Garantía (meses): ");
                    int garantiaTelefono = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    System.out.print("Marca: ");
                    String marcaTelefono = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloTelefono = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorTelefono = scanner.nextLine();

                    System.out.print("Tiempo de encendio en minutos: ");
                    double Tiempoencendido = scanner.nextInt();

                    System.out.print("Velocidad de la red: ");
                    int Velocidad = scanner.nextInt();

                    System.out.print("Memoria interna: ");
                    int Memoria = scanner.nextInt();

                    Celular celular = new Celular(nombreTelefono, precioTelefono, garantiaTelefono, marcaTelefono,
                            modeloTelefono, colorTelefono, Tiempoencendido, Velocidad, Memoria);
                    productos.add(celular);
                    break;
                case 2:
                    // Solicitar información de la computadora
                    System.out.println("Ingresar información de la computadora:");
                    System.out.print("Serie a la que pertenece la computadora: ");
                    String nombreComputadora = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precioComputadora = scanner.nextDouble();
                    System.out.print("Garantía (meses): ");
                    int garantiaComputadora = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer de entrada

                    System.out.print("Marca: ");
                    String marcaComputadora = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modeloComputadora = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorComputadora = scanner.nextLine();

                    System.out.print("Tiempo de encendido en minutos: ");
                    double tiempoEncendido = scanner.nextInt();

                    System.out.print("Velocidad de la red: ");
                    int velocidad = scanner.nextInt();

                    System.out.print("Memoria interna: ");
                    int memoria = scanner.nextInt();

                    Computadora computadora = new Computadora(nombreComputadora, precioComputadora, garantiaComputadora,
                            marcaComputadora, modeloComputadora, colorComputadora, tiempoEncendido, velocidad, memoria);
                    productos.add(computadora);
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("BYE >:)");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println("--------------------");
        } while (opcion != 3);

        // Imprimir los productos
        System.out.println("Productos:");
        for (ProductoElectronico producto : productos) {
            System.out.println("Serie: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Tiempo de garantia en meses: " + producto.getGarantia());
            producto.cargar(0);
            producto.encender();
            producto.velocidaddeinternet();
            producto.Memoriamaxima();
            System.out.println("--------------------");
        }
        scanner.close();
    }

}
