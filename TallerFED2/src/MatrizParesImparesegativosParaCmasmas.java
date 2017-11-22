import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class MatrizParesImparesegativosParaCmasmas {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader (isr);
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		bw.write("Introduzca el tamaño de la matriz: \n");
		bw.flush();
		
		int n = Integer.parseInt(br.readLine());
		int numbers [][]=new int [n][n];
		int par_numbers_counter = 0;
		int impar_numbers_counter = 0;
		int positive_numbers_counter = 0;
		int negative_numbers_counter=0;
		int i,j;
		
		Random rnd = new Random();
		
		bw.write("\nLa matriz original es: \n\n");
		bw.flush();
		
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				numbers[i][j]=rnd.nextInt(20) -5;
				bw.write(numbers[i][j]+" ");
				bw.flush();
			}
			bw.write("\n");
			bw.flush();
		}
		
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				if (numbers[i][j]>=0) {
					positive_numbers_counter +=1;
				}else {
					negative_numbers_counter+=1;
				}if(numbers[i][j]%2==0) {
					par_numbers_counter+=1;
				}else {
					impar_numbers_counter+=1;
				}
			}
		}
		
		
		System.out.println("");
		
		
		System.out.println("Hay "+positive_numbers_counter+" numeros positivos y son: ");
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				if (numbers[i][j]>=0) {
					System.out.print(numbers[i][j]+" ");
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("\nHay "+negative_numbers_counter+" numeros negativos y son: ");
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				if (numbers[i][j]<0) {
					System.out.print(numbers[i][j]+" ");
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("\nHay "+par_numbers_counter+" numeros pares y son: ");
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				if (numbers[i][j]%2==0) {
					System.out.print(numbers[i][j]+" ");
				}
			}
		}
		
		System.out.println("");
		
		System.out.println("\nHay "+impar_numbers_counter+" numeros impares y son: ");
		for ( i=0; i<n;i++) {
			for( j=0;j<n;j++) {
				if (numbers[i][j]%2!=0) {
					System.out.print(numbers[i][j]+" ");
				}
			}
		}
		
		

	}

}
