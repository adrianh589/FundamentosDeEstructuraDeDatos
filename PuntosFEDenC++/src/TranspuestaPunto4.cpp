/*
 * TranspuestaPunto4.cpp
 *
 *  Created on: 14/11/2017
 *      Author: user
 */

#include <iostream>
using namespace std;

int main()

{
	int i;
	int j;
    int n;
	int numero;
	cout<< "Defina el tamaño de la matriz"<<endl;
    cin>>n;
    int matriz[n][n];
    cout<<"Introduzca los numeros: ";

    for(i =0; i<n;i++)
    {
    	for(j=0; j<n;j++){
    		cin>>numero;
    		matriz[i][j]=numero;
    	}

    }

    cout<<"La matriz original es"<<endl;

    for(i =0; i<n;i++) {
            	for(j=0; j<n;j++){
            		cout<<matriz[i][j]<<" ";
            	}
                   cout<<""<<endl;
            }

    cout<<"La transpuesta de esta matriz es"<<endl;

    for(i =0; i<n;i++) {
        	for(j=0; j<n;j++){
        		cout<<matriz[j][i]<<" ";
        	}
                 cout<<""<<endl;
        }

	return 0;

}




