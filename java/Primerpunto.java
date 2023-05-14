import java.util.Arrays;

class OrdenarArreglos {
  public static void imprimirArreglo(String mensaje, int arreglo[]){
    System.out.println(mensaje + ":[Longitud: " + arreglo.length + "]");
    //se imprime el arreglo 
    for(int i=0; i<arreglo.length; i++){
        System.out.print(" // " + arreglo[i]);
    }
    System.out.println();
  }

  public static void main (String [] args){
    int ejemplo_arreglo[]={2,-5,3,0,-2,-3,9,-10,4,5};
    float miflotante = 1.0f;
    double[][] matriz = new double [3][3];
    Arrays.sort(ejemplo_arreglo);
    //se imprime el arreglo ordenado por el metodo sort de arrays de la clase utils de java
    imprimirArreglo("Arreglo Ordenado", ejemplo_arreglo);
    //se busca el ideice del valor -2, por el metodo binarysearch de la clase arrays
    int indice = Arrays.binarySearch(ejemplo_arreglo, -2);
    System.out.println("se encontro el -2 @" + indice);
  }
}