/*
AUTOR: DANIEL FERNANDO GONZALEZ CORTES
FECHA: 8/02/2023
TRABAJO: EJERCICIO DE LA BIBLIOTECA VECTOR
*/
#include <iostream>
#include <vector>
using namespace std;
int main() {
  int i,j;
  vector<int>numero; //un vector de tipo int y el nombre de la veriabale numero
  //Se asigna el tamaño de 5 al vector y se inicializa en 1
  numero.assign(5,1);
  //se imprime los valores del vector 
  cout<<"contenido incial de vector"<<endl;
  for(i=0;i<numero.size();i++){
    cout<<numero[i]<<endl;
  }
    numero.insert(numero.end(),8);
  numero.insert(numero.end()-1,2);
  numero.insert(numero.end()-4,3);
  //cambio de variables del vector
  cout<<"Cambio de variables del vector"<<endl;
  for(j=0;j<numero.size();j++){
    cout<<numero[j];
}
}