import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class MatrizEspiralPunto2 {
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		bw.write("Introduzca el tamaño de la matriz: \n");
		bw.flush();
		
		int n = Integer.parseInt(br.readLine());//Read the length of the matrix
		int numeros [][]=new int [n][n];//Define the matrix
		int i,j,aux=n-1;
		
		Random rnd = new Random();//Random class to generate a random numbers
		
		bw.write("\nLa matriz original es: \n\n");
		bw.flush();
		
		//Fill the matrix with random numbers
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				numeros[i][j]=rnd.nextInt(9);
				bw.write(numeros[i][j]+" ");
				bw.flush();
			}
			bw.write("\n");
			bw.flush();
		}
		
		bw.write("\nLa matriz en espiral es: \n");
		bw.flush();
		
		//Traverse a matrix in a spiral order
		for(i = 1; i < n; i++) {//This bucle starts in the position 1 of the matrix
			for(j = i-1; j < aux; j++) {
	           bw.write( numeros[n-(aux+1)][j]+" ") ;//Print the first row of the matrix
	           bw.flush();
	        }
	        	for( j = i-1; j < aux; j++) {
	            bw.write(numeros[j][aux]+" ");//print the last column of the matrix
	            bw.flush();
	          }
	        	for(j = aux; j >= (i-1); j--) {
	            bw.write(numeros[aux][j]+" ") ;//print the last row in reverse
	            bw.flush();
	            }
	        aux--;
	        for(j = aux; j >= i; j--) {
	            bw.write(numeros[j][n-(aux+2)]+" ") ;//print the first column in reverse
	            bw.flush();
	        }
	    }

	}
		
	}
	
	
	



