#include <iostream>
#include <fstream>
using namespace std;
/******************************************************************************
PROBLEMA: 
Se necesita crear una aplicacion que solicite datos de usuarios,para posteriormente 
ser almacenadados en un fichero. El almacenamiento ha de ser cada dato en una linea
No se desea o permite que se almacene mas de una palabra por linea (NO ESPACIOS EN BLANCO)

Solucion:
*Se usa la libreria fstream
*Se crea una estructura para almacenar los datos
*Se almacena los datos de la estructura en el fichero
*******************************************************************************/
//creo la estructura necesaria para el archivo
struct persona{
 string nombre;
 string apellido;
 int edad;
};

//se crea la funcion principal 
int main() {
  //se declaran variables a usar 
  int i,j,k=0,cantidad_usuarios,a;

  //se crea fichero en la biblioteca F stream
  ofstream salida("usuarios.txt");

  //bienvenida

  cout<<"Bienvenido al Gym Con archivos"<<endl;

  //se solicita la cantidad de personas a ingresar

cout<<"Cuantas personas desea añadir?"<<endl;
  cin>>cantidad_usuarios;
  //se crea un vector de estructuras

  persona usuarios[cantidad_usuarios];
  //se crea el bucle para ingresar los datos
  if (salida.is_open()){
  for(i=0;i<cantidad_usuarios;i++){
    cout<<"Ingrese el nombre "<< i+1<<endl;
    cin>>usuarios[i].nombre;
    salida<<usuarios[i].nombre<<endl;

    cout<<endl<<"Ingrese el apellido "<< i+1<<endl;
    cin>>usuarios[i].apellido;
    salida<<usuarios[i].apellido<<endl;
    
    cout<<endl<<"Ingrese la edad "<< i+1<<endl;
    cin>>usuarios[i].edad;
    salida<<usuarios[i].edad<<endl;
  }
    }
  //si el archivo no se pudo crear
  else {
    cout<<endl<<"el archivo no se pudo crear :(";
    }
  //cerrar el archivo
  salida.close();
  
   //SE ABRE EL ARCHIVO PARA LEERLO
    ifstream entrada("usuarios.txt");
    cout<<"LOS NOMBRES DE LOS USUARIOS CON SU EDAD SON: "<<endl;
    //abrir el archivo
    if (entrada.is_open()){
      //se crea un bucle para leer el archivo
      while(!entrada.eof()){
        //se lee el archivo
        entrada>>usuarios[k].nombre;
        entrada>>usuarios[k].apellido;
        entrada>>usuarios[k].edad;
        //se imprime el archivo
        cout<<usuarios[k].nombre<<endl;
        cout<<usuarios[k].apellido<<endl;
        cout<<usuarios[k].edad<<endl;
        k++;
      }
    }
    //si el archivo no se pudo abrir
    else {
      cout<<endl<<"el archivo no se pudo abrir :(";
    }
    //cerrar el archivo
    entrada.close();
  }