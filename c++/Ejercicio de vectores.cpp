#include <iostream>
using namespace std;
/* 
hacer un programa que mediante de vectores se busque la cantidad de numeros que se repiten 
y cuantas veces se repitieron cosecutivamente.

DANIEL FERNANDO GONZALEZ CORTES
CLASE DE 7-9 AM

*/

int main() {
	//DECLARAMOS LA VARIABLES
	
	int numeros[1000];
	int n=0,cant=1,aux=0,total=0;
	
	//LE PEDIIMOS AL USUARIO LA CANTIDAD DE NUMEROS QUE VA A DIGITAR(TAMAÑO DEL VECTOR)
	
	cout<<"Ingrese la cantidad de nuemeros que va a digitar"<<endl
	;
	cin>>n;
	//CREAMOS UN CICLO PARA PODER INGRESAR LA CANTIDAD DE NUMEROS QUE EL USUARIO DIGITO
	
	for(int i=0; i<n;i++){
		cout<<"Ingrese el "<<i+1<<" numero"<<endl;
		cin>>numeros[i];
	}
	
	//CREAMOS LOS 2 CICLOS CORRESPONDIENTES PARA PODER COMPARAR UN NUMERO CON LOS DEMAS Y VISUALISAR SI SE REPITEN
	// i empieza en 0 y j empieza una posicion despues de la i debido a que vamos a comprar el siguiente numero 
	for(int i=0; i<n; i++){
		cant=1;
		for(int j=i+1; j<n-1; j++){
			
			if(numeros[i]==numeros[j]){
				
				cant++;
			}
						
			if(cant>aux){
				
				aux=cant;
				total=numeros[i];
			}
		}
	}
	
	//Se imprime los 2 resultados los cuales son 1)el numero que mas se repite 2)la cantidad de veces
	cout<<"el numero que mas se repite es:  "<<total<<" con "<<aux<<" veces";
	return 0;
}
