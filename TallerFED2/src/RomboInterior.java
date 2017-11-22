import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RomboInterior {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Random rnd = new Random();
		System.out.println("Introduzca el tamaño de la matriz");
		int m=Integer.parseInt(br.readLine());
		int numeros[][]= new int [m][m];
		int nueva_matriz[][]=new int [m][m];
		
		
		for (int i=0; i<m; i++) {
			for (int j=0;j<m;j++) {
				numeros [i][j]=rnd.nextInt(9)+1;
				System.out.print(numeros[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("El rombo interior es");
		
		int mitad=numeros.length/2;
		
		//Si el numero ingresado es par, hara el siguiente procedimiento indicando que la matriz es par
		
		
			
			//Este procedimiento imprime la parte superior izquierda del rombo*********
			for (int i=0; i<numeros.length/2; i++) 
			{
				for (int j=mitad-1;j<numeros.length/2;j++) 
				{
					nueva_matriz[i][j]=numeros[i][j];
					System.out.print(numeros[i][j]+" "); 
					
					
				}
				mitad--;
			}
			
			mitad=numeros.length/2;
		
			
		//Este procedimiento imprime la parte superior derecha del rombo
			for (int i=0; i<numeros.length/2; i++) 
			{
				for (int j=numeros.length/2;j<m-((numeros.length/2)-1);j++) 
				{
					nueva_matriz[i][j]=numeros[i][j];
					System.out.print(numeros[i][j]+" ");
				}
				m++;
			}
			
			m=numeros.length;
			
			//Este procedimiento imprime la parte inferior izquierda del rombo************
			for (int i=numeros.length/2; i<m; i++) 
			{
				for (int j=i-(m/2);j<mitad;j++) 
				{
					nueva_matriz[i][j]=numeros[i][j];
					System.out.print(numeros[i][j]+" "); //ESTE YA ESTA HECHO***********
				}
			}
			
			
			
			//Este procedimiento imprime la parte inferior derecha del rombo
			for (int i=mitad; i<numeros.length; i++) 
			{
				for (int j=mitad;j<m;j++) 
				{
					nueva_matriz[i][j]=numeros[i][j];
					System.out.print(numeros[i][j]+" ");
					
				}
				m--;
			}
			
		
			
		System.out.println("");
		System.out.println("");
		for(int i=0;i<numeros.length;i++) {
			for(int j=0; j<numeros.length;j++) {
				if(nueva_matriz[i][j]==0)
				{
					System.out.print("  ");
				}else{
					System.out.print(nueva_matriz[i][j]+" ");
				     }
			}
			System.out.println("");
		}
		
		
		}
	
		
	}