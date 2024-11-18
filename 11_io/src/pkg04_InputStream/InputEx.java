package pkg04_InputStream;

import java.awt.image.DataBufferDouble;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import pkg02_OutputStream.Car;

public class InputEx {
  
  public static void main(String[] args) {
    d();
    
  }
  
  public static void a( ) {
     
    // 1 바이트 씩 데이터 읽기
    
    // FileInputStream : 파일 정보 읽는 스트림
    // BufferedInputStream : 입력 속도 향상
    
   File file = new File("\\storage", "sample.dat");
   
   BufferedInputStream in = null;
   
   try{
     
     in = new BufferedInputStream(new FileInputStream(file));
     
     // 읽을 단위 : int 변수로 1바이트씩 읽는다.
     int c;
     
     // 읽을 데이터를 보관할 배열 : 길이를 파일의 크기와 맞춤
     byte[] b = new byte[(int) file.length()];
     int i = 0;
     
     // 파일의 종료까지 계속 읽기 : read() 메소드는 읽은 내용을 반환하거나, 파일이 종료되면 -1 값을 반환한다.
     while ( (c = in.read()) != -1 ) {
       b[i++] = (byte) c;
       
     }
     
     // 확인
     System.out.println(new String(b));
     
   } catch (IOException e) {
     e.printStackTrace();
   } finally {
     try {
       if(in != null)
         in.close();
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
   
  }
         
  public static void b( ) {
    
    // n 바이트 씩 데이터 읽기
    
    File file = new File("\\storage", "sample2.dat");
    
    BufferedInputStream in = null;
    
    try{
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      // 읽을 단위 : byte 배열로 n 바이트씩 읽는다.
      byte[] b = new byte[4];
  
      // 읽을 데이터를 보관할 배열 : 길이를 파일의 크기와 맞춤
      byte[] bytes = new byte[(int) file.length()];
      int i = 0;
      
      // 파일의 종료까지 계속 읽기 : read(byte[]) 메소드는 읽은 내용을 인자에 저장하고, 읽은 바이트 수를 반환한다. 파일이 종료되면 -1 값을 반환한다.
     
      int readbyte;
      while( (readbyte = in.read(b)) != -1 ) {
        System.arraycopy(b, 0, bytes, i, readbyte);
        i += readbyte;
      }
      
      // 확인
      System.out.println(new String(bytes));
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(in != null)
          in.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
   }
    
  public static void c() {
    
    File file = new File("\\storage", "sample4.dat");
    
    // DataInputStream 변수를 읽는 스트림
    
    DataInputStream in = null;
    
    try {
      
      in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
      
      // 파일에 저장된 순서대로 읽 어야 함.
      int age = in.readInt();
      double height = in.readDouble();
      char gender = in.readChar();
      boolean isCute = in.readBoolean();
      String name = in.readUTF();                // 거의 한글 용으로 많이 쓰임
      
      //확인
      
     long begin = System.currentTimeMillis();
     
     System.out.println(age);
     System.out.println(height);
     System.out.println(gender);
     System.out.println(isCute);
     System.out.println(name);
     long end = System.currentTimeMillis();
     
     System.out.println(end - begin);
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if( in != null)
          in.close();
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void d() {
    
    File file =  new File("\\storage", "sample5.dat");
    
    // ObjectInputStream : 객체를 읽는 스트림
    ObjectInputStream in = null;
    
    // Car 인스턴스를 저장할 List 생성
    List<Car> cars = new ArrayList<Car>();
    
    
    try {
      in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
      
      // EOFException 발생 전까지 반복하는 무한 루프
      while(true) {
        // 인스턴스 읽기 : readObject() 읽은 인스턴스를 반환하거나 파일이 끝나면 EOFException 을 발생시킨다.
        Car car = (Car) in.readObject();
        
        // 읽은 인스턴스 list 에 저장하기
        cars.add(car);
        
      }
      
      
    } catch (EOFException e) {
      
      // list 확인
      for(int i = 0, size = cars.size(); i < size; i++) {
        System.out.println(cars.get(i));
      }
      
    }
     catch (IOException | ClassNotFoundException e) {  // 예외가 부모자식 관계가 아닐 때 하나의 catch 에 적는 방법
      e.printStackTrace();
     }
    finally {
      try {
        if( in != null )
          in.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    
    
  }
 
  
  }
         
  
    



