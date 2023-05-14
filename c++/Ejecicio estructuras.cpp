#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
/*

fecha: 1/02/2023
Autor: Daniel Gonzalez

Tema:Primer ejercicio de estructuras de datos
Problema: Se tiene un GYM, el cual solicita hacer el registro de usuarios.
La catidad de registros deben ser indicadas al principio. Los datos solicitados
deberian ser exaustivos.Finalmente, Se debe presentar o imprimir los nombre de 
los usuarios con registro satosfactorio.

-Datos a solicitar
    * nombre
    * edad
    * genero
    * fecha de inscripcion
    * Hijos
    * Masa muscular
    * Plan
    * Franja horaria
    * Lesiones 
    * Altura
*/
struct datospersonas
{
	string nombre;
	int edad;
	string genero;
	string fecha;
	int hijo;
	float masa;
	string plan;
	string franja;
	string lesiones;
	float altura;
};

int main(int argc, char** argv) {

	//se crea las variables contadoras o auxiliares a usar

	int cantidad;

	//Da le bienvenida al GYM
	//se solicita la cantidad de personas a registrar
	cout<<"Bienvenido al GYM"<<endl;
	cout<<"ingrese la cantidad de personas a registrar: ";
	cin>>cantidad;

	//se crea el vector de la estructura datos personas
	datospersonas personas[cantidad];

	//se hace un bucle para solicitar los datos de cada persona

	for(int i=0; i<cantidad; i++){
		
		//se ingresa el datos para rellenar la estructura datos personas
		cout<<"ingrese el nombre de la persona "<<i+1<<": ";
		cin>>personas[i].nombre;
		cout<<"ingrese la edad de la persona "<<i+1<<": ";
		cin>>personas[i].edad;
		cout<<"ingrese el genero de la persona "<<i+1<<": ";
		cin>>personas[i].genero;
		cout<<"ingrese la fecha de inscripcion de la persona "<<i+1<<": ";
		cin>>personas[i].fecha;
		cout<<"ingrese la cantidad de hijos de la persona "<<i+1<<": ";
		cin>>personas[i].hijo;
		cout<<"ingrese la masa muscular de la persona "<<i+1<<": ";
		cin>>personas[i].masa;
		cout<<"ingrese el plan de la personas "<<i+1<<": ";
		cin>>personas[i].plan;
		cout<<"ingrese la franja horaria de la persona "<<i+1<<": ";
		cin>>personas[i].franja;
		cout<<"ingrese las lesiones de la persona "<<i+1<<": ";
		cin>>personas[i].lesiones;
		cout<<"ingrese la altura de la persona "<<i+1<<": ";
		cin>>personas[i].altura;
	}

	//se imprime los datos de las personas registradas
	for(int i=0; i<cantidad; i++){
		cout<<"Nombre: "<<personas[i].nombre<<endl;
		cout<<"Edad: "<<personas[i].edad<<endl;
		cout<<"Genero: "<<personas[i].genero<<endl;
		cout<<"Fecha de inscripcion: "<<personas[i].fecha<<endl;
		cout<<"Hijos: "<<personas[i].hijo<<endl;
		cout<<"Masa muscular: "<<personas[i].masa<<endl;
		cout<<"Plan: "<<personas[i].plan<<endl;
		cout<<"Franja horaria: "<<personas[i].franja<<endl;
		cout<<"Lesiones: "<<personas[i].lesiones<<endl;
		cout<<"Altura: "<<personas[i].altura<<endl;
	}
	return 0;
}
