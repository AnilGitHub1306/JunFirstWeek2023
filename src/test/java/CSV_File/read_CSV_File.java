package CSV_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class read_CSV_File 
{

	@Test
	public void read_CSV_File() throws IOException
	{
		FileReader fr = new FileReader("C:\\Users\\Anil\\git\\JunFirstWeek2023\\DataFiles\\data.csv");
		
		BufferedReader br = new BufferedReader(fr);
		
		br.readLine();
		System.out.println(br.readLine());
		//br.close();
		//System.out.println("done");
		
	}
}
