package reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingDataKB {
	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		 try 
		 {
			 System.out.println("enter your name");
			 String name= br.readLine();
			 System.out.println(name);
			 System.out.println("enter salary");
			  String str=br.readLine();
			    int sal=       Integer.parseInt(str);
			    System.out.println(sal);
						 
			 
		} 
		 catch (IOException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
