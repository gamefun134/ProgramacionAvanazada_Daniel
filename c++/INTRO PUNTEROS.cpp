/*
Autor:Daniel Gonzalez
Fecha: 10/02-2023
Tema:Introduccion a los punteros 
*/
#include <iostream>
using namespace std;
int main() {

  //Se crea una variable y se asigna un valor
  int variablex=27;
  //se crea un puntero 
  int *puntero;
  //Se señala el puntero a la direccion de la variable 
  puntero=&variablex;
  //se imprime el valor de la variable 
  cout<<"El valor de la variable es "<<variablex<<endl;
  //se imprime la ubicacion del puntero 
  cout<<"La ubicacion del puntero es: "<<&puntero;
  //Imprimir el vallr del puntero
  cout<<"El valor del puntero es: "<<*puntero;
}