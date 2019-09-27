package javaFT;
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException; 
import java.util.Scanner;
public class modifyData  {
    public static String read(String name) {  
        BufferedReader br = null;  
        String line;
        int num = 0;
        int a = 0;
        String x = null;
        String x2 = null;
        StringBuffer buf = new StringBuffer();  
        Scanner scan = new Scanner(System.in);
        System.out.println("輸入要修改第幾項資料:");
        num=scan.nextInt();
        System.out.println("輸入欲修改資料:");
        x=scan.next();
        System.out.println("輸入修改資料:");
        x2=scan.next();
        try {  
            br = new BufferedReader(new FileReader("book/"+name+"book.txt"));  
              
           
            while ((line = br.readLine()) != null) {
            	a++;
            	if(a==num) {
            		line=line.replaceAll(x, x2);   
                    buf.append(line);  
            	}
            	else
            	{
            		buf.append(line);
            	}
             
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
