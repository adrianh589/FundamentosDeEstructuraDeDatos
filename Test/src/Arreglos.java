import java.util.Random;

public class Arreglos {
	public static void main (String[]args)
	{
		//int [] arreglo = {123,654,897,361,2316,89,654,321,847,3654654,4565400}; 
		
		Random rd = new Random();
		int [] arreglo = new int [100 + rd.nextInt(401)];
		
		for(int i = 0; i < arreglo.length; i++)
		{
			arreglo [i] = rd.nextInt();
		}
		
		int min= Integer.MAX_VALUE, max = Integer.MIN_VALUE;//max value sera un entero grande, min value sera un entero minimo
		int counter =0;
		
		for(int i = 0; i < arreglo.length; i++)
		{
			min = arreglo[i] < min ? arreglo [i]:min;//min se compara con la variable, en caso de ser minimo seguira siendo el mismo arreglo en caso contrario seguira siendo min
			max = arreglo[i] > max ? arreglo [i]:max;//igual, solo cambia el max
			counter += arreglo[i];
			
			//el signo de interrogacion(?) funciona como un if
		}
		
		counter /= arreglo.length;
		
		System.out.println("El minimo es: "+ min + " y el maximo es: "+ max + " e el promedio es: "+counter);
	}
}
