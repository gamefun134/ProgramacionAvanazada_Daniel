//creado por: Daniel fernando gonzalez cortes
//fecha: 13/02/2022
//descripcion: taller 1(parte 1)
#include <iostream>
#include <cstdlib>
#include <ctime> 
using namespace std;
int llenar_numeros_aleatorios(int vector[]);
int main() {
    int vector[10], R_vector[10];
    int *puntero;
    
    R_vector[10]=llenar_numeros_aleatorios(vector);

    //genere un puntero que apunta al vector
    puntero = vector;
    //imprime el vector
    cout <<"Imprimir el vector"<<endl;
    for(int i=0; i<10; i++){
        cout << "|" << *puntero << "|";
        puntero++;
    }

    //Imprimir las direcciones del contenido del array de la funcion usando el puntero
    puntero = vector;
    cout <<endl<<"Imprimir las direcciones del contenido del array de la funcion usando el puntero"<<endl;
    for(int i=0; i<10; i++){
        cout << "|" << puntero << "|";
        puntero++;
    }

    return 0;
}

int llenar_numeros_aleatorios(int vector[]){
    srand(time(NULL));  //se inicializa la semilla  con la hora del sistema
    for(int i=0; i<10; i++){
        vector[i] = 0 + rand()% 25 ;  //se llena el vector con numeros aleatorios de 0 a 25    
    }
   return vector[10];
}

