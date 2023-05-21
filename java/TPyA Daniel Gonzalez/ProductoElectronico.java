public abstract class ProductoElectronico { // clase abstracta ProductoElectronico
    private String nombre;
    private double precio;
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) { // constructor
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public abstract void cargar(int primeracarga); // metodo abstracto

    public abstract void encender(); // metodo abstracto

    public abstract void velocidaddeinternet(); // metodo abstracto

    public abstract void Memoriamaxima(); // metodo abstracto
}
