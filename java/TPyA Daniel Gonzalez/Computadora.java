
public class Computadora extends ProductoElectronico {
    private String marca;
    private String modelo;
    private String color;
    private double encendio;
    private int velocidad;
    private int memoria;

    public Computadora(String nombre, double precio, int garantia, String marca, String modelo, String color,
            double encendio, int velocidad, int memoria) {
        super(nombre, precio, garantia);
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.encendio = encendio;
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getEncendio() {
        return encendio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override // sobreescribir
    public void cargar(int primeracarga) { // metodo de carga

        System.out.println("Cargando computadora"); // imprimir 
        System.out.println("Marca " + marca + " Modelo " + modelo + " Color " + color); // imprimir marca, modelo y color
    }

    @Override // sobreescribir
    public void encender() { // metodo de encendido
        System.out.println("Tiempo de Encendiendo de la computadora"); // imprimir tiempo de encendido
        System.out.println(encendio + " Minutos"); // imprimir tiempo de encendido
    }

    @Override // sobreescribir
    public void velocidaddeinternet() { // metodo de velocidad de internet
        System.out.println("Velocidad de internet de computadora"); // imprimir velocidad de internet
        System.out.println(velocidad + " Mbps"); // imprimir velocidad de internet
    }

    @Override // sobreescribir
    public void Memoriamaxima() { // metodo de memoria maxima
        System.out.println("Memoria maxima de computadora"); // imprimir memoria maxima
        System.out.println(memoria + " GB"); // imprimir memoria maxima
    }
}