abstract class  ConjuntoDeDatos {

    public String nombre;
    public int tamaño;
    
    public ConjuntoDeDatos(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public abstract String describir(); // Método abstracto
}