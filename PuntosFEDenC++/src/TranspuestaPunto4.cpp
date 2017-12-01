/*
 * TranspuestaPunto4.cpp
 *
 *  Created on: 14/11/2017
 *      Author: Adrian Hoyos
 */

#include <iostream>
using namespace std;

int main()

{
	int i;//Variable to columns of the matrix
	int j;//Variable to rows of the matrix
        int n;//Variable to define the matrix
	int numero;
	cout<< "Defina el tamaño de la matriz"<<endl;
    cin>>n;//Read the length of the matrix
    int matriz[n][n];
    cout<<"Introduzca los numeros: ";

    for(i =0; i<n;i++)
    {
    	for(j=0; j<n;j++)
    	{
    		cin>>numero;//Read the numbers in the console.
    		matriz[i][j]=numero;//Add to the matrix the numbers
    	}

    }

    cout<<"La matriz original es"<<endl;

    for(i =0; i<n;i++)
    {
            	for(j=0; j<n;j++)
            	{
            		cout<<matriz[i][j]<<" ";//Print the original matrix
            	}
                   cout<<""<<endl;
    }

    cout<<"La transpuesta de esta matriz es"<<endl;

    for(i =0; i<n;i++)
    {
        	for(j=0; j<n;j++)
        	{
        		cout<<matriz[j][i]<<" ";//Print the transpose of the matrix
        	}
                 cout<<""<<endl;
     }

	return 0;

}




