
 class alumno{
    private String nombre;
    private String apellidos;
    private int edad;

    public alumno(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getnombre(){
        return nombre;
    }
    public String getapellidos(){
        return apellidos;
    }
    public int getedad(){
        return edad;
    }
}
public class practicante extends alumno{
    private String idpracticante;

    public practicante(String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        idpracticante = "unknown";
    }

    public void setidpracticante(String idpracticante){
        this.idpracticante = idpracticante;
    }

    public String getidpracticante(){
        return idpracticante;
    }

    public String toString(){
        return "" +getnombre() + "" +getapellidos() + "-" + getedad() + "-" + getidpracticante();
    }
}
