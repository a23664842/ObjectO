package javaFT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class showData {
	public static void sData(String name) 
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
    	
    	
    	
    	int a =0;
    	boolean booktwo = true;
    	for(;bookFile.hasNextLine();)
    	{
    		
    		bookexsist = stringSplit.st(bookFile.nextLine());
    		System.out.println(bookexsist[0]+" "+bookexsist[1]+" "+bookexsist[2]+" "+bookexsist[3]+" "+bookexsist[4]+" "+bookexsist[5]+" "+bookexsist[6]+" "+bookexsist[7]);
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
    		
    	System.out.println("已全部顯示");
    	
    	bookFile.close();
    	
    	
    }
}



