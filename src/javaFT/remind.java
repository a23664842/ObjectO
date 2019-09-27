package javaFT;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class remind 
{
	   public static void rebook(String name) 
	   {
		   String[] bookexsist = new String[8];
   	       Scanner bookFile = null;
   	       File f = new File("book/"+name+"book.txt");
   	       try
   	       {
   		    bookFile = new Scanner(new FileInputStream("book/"+name+"book.txt"));
   	       }
   	       catch(FileNotFoundException e)
   	       {
   		    System.out.println("File not Found.");
   		    System.exit(0);
   	       }
   	        
   	       
   		    for(;bookFile.hasNextLine();)
   	        {
   		    bookexsist = stringSplit.st(bookFile.nextLine());
   		    if(!bookexsist[6].equals("0"))
   		    {
   		      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
   		      String input = bookexsist[6]; 
   		      Date t=null; 
   		      Date u =null;
   		      Date date =null;
   		      String input2 = bookexsist[6].substring(0, bookexsist[6].length()-2)+
   		      (Integer.valueOf(bookexsist[6].substring(bookexsist[6].length()-2, bookexsist[6].length()))-4);
   		      try { 
   		    	  date =ft.parse(ft.format(new Date()));
   		          t = ft.parse(input); 
   		          u= ft.parse(input2);
   		      } catch (ParseException e) { 
   		          System.out.println("Unparseable using " + ft); 
   		      }
   		   
   		 if(date.after(t))
   		 {
   			System.out.println(bookexsist[0]+"已超過還書日期");
   		 }
   		     
   		 else if(t.equals(date))
   		      {
   		    	  System.out.println(bookexsist[0]+"已到還書日期");
   		      }
   		      else if(date.after(u))
   		      {
                 System.out.println(bookexsist[0]+"已接近還書日期");   		    	  
   		      }
   		    }
   		    
   		  
   	    }
    	bookFile.close();
   	
   	
   
	      
	   }
	

}
