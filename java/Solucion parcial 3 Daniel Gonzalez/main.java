import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el nombre del conjunto de datos
        System.out.print("Nombre del conjunto de datos: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario el tamaño del conjunto de datos
        System.out.print("Tamaño del conjunto de datos: ");
        int tamaño = scanner.nextInt();

        // Solicitar al usuario el número de columnas del conjunto de datos
        System.out.print("Número de columnas del conjunto de datos: ");
        int numeroDeColumnas = scanner.nextInt();

        // Solicitar al usuario el número de filas del conjunto de datos
        System.out.print("Número de filas del conjunto de datos: ");
        int numeroDeFilas = scanner.nextInt();

        // Crear un objeto de la clase ConjuntoDeDatosTabular con los datos proporcionados por el usuario
        ConjuntoDeDatosTabular conjuntoTabular = new ConjuntoDeDatosTabular(nombre, tamaño, numeroDeColumnas,numeroDeFilas);

        // Llamar al método describir() del objeto conjuntoTabular
        System.out.println("--- Conjunto de datos ---");
        System.out.println(conjuntoTabular.describir());
        System.out.println("-------------------------");
        System.out.println("Hecho por: Daniel Fernando Gonzalez Cortes");
        System.out.println("Respuestas de A, B, C del parcial de POO acontinuacion: ");
        System.out.println("1: A , 2: A , 3: B , 4: A , 5: A , 6: A , 7: D , 8: D , 9: A , 10: D");
    }
}
