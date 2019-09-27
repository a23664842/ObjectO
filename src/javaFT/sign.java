package javaFT;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class sign {
	private static String ID;
	private static String Password;
	private static Scanner fileID;
	public static boolean NUser()
    {
    	fileID = new Scanner(System.in);
    	PrintWriter User = null;
    	Scanner IDFile = null;
    	File f =new File("password/whitelist.txt");
    	
    	try
    	{
    		IDFile = new Scanner(new FileInputStream(f));
    		User = new PrintWriter(new FileWriter(f,true));
    		
    	}
    	catch(FileNotFoundException e)
    	{
    		System.out.println("File not Found.");
    		System.exit(0);
    	} 
    	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.print("輸入帳號:");
    	ID = fileID.next();
    	System.out.print("輸入密碼:");
    	Password = fileID.next();
    	
    	boolean login = true;
    	
    	
    	for(;IDFile.hasNext();)
    	{
    		String I = IDFile.next();
        	String P = IDFile.next();
    		if(ID.equals(I))
    		{
    		    System.out.println("帳號已有人使用!");
    		    login = false;
    		    return true;
    		}
    	}
    	
    	if(login)
    	{
    		User.println(ID+" "+Password);
    		System.out.println("註冊成功");
    		System.out.println("歡迎登入!");
    		User.close();
    		return false;
    	}
    	
    	User.close();
    	IDFile.close();
    	
    	return true;
    }
	
	public static String getID()
    	{
    		return ID;
    	}
    	
	

}
