package javaFT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class deleteData{
	public static String read(String name) {  
        BufferedReader br = null;  
        String line; 
        int x = 0;
        int x2 = 0;
        StringBuffer buf = new StringBuffer();  
        Scanner scan = new Scanner(System.in);
        System.out.println("輸入欲刪除第幾項資料:");
        x=scan.nextInt();
        
        try {  
            br = new BufferedReader(new FileReader("book/"+name+"book.txt"));  
              
           
            while ((line = br.readLine()) != null) {
            	x2++;
            		if(x!=x2)
            		{
            			buf.append(line);  
                        buf.append(System.getProperty("line.separator")); 
            		}
                     
            	
               
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
