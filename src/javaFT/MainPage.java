package javaFT;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Date;
public class MainPage 
{
	private static String IDname;
	
	
	public static void main(String[] args)
	{
		Date date = new Date();
	    System.out.println(date.toString());
		Scanner scan = new Scanner(System.in);
		String code = ""; 
		boolean log = true;
		boolean x = true;//���}
		while(log)
		{
		
		System.out.println("�n�J��l���U��s:");
		code = scan.next();
		if(code.equalsIgnoreCase("l"))
		{
		Checkpassword.Check();
		IDname=Checkpassword.getID();
		log = false;
		}
	else if(code.equalsIgnoreCase("s"))
	{
		boolean signornot = true;
		while(signornot)
		{
		signornot = sign.NUser();
		}
		IDname=sign.getID();
		log = false;
	}
		}
		while(x)
		{
			remind.rebook(IDname);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("�s�W�@����ƫ�n;��ܩҦ���ƫ�a;��ܬY�@�������Ҧ���ƫ�p;\n"
					+ "�j�M�Y�@����ƫ�f;�ק�Y�@����ƫ�m;�R���Y�@����ƫ�d;\n"
					+"����ƦC���ǫ�A�g�^���ɮ׫�r;���}��e"
					);
			code = scan2.next();
			switch(code)
			{
			case("n"):
			newData.nData(IDname);break;
			case("a"):
		    showData.sData(IDname);break;
			case("p"):
			showSomedata.ssData(IDname);break;
			case("f"):
			searchData.fData(IDname);break;
			case("m"):
		    modifyData.write(IDname,modifyData.read(IDname));break;
			case("d"):
			deleteData.write(IDname,deleteData.read(IDname));break;
			case("r"):
			sort.write(IDname,sort.sortData(IDname));break;
			case("e"):
			x=false;break;
				
			
			}
		}
		
		
		
	}
	

}
