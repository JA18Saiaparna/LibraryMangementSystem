package reading;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReadingDemo {

	public static void main(String[] args)     
	{ 
		try
	   {
			
		FileReader reader=new FileReader("input.txt");
		int n=0;

		         
		         System.out.println((char)n);
		         while((n=reader.read())!=-1)
		         {
		        	 System.out.println((char)n);
		         }
		
	   }
	catch (FileNotFoundException e)
	{
		e.printStackTrace();
	} 
	catch (IOException e)
	{
		e.printStackTrace();
	}
	
		
	}

}
