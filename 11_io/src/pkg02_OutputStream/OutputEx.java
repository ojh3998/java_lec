package pkg02_OutputStream;

/*
 * byte 기반의 출력
 * 데이터 보낼 때 output 
 * 
 *        받을 때 input
 */

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class OutputEx {

  public static void k() {
    File direct = new File("\\storage");
    if(!direct.exists()) {
      direct.mkdirs();
    }
    File file = new File(direct, "k.txt");
    
  
    
    try (BufferedOutputStream a = new BufferedOutputStream(new FileOutputStream(file));) {
    
      
      byte[] c = "hello, my name is kim".getBytes();
      a.write(c);
      
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
      
    
    
    
     
    
  
  
  public static void a() {
    
    // 생성 모드 : 항상 새로 만드는 모드

    // 디렉터리
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs(); // makedirectory( 디렉토리 만들기)
    
    // 파일
    File file = new File(dir, "sample.dat");   // 위치정보만 넘겨주는 것 생성은 파일 출력 스트림에서 함.
    
    // FileOutputStream (파일 출력 스트림) 인스턴스 선언
    FileOutputStream out =  null;
    
    
    try {
      
      // FileOutputStream (파일 출력 스트림) 인스턴스 생성 : 파일 생성 시점
      out = new FileOutputStream(file);
      
      // 출력 : 하나의  데이터 내보내기 (단위 : int)
      int c = 'A'; // (아스키 코드 65) 
      out.write(c);
      
     // 출력 : 여려개의 데이터 내보내기 (단위 : byte[])
  // byte[] b = new byte[] {'p', 'p', 'l', 'e'};
     byte[] b = "pple".getBytes();     // 알아서 바이트 배열로 바꿔준다. 위 코드와 같은 작업 
      out.write(b);
      
    } catch (FileNotFoundException e) {   // catch 에서 exception 순서는 자식부터 해야함.
      e.printStackTrace();
    } 
     catch (IOException e) {
      e.printStackTrace();
    } finally {                             // finally 블록에서 exception 이생기면 catch 블록 안이 아니기 때문에 try,catch 를 새로만들어야함.
  
      // 파일 출력 스트림의 종료
      try {
        if(out != null)
          out.close();                     // colse 를 finally에 넣어야 try 블록에서 다마치고 끝냄
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
    
  
      
    
    
    
    
    
  }

  
  public static void b() {
    
    // 추가 모드 : 없으면 만들고, 있으면 추가
    
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs();
    
    File file = new File(dir, "sample2.dat");
    
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream(file, true);    // 추가모드이냐 ? true : false 
      int c = '안';
      out.write(c);
      byte[] b = "녕하세요".getBytes();
      out.write(b);
    } catch (IOException e) {      // FileNotFoundException 의 부모 클래스
       e.printStackTrace();
      }
    finally {
      try {
        if( out != null )
          out.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
  // 따라서 FileOutputStream 은 텍스트를 출력하기에는 부적절하다.
  
  public static void c() {
    
    // 입출력 성능 향상을 위해 함께 사용하는 보조 스트림 : BufferedOutputStream
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs();
    
    File file = new File(dir, "sample3.dat");
    
    BufferedOutputStream out = null;
    
    try {
      
      // BufferedOutputStream 를 이용해 출력 데이터를 한번에 모아서 처리하므로 출력 속도가 향상된다. -- 거의 무조건 씀 
      out = new BufferedOutputStream(new FileOutputStream(file));
      
     int c = '안';
     out.write(c);
     
     //  byte[] b = new byte [] {'h', '하', '세', '요'};  // 한글은 바이트에 저장 할 수 없음 
     byte [] b = "녕하세요".getBytes();
     out.write(b);
      
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if( out != null)
        out.close();
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    
    }
    
    
    
    
    
    
    
    
  }

  public static void d() {
  
    
    // 변수 그대로 출력하는 스트림 : DataOutputStream
    
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs();
    
    File file = new File(dir, "sample4.dat");
    
    DataOutputStream out = null;
    
    try {
      
      out = new DataOutputStream(new FileOutputStream(file));
      
      int ag = 10;
      out.writeInt(ag);
      
      double height = 150.0;
      out.writeDouble(height);
      
      char gender = '남';
      out.writeChar(gender);
      
      boolean isCute = true;
      out.writeBoolean(isCute);
      
      String name = "페페";           // 한글을 보내도 문제가 안생김. 
      out.writeUTF(name);
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if( out != null)
          out.close();
        
      } catch (Exception e) {
        e.printStackTrace();
      }
        
    }
  }
  
  public static void e() {
    
    // 인스턴스를 출력할 수 있는 스트림 : ObjectOutputStream
    
    File dir = new File("\\storage");
    if( !dir.exists() )
      dir.mkdirs();
    
    File file = new File(dir, "sample5.dat");
    
    ObjectOutputStream out = null;
    
    try {
      out = new ObjectOutputStream(new FileOutputStream(file));
      
      out.writeObject(new Car("Phorse", "911"));     // 직렬화가 가능한 인스턴스를 출력할 수 있다. 이 상태에서는 직렬화 불가능 -> car 클래스에서 해결해야함
      
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if( out != null )
          out.close();
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
  }
    
    
  public static void main(String[] args) {
    k();
    
  }
  
}
    
    
    
    
    
    
    
    
    
    
    
    
    

