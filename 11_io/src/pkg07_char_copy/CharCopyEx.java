package pkg07_char_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharCopyEx {

  public static void a() {
    File readfile = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    File writefile = new File("\\storage", readfile.getName());
    
    
  
    try (BufferedReader in = new BufferedReader(new FileReader(readfile));
         BufferedWriter out = new BufferedWriter(new FileWriter(writefile))) {
      
    
      String line = null;
      
      while( (line = in.readLine() ) != null) {
        out.write(line + "/n");
      }
      
      System.out.println(writefile.getPath() + " 파일 복사 완료");     
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  
  
  
  public static void main(String[] args) {
    a();
  }

}
