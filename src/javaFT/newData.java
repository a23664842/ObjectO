package javaFT;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class newData {

	
    public static void nData(String name) 
    {   
    	String[] bookimformation = new String[8];
    	String[] bookexsist = new String[8];
    	Scanner book = new Scanner(System.in);
    	Scanner bookFile = null;
    	PrintWriter bookdata = null;
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
    		bookdata = new PrintWriter(new FileWriter(f,true));
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not Found.");
    		System.exit(0);
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	if(stringSplit.Linecount(name)<128) 
    	{	
    	
    	System.out.println("�п�J�ѦW");
    	bookimformation[0] = book.next();
    	System.out.println("�п�J�@��");
    	bookimformation[1] = book.next();
    	System.out.println("�п�J�X����");
    	bookimformation[2] = book.next();
    	System.out.println("�п�J�s��");
    	bookimformation[3] = book.next();
    	System.out.println("�п�J����");
    	bookimformation[4] = book.next();
    	System.out.println("�п�J�X���~��");
    	bookimformation[5] = book.next();
    	System.out.println("�п�J�O�_���ɮ�(�_��J0�O��J�ٮѤ��yyyy-MM-dd)");
    	bookimformation[6] = book.next();
    	System.out.println("�п�J�ƶq");
    	bookimformation[7] = book.next();
    	
    	
    	boolean booktwo = true;
    	for(;bookFile.hasNextLine();)
    	{
    		
    		bookexsist = stringSplit.st(bookFile.nextLine());
    		
    		if((bookimformation[0].equals(bookexsist[0]))&&(bookimformation[1].equals(bookexsist[1]))&&
    				(bookimformation[2].equals(bookexsist[2]))&&(bookimformation[3].equals(bookexsist[3]))&&
    				(bookimformation[4].equals(bookexsist[4]))&&(bookimformation[5].equals(bookexsist[5])))
    		{
    			System.out.println("�w�s�b�����y");
    			booktwo = false;
    		}
    		}
    		if(booktwo)
    		{
    			bookdata.println(bookimformation[0]+" "+bookimformation[1]+" "+bookimformation[2]
    					+" "+bookimformation[3]+" "+bookimformation[4]+" "+bookimformation[5]
    							+" "+bookimformation[6]+" "+bookimformation[7]);
    		}
    		}
    	else
    	{
    		System.out.print("�w�F�x�s�W��");
    	}
    	
    	bookdata.close();
    	bookFile.close();
    	
    	
    }
}
