import java.io.IOException;

public class InsertionSort
{

	public static void main(String[] args) throws IOException 
	{
		
		int[] numbers = {8,12,7,5,3,10,11,4,6,9,2,1};
		int swap,i,j,counter=0;
		
		for(i = 0; i<numbers.length;i++)
		{
			swap=numbers[i];
			
			for(j = i - 1; j>=0;j--)
				if(numbers[i]>numbers[j])
				
					break;
					
					for (int k = i;k>j+1;k--)
						numbers[k] = numbers[k - 1];//Swaps
						counter+=1;
						
						numbers[j+1]=swap;
		}
		
		for(i=0; i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("\nCantidad de intercambios: "+counter);
	 }
}