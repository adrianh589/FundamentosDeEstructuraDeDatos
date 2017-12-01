import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class RomboExterior {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);//Buffer to read the length of the matrix
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));//Buffer to write in console
		
		bw.write("Introduzca el tamaño de la matriz: ");
		bw.flush();
		int m=Integer.parseInt(br.readLine());//Read the length of the matrix in console
		
		
		bw.write("Introduzca los numeros separados por comas diferente de 0");
		bw.flush();
		
		String[] numbers_commas=br.readLine().split(",");//Array to read numbers in the console separated with commas 
		int numbers[][]= new int [m][m];//In this matrix add a numbers  sepparated with commas
		int new_matrix[][]=new int [m][m];//Create a empty matrix to extract numbers in the matrix "numbers"
		int cont=0;//Create a variable cont to move the index in the array "numbers_commas"
		
		
		//Fill matrix with numbers
		for (int i=0; i<m; i++) 
		{
			for (int j=0;j<m;j++)
			{
				numbers [i][j]=Integer.parseInt(numbers_commas[cont]);
				cont++;
				bw.write(numbers[i][j]+" ");
				bw.flush();
			}
			bw.write("\n");
			bw.flush();
		}
		
		bw.write("\nEl rombo exterior es:");
		bw.flush();
		
		
		int half=numbers.length/2;//Create a variable half to move the index j 
		
		if(m%2==0) 
		{//If the number entered by the user is even...
			
		//Upper left of the diamond
		for (int i=0; i<=numbers.length/2; i++) 
		{
			for (int j=0;j<half-((m/2)-m/2);j++) 
			{
				new_matrix[i][j]=numbers[i][j];//add to new_matrix
			}
			half--;
		}
		
		half=numbers.length/2;//reinitialize the variable half
		
		//Upper right of the diamond
		for (int i=0; i<numbers.length; i++) 
		{
			for (int j=half;j<numbers.length;j++) 
			{
				new_matrix[i][j]=numbers[i][j];//add to new_matrix
			}
			half++;
		}
		
		half=numbers.length/2;//reinitialize the variable half
		
		//Lower left of the diamond
		for (int i=numbers.length/2; i<numbers.length; i++) 
		{
			for (int j=0;j<half-((m/2)-1);j++) 
			{
				new_matrix[i][j]=numbers[i][j];//add to new_matrix
			}
			half++;
		}
		
		half=numbers.length/2;//reinitialize the variable half
		
		//Lower right of the diamond
		for (int i=numbers.length/2; i<numbers.length; i++) 
		{
			for (int j=half+((m/2)-1);j<numbers.length;j++) 
			{
				new_matrix[i][j]=numbers[i][j];//add to new_matrix
			}
			half--;
		}
		
		
	   }else //If the number entered by the user is odd...
	      {
		
		        //Upper left of the diamond
				for (int i=0; i<numbers.length/2; i++) 
				{
					for (int j=0;j<half-((m/2)-m/2)+1;j++) 
					{
						new_matrix[i][j]=numbers[i][j];//add to new_matrix
					}
					half--;//reinitialize the variable half
				}
				
				half=numbers.length/2;
				
				//Upper right of the diamond
				for (int i=0; i<=numbers.length; i++) 
				{
					for (int j=half;j<numbers.length;j++) 
					{
						new_matrix[i][j]=numbers[i][j];//add to new_matrix
					}
					half++;//reinitialize the variable half
				}
				
				half=numbers.length/2;
				
				//Lower left of the diamond
				for (int i=numbers.length/2; i<numbers.length; i++) 
				{
					for (int j=0;j<half-((m/2)-1);j++) 
					{
						new_matrix[i][j]=numbers[i][j];//add to new_matrix
						
					}
					half++;//reinitialize the variable half
				}
				
				half=numbers.length/2;
				
				//Lower right of the diamond
				for (int i=numbers.length/2; i<numbers.length; i++) 
				{
					for (int j=half+(m/2);j<numbers.length;j++) 
					{
						new_matrix[i][j]=numbers[i][j];//add to new matrix
					}
					half--;//reinitialize the variable half
				}
			
	         }	
		
		
		bw.write("\n\n");
		bw.flush();
		
		//Print in diamond figure
		for(int i=0;i<numbers.length;i++) 
		{
			for(int j=0; j<numbers.length;j++) 
			{
				if(new_matrix[i][j]==0)//Print a double space if in that position there is no number.
				{
					bw.write("  ");
					bw.flush();
				}else
				    {
                       bw.write(new_matrix[i][j]+" ");
                       bw.flush();
				    }
			}
			bw.write("\n");
			bw.flush();
		}
		

	}

}
