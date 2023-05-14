 public class Herenciaprincipal{
     public static void main(String[] args){
            profesor profesor1 = new profesor("Daniel", "Gonzalez", 18);
     }

     System.out.println(profesor1.toString());

     alumno alumno1 = new alumno ("alumno1", "Flores", 18);
     alumno1.setidalumno("alumno123456789");
        System.out.println(alumno1.toString());

        practicante practicante1 = new practicante("practicante1", "Carvajal", 18);
        practicante1.setidpracticante("practicante123456789");
        System.out.println(practicante1.toString());
 }