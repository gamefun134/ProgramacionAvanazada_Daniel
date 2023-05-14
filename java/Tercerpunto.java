import java.util.*;
import java.text.*;

public class Tercerpunto{
    public static void main(String args[]){
        //formato fecha:
        Formatter fecha = new Formatter();
        Calendar cal = Calendar.getInstance();
        fecha = new Formatter();
        fecha.format("%tB %tb %tm",cal ,cal , cal);
        //formato hora 
        Date hora = new Date();
        String strFormatoHora = "HH:mm: ss a";
        SimpleDateFormat forma = new SimpleDateFormat(strFormatoHora);
        //se imprime
        System.out.println("Presentacion 1 de la fecha y hora: ");
        System.out.println(fecha + " " + forma.format(hora) + "\n");
        //otra forma
        fecha.format("%tc", cal);
        System.out.println("Presentacion 2 de la fecha y hora: ");
        System.out.println(fecha + "\n");
        //otra forma
        Date d = new Date();
        System.out.println("Presentacion 3 de la fecha y hora: ");
        System.out.println(d.toString());
    }
    
}