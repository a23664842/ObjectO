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
		boolean x = true;//離開
		while(log)
		{
		
		System.out.println("登入按l註冊按s:");
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
			System.out.println("新增一筆資料按n;顯示所有資料按a;顯示某一分類的所有資料按p;\n"
					+ "搜尋某一筆資料按f;修改某一筆資料按m;刪除某一筆資料按d;\n"
					+"重整排列順序後再寫回到檔案按r;離開按e"
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
