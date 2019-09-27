package javaFT;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;


public class Checkpassword 
{   
	private static String ID;
	private static String Password;
	
    public static void Check() 
    {
    	Scanner FileID = new Scanner(System.in);
    	Scanner IDFile = null;
    	System.out.print("輸入帳號:");
    	ID = FileID.next();
    	System.out.print("輸入密碼:");
    	Password = FileID.next();
    	try
    	{
    		IDFile = new Scanner(new FileInputStream("password/whitelist.txt"));
    		
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not Found.");
    		System.exit(0);
    	} 
    	boolean login = false;
    	
    	for(;IDFile.hasNext();)
    	{
    		String I = IDFile.next();
        	String P = IDFile.next();
    		if((ID.equals(I))&&(Password.equals(P)))
    		{
    		    System.out.println("歡迎登入!");
    		    login = true;
    		}
    	}
    	if(!login)
    	{
    		System.out.println("登入失敗帳號或密碼錯誤");
    		Check();
    	}
    	
    	
    	IDFile.close();
    	
    	
    }
	
	public static String getID()
    	{
    		return ID;
    	}
    	
	
	
}
