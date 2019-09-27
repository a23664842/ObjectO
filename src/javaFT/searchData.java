package javaFT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class searchData {
	public static void fData(String name) 
    {
    	
    	String[] bookexsist = new String[8];
    	Scanner book = new Scanner(System.in);
    	Scanner bookFile = null;
    	String x = "";
    	
    	 File f = new File("book/"+name+"book.txt");
    	 try{f.createNewFile();}
    	 
    	 catch(IOException e)
    	 {
    		 System.out.println("not Found.");
 		     System.exit(0);
 		 }
    	try
    	{
    		bookFile = new Scanner(new FileInputStream("book/"+name+"book.txt"));
    		
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not Found.");
    		System.exit(0);
    	}
    	System.out.println("輸入關鍵字");
    	x=book.next();
    	int a =0;
    	boolean booktwo = true;
    		for(;bookFile.hasNextLine();)
    	    {
    		
    		bookexsist = stringSplit.st(bookFile.nextLine());
    		for(int i=0;i<8;i++) 
    		{
    			if(x.equals(bookexsist[i])) 
    			{
    				System.out.println(bookexsist[0]+" "+bookexsist[1]+" "+bookexsist[2]+" "+
    						bookexsist[3]+" "+bookexsist[4]+" "+bookexsist[5]+" "
    						+bookexsist[6]+" "+bookexsist[7]);
    				a++;
    				break;
    			}
    		}
    		
    		if(a>10) 
    		  {
    			System.out.println("輸入e離開|任意輸入下一頁");
    		x=book.next();
    		
    		a=0;
    		  }
    		if(x.equals("e"))
    		  {
    			break;
    		  }
    	    }
    		
    	
    	
    	
    	
    		
    	
    	
    	bookFile.close();
    	
    	
    }

	

}
