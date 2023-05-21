public class ConjuntoDeDatosImagen extends ConjuntoDeDatos {
    
    private int ancho;
    private int alto;

    public ConjuntoDeDatosImagen(String nombre, int tamaño, int ancho, int alto) {
        super(nombre, tamaño);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String describir() { // Sobreescribir el método describir() de la clase padre
        return "Nombre: " + nombre + "\n" +
               "Tamaño: " + tamaño + "\n" +
               "Tipo: "+ "\n" +
               "Ancho: " + ancho + "\n" +
               "Alto: " + alto;
    }
}
