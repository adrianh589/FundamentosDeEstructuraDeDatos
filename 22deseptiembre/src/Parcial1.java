import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Parcial1 {

	public static void main (String [] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String input = br.readLine();
		
		char result ='1';
		int max = 0;
		
		for(int i = 0; i < alphabet.length(); i++)
			if(counterCharacters(input, alphabet.charAt(i)) > max)
		{
			result = alphabet.charAt(i);
			max = counterCharacters (input, alphabet.charAt(i));
		}
		
		bw.write("El caracter que mas se repite es '"+result +
				"' y aparece " + max + " veces\n");
		bw.flush();
		
		generateKMeans(3,"");
	}
	
	public static int counterCharacters (String input, char character)
	{
		int counter = 0;
		
		for(int i = 0; i < input.length(); i++)
			counter += input.charAt(i) == character ? 1 : 0;
		
		return counter;
	}
	
	public static void generateKMeans (int length, String motif) throws IOException
	{
		if (length == 1)
		{
			BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter (System.out));
			
			bw.write(motif + "A\n");
			bw.write(motif + "C\n");
			bw.write(motif + "G\n");
			bw.write(motif + "T\n");
			bw.flush();
		}
		else
		{
			generateKMeans (length - 1, motif + "A");
			generateKMeans (length - 1, motif + "C");
			generateKMeans (length - 1, motif + "G");
			generateKMeans (length - 1, motif + "T");
		}
	}
	
	
}


