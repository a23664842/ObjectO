package javaFT;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class stringSplit {

	public static String[] st(String Nline) 
	{
		String[] Oline = Nline.split(" ");
		
		
		return Oline;
	}
	public static int Linecount(String Fname)
	{
		int count=0;
    	Scanner IDFile = null;
    	
    	try
    	{
    		IDFile = new Scanner(new FileInputStream("book/"+Fname+"book.txt"));
    		
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not Found.");
    		System.exit(0);
    	}
    	for(;IDFile.hasNextLine();)
    	{
    		count++;
    		IDFile.nextLine();
    	}
    	return count;
	}
	
}