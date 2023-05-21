import java.util.ArrayList;

public class AnalizadorDeDatos {
    
    private ArrayList<ConjuntoDeDatos> conjuntoDeDatos = new ArrayList<>();

    public void agregarConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        this.conjuntoDeDatos.add(conjuntoDeDatos);
    }

    public void eliminarConjuntoDeDatos(ConjuntoDeDatos conjuntoDeDatos) {
        this.conjuntoDeDatos.remove(conjuntoDeDatos);
    }

    public void describirConjuntoDeDatos() {
        for (ConjuntoDeDatos conjuntoDeDatos : conjuntoDeDatos) {
            System.out.println(conjuntoDeDatos.describir());
        }
    }
}