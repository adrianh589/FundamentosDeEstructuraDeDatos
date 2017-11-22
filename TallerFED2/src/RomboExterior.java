import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RomboExterior {

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
		System.out.println("El rombo exterior es");
		
		
		int mitad=numeros.length-2;
		//Esta es la parte superior izquierda de la figura*****************
		for (int i=0; i<=(numeros.length/2); i++) //Este ya esta hecho*****
		{
			for (int j=0;j<mitad-((m/2)-2);j++) 
			{
				//nueva_matriz[i][j]=numeros[i][j];
				//System.out.print(numeros[i][j]+" "); 
			}
			//System.out.println("");
			//mitad--;
		}
		
		//Esta es la parte superior derecha de la figura
		for (int i=0; i<=numeros.length; i++) 
		{
			for (int j=mitad-((m/2)-2);j<numeros.length;j++) //Este ya esta hecho*********
			{
				//nueva_matriz[i][j]=numeros[i][j];
				//System.out.print(numeros[i][j]+" "); 
			}
			//System.out.println("");
			//mitad++;
		}
		
		//Esta es la parte inferior izquierda de la figura
		for (int i=numeros.length/2; i<numeros.length; i++) 
		{
			for (int j=0;j<numeros.length/mitad;j++) 
			{
				nueva_matriz[i][j]=numeros[i][j];
				System.out.print(numeros[i][j]+" "); 
			}
			System.out.println("");
			mitad++;
		}
		

	}

}
