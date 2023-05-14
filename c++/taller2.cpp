/*
  Fecha: 15/02/2023
  Temas:Arrays, clase vector, aleatoriedad , funciones

  problema:
  Crear una forma para generar un conjunto de numeros aleatorios,
  tal que, se pueda contar la frecuencia y poder graficar tipo histograma
*/
#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;


void aleatorio( int vectors[],int tam);
void contar(int vectors[],int tam);
int main() {
  int tam,opcion=-1;
  int vectors[500]; //Vector para almacenar los numeros aleatorios
  
    do
    {
        cout << endl <<"-- Menu Principal Valores Aleatorios -- " << endl;
        cout << "0. Salir" << endl;
        cout << "1. Generar conjunto de valores aleatorios" << endl;
        cout << "2. Generar histograma del conjunto de valores aleatorios" << endl;
        cout << "Digite su opcion: " << endl;
        cin >> opcion;

        switch (opcion) //hacemos un switch para hacer un menu
        {
            case 1:
            
                cout<<"Ingrese el tamaño del vector: ";
                cin>>tam;
                aleatorio(vectors,tam);
                break;
            

            case 2:
            
                contar(vectors,tam);
                break;
            

            case 0:
            
                cout << "Saliendo..." << endl;
                exit (1);
                break;
            
            
            default:

                cout << "Opcion no valida" << endl;

} 
}while (opcion != 0);
}

void aleatorio( int vectors [],int tam){
  srand(time(NULL));

  for(int i=0; i<tam; i++){
        vectors[i] =  rand()% 20 ;      
    }


  for(int j=0; j<tam;j++){
    cout<<"|"<<vectors[j]<<"|";
  }

}

//Funcion para contar la frecuencia de los numeros aleatorios generados en el vector ramdom e imprimir las veces que se repite cada numero :D 
void contar(int vectors[],int tam){
  int contador=0;
  int frecuencia[20];
  for(int i=0;i<20;i++){  //HACEMOS UN FOR PARA RECORRER EL VECTOR DE FRECUENCIA
    for(int j=0;j<tam;j++){//HACEMOS UN FOR PARA RECORRER EL VECTOR DE NUMEROS ALEATORIOS
      if(vectors[j]==i){
        contador++;
      }
    }
    frecuencia[i]=contador;
    contador=0;
  }
  for(int i=0;i<20;i++){
    if(frecuencia[i]!=0){//SI LA FRECUENCIA ES DIFERENTE DE 0, IMPRIMIMOS EL NUMERO Y EL ASTERISCO
    cout<<"|"<<i<<"|";
    for(int j=0;j<frecuencia[i];j++){//IMPRIMIMOS LOS ASTERISCOS
      cout<<"*";
    }
    cout<<endl;
  }
  }
}