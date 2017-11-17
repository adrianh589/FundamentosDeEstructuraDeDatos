import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problema1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
		
		String line =br.readLine();
		String k=br.readLine();
		int tamaño=Integer.parseInt(br.readLine());
		
		String arregl [] = new String [tamaño];
		String [] arreglo = line.split(",");
		
		int parejas=0;
		
		for(int i=0;i<arregl.length;i++) {
			if((int)arregl[i]-(int)arregl[1]==k) {
				
			}
	}
		
		
    }
	
}
