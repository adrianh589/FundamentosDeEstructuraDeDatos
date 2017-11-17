import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class problema2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
		
		int producto=0;
		int n;
		
		bw.write("Introduzca el tamaño del arreglo");
		bw.flush();
		n=Integer.parseInt(br.readLine());
		int numeros []= new int [n];
		
		for(int i=0; i<n; i++) {
			bw.write("Introduzca el numero "+(i+1));
			bw.flush();
			numeros[i]=Integer.parseInt(br.readLine());
			producto=numeros[i]*numeros[i];
		}
		
		
		for(int j=0; j<n; j++) {
			bw.write(producto);
			bw.flush();
		}
	}

}
