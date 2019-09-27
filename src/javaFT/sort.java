package javaFT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class sort { 
	public static String sortData(String name)
{
	Scanner scan =new Scanner(System.in);
	String[] ss = new String[8];
	String[] sortbookdata = new String[9];
    String[] bookdata = new String[stringSplit.Linecount(name)];
    int sort;
    System.out.println("輸入要以什麼做排序(0書名;1作者;2出版社;3編號;4分類;5出版年份;6還書日期;7數量)");
   sort = scan.nextInt();
   BufferedReader br = null;  
   String line;
   int a=0;
   StringBuffer buf = new StringBuffer();
   try {  
       br = new BufferedReader(new FileReader("book/"+name+"book.txt"));  
       while ((line = br.readLine()) != null) {
       ss=stringSplit.st(line);
       
       bookdata[a]=ss[sort]+" "+line;
       a++;
       }
       Comparator comparator = Collator.getInstance(Locale.ENGLISH);
       Arrays.sort(bookdata, comparator);
       for(int i=0;i<bookdata.length;i++)
       {   
    	   sortbookdata=stringSplit.st(bookdata[i]);
    	   buf.append(sortbookdata[1]+" "+sortbookdata[2]+" "+sortbookdata[3]+" "
    			   +sortbookdata[4]+" "+sortbookdata[5]+" "+sortbookdata[6]+" "
    			   +sortbookdata[7]+" "+sortbookdata[8]);
    	   buf.append(System.getProperty("line.separator")); 
       }
   } catch (Exception e) {  
       e.printStackTrace();  
   } finally {  
       
       if (br != null) {  
           try {  
               br.close();  
           } catch (IOException e) {  
               br = null;  
           }  
       }  
   }  
     
   return buf.toString();  
    
    
   
    
}
   

    public static void write(String name, String content) {  
        BufferedWriter bw = null;  
          
        try {  
            
            bw = new BufferedWriter(new FileWriter("book/"+name+"book.txt"));  
            
            bw.write(content);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            
            if (bw != null) {  
                try {  
                    bw.close();  
                } catch (IOException e) {  
                    bw = null;  
                }  
            }  
        }  
    }  
}



