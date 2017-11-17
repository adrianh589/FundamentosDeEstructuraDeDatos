import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int beneficio=0;
		int menor=999999999;
		int mayor = 0;
		
		int precios []= new int [7];
		
		for(int i =0; i<7; i++) {
			System.out.println("Introduzca el precio "+(i+1)+" del producto");
			precios[i]=Integer.parseInt(br.readLine());
			
			if(precios[i]<menor) {
				menor=precios[i];
			}
			
			if(precios[i]>mayor) {
				mayor=precios[i];
			}
			
		}

		beneficio=mayor-menor;
		
		System.out.println("El beneficio es de "+beneficio);
		
	}

}
