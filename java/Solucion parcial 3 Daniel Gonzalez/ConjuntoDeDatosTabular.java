public class ConjuntoDeDatosTabular extends ConjuntoDeDatos{

    private int numeroDeColumnas;
    private int numeroDeFilas;

    public ConjuntoDeDatosTabular(String nombre, int tamaño, int numeroDeColumnas, int numeroDeFilas) {
        super(nombre, tamaño);
        this.numeroDeColumnas = numeroDeColumnas;
        this.numeroDeFilas = numeroDeFilas;
    }

    @Override 
    public String describir() { // Sobreescribir el método describir() de la clase padre
        return "Nombre: " + nombre + "\n" +
               "Tamaño: " + tamaño + "\n" +
               "Tipo: Tabular" + "\n" +
               "Número de columnas: " + numeroDeColumnas + "\n" +
               "Número de filas: " + numeroDeFilas;
    }
}