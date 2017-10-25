import java.io.*;
import java.util.Random;

public class CreateFiles {
	
	static Random rd = new Random();
	
	public CreateFiles()
	{
		int reads = 1000000;
		
		try
		{
			BufferedWriter bw = new BufferedWriter ( new FileWriter ( "sequences.umd" ) );
			
			for(int i = 0; i<reads; i++)
			{
				bw.write( createRead() );
			}
				
			bw.flush();	
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public String createRead()
	{
		int number, length;
		
		number=Math.abs(rd.nextInt());
		length = 5 + rd.nextInt(25);
		
		return (number + "," + (number + length) + "," + createSequence(length) + "\n");
	}
	
	
	public String createSequence(int length)
	{
		String sequence = "";
		
		for (int i = 0; i<length; i++)
		{
			switch(rd.nextInt(4))
			{
			case 0: sequence += "A"; break;
			case 1: sequence += "C"; break;
			case 2: sequence += "G"; break;
			case 3: sequence += "T"; break;
			}
		}
		
		return sequence;
	}
	
	
    public int countReads(String motif)
{
	int lines = 0;
	
	try
	{
		BufferedReader br = new BufferedReader ( new FileReader ( "sequences.umd" ) );
		String read;
		read = br.readLine();
		
		while(read != null)
		{
			if( read.split(",")[2].contains(motif) )
			{
				lines += 1;
			}
			
			read = br.readLine();
		}
	}
      catch(Exception ex) {}
	
	return lines;
}
    
	public static void main(String[] args) {
		CreateFiles cf = new CreateFiles();
		System.out.println( cf.countReads ("AGTA" ));
	}

}
