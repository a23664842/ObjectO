package javaFT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class showSomedata {
	public static void ssData(String name) 
    {
    	
    	String[] bookexsist = new String[8];
    	Scanner book = new Scanner(System.in);
    	Scanner bookFile = new Scanner(sort.sortData(name));
    	String x = "";
    	
    	 File f = new File("book/"+name+"book.txt");
    	 try{f.createNewFile();}
    	 
    	 catch(IOException e)
    	 {
    		 System.out.println("not Found.");
 		     System.exit(0);
 		 }
    	
    	System.out.println("輸入a顯示所有分類|輸入w輸入分類");
    	x=book.next();
    	int a =0;
    	boolean booktwo = true;
    	if(x.equals("a"))
    	{
    		for(;bookFile.hasNextLine();)
    	    {
    		
    		bookexsist = stringSplit.st(bookFile.nextLine());
    		System.out.println(bookexsist[4]);
    		a++;
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
    		ssData(name);
    	}
    	if(x.equals("w"))
    	{
    		System.out.println("輸入分類");
    		x=book.next();
    		for(;bookFile.hasNextLine();)
    	    {
    		bookexsist = stringSplit.st(bookFile.nextLine());
    		if(x.equals(bookexsist[4]))
    		{
    		System.out.println(bookexsist[0]+" "+bookexsist[1]+" "+bookexsist[2]+" "+bookexsist[3]+" "+bookexsist[4]+" "+bookexsist[5]+" "+bookexsist[6]+" "+bookexsist[7]);
    		a++;
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
    		System.out.println("已全部顯示");
    	}
    	
    	
    		
    	
    	
    	bookFile.close();
    	
    	
    }

	

}
