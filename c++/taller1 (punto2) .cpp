//creado por: Daniel fernando gonzalez cortes
//fecha: 13/02/2022
//descripcion: taller 1 (Parte 2)
//
#include <iostream>
#include <fstream>
using namespace std;

struct  Usuario
{
    string nombre;
    string apellido;
    int edad;
};

void imprimir(int cant, Usuario *puntero);

int main()
{
    int cant=10;
    Usuario usuarios [cant]; //areglo de la estructura usuario
    Usuario *puntero; //puntero de la estructura usuario
    puntero = usuarios; //asignacion del puntero a la estructura

    cout << "ingrese la cantidad de usuarios: ";
    cin >> cant;

    imprimir(cant,puntero);

    return 0;
}

void imprimir(int cant, Usuario *puntero)
{
    //Se crea una ciclo para ingresar los datos de los usuarios
    for (int i = 0; i < cant; i++)
    {
        cout << "ingrese el nombre del usuario: ";
        cin >> puntero->nombre;
        cout << "ingrese el apellido del usuario: ";        
        cin >> puntero->apellido;
        cout << "ingrese la edad del usuario: ";
        cin >> puntero->edad;
        puntero++;
    }
    puntero = puntero - cant; //se regresa el puntero a la posicion inicial

    //se crea un ciclo para imprimir los datos de los usuarios en el archivo
    ofstream salida("facturas.txt");
    for (int j = 0; j < cant; j++)
    {
        salida << "nombre: " << puntero->nombre << endl;
        salida << "apellido: " << puntero->apellido << endl;
        salida << "edad: " << puntero->edad << endl;
        puntero++;
    }
    salida.close();
}
