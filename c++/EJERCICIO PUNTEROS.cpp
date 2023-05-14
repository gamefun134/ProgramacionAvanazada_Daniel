/*
AUTOR: DANIEL FERNANDO GONZALEZ CORTES
FECHA: 8/02/2023
TRABAJO: EJERCICIO DE VECTORES CON PUNTEROS
*/
#include <iostream>
using namespace std;
int main() {
  float vector[3]={2.0,3.0,1.0}; // Declaramos el vector de tipo flotante de tamaño 3
  float *pvector; //Creamos el puntero del vector tipo flotante 

  for(int i=0;i<3;i++){
    pvector=&vector[i]; //Le decimos al programa que el puntero del vector es igual al vector en la posicion I

    cout<<"El valor del vector en la posicion "<<i<<" es: "<<vector[i]<<endl;

    cout<<"Valor del vector accedido desde el puntero "<<*pvector<<endl;

    cout<<"El valor en la memoria es: "<<&vector[i]<<endl;
  }
} 
