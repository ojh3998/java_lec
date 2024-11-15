package pkg01_File;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

/*
  * java.io.File 클래스
  * 1. 디렉터리/파일의 정보 (이름, 경로 , 크기, 최종수정일 등 )를 확인할 수 있다.
  * 2. 디렉터리/파일을 만들거나 삭제할 수 있다. 
  */
  
  /*
   * 디렉터리/파일 경로 작성
   * 1. 경로 구분자 (separator)
   *  1) windows : \\
   *  2) linux   : /
   *  3) mac     : /
   *  4) File.separator 필드를 사용하면 플랫폼에 따라서 자동으로 경로 구분자를 넣어준다.
   * 2. 디렉터리
   *  1) 현재 디렉터리 : .
   *  2) 상위 디렉터리 : ..
   *  3)   홈 디렉터리 : ~   - linux
   *  4) 루트 디렉터리 : /   - linux 
   *   
   */
public class FileEx {
  
  public static void a( ) {
    
    // 디렉터리 만들기
    
    
    // File 인스턴스 생성 (디렉터리 경로와 이름을 작성해야 함)
    File dir = new File("D:\\storage");
    
    // 디렉터리가 없으면 만들기
    if( !dir.exists() ) {
      dir.mkdirs();
    
      // 확인
      System.out.println(dir.getName() + " 디렉터리가 생성 되었습니다.");
      
    }
    
    
    
    
    
    
    
  }

  public static void b( ) {
    
    // 디렉터리 삭제하기
    
    // File 인스턴스 생성
    File dir = new File("D:\\storage");
    
    // 디렉터리가 있으며 삭제하기 -- 삭제하려면 폴더 안에 아무 것도 없어야함,  비어있는 디렉터리만 삭제 가능 
    if( dir.exists() ) {
      dir.delete();            // jvm이 샐행 중이어도 삭제한다.
   //   dir.deleteOnExit();      // jvm이 종료 되면 삭제한다.
    }
    
   // 확인
   System.out.println(dir.exists() ? "삭제 실패" : "삭제 성공");
   
  }

  public static void c() {
  // 디렉터리/파일 정보 확인
  
  // File 인스턴스 생성
  File javaHome = new File("C:\\Program Files\\Java\\jdk-17");
  
  // 하위 디렉터리/ 파일을 모두 File 인스턴스로 가져오기
  File[] files = javaHome.listFiles();
  
  // for 문
  for(File file : files) {
    
  StringBuilder builder = new StringBuilder();
    
  // 이름
   builder.append(String.format("%-20s", file.getName().substring(0, Math.min(file.getName().length(), 20))));
   
  // 수정한 날짜
  long lastModified = file.lastModified();
  builder.append(String.format("%-30s", new SimpleDateFormat("yyyy-MM-dd a h:mm").format(lastModified)));
  
  // 유형
  builder.append(String.format("%-10s", file.isFile() ? "파일" : "파일 폴더"));
    
  // 크기
  long size = file.isDirectory() ? 0 : file.length();
  if(size != 0) {
    long kbSize = (long) Math.ceil(size / 1024.0);
    builder.append(String.format("%10s", new DecimalFormat("#,##0").format(kbSize)) + "KB");
  }
  
  // 출력
  System.out.println(builder.toString());
  
    }
  
  }
  
  public static void d( ) {
    
    /* D:\\2024\\11\\15 디렉터리 만들기 실습 */
    
    String pathname = "D:\\" + DateTimeFormatter.ofPattern("yyyy\\MM\\dd").format(LocalDate.now());  // LocalDate.now() -- 오늘 날짜        
    File dir = new File(pathname);
    
    if( !dir.exists() ) {
      dir.mkdirs();
      System.out.println(dir.getPath() + " 디렉터리가 생성되었습니다.");
    }
  }
    
  
  
  public static void e(String pathname) {
    
    /* D:\\2024\\11\\15 디렉터리 삭제 실습       // 파일 안에 뭐가 들어있으면 지울수가 없기 때문에 차례로 지워야 함.
     * 
     * D:\\2024\\11\\15 삭제  ->  e("D:\\2024\\11\\15")
     * D:\\2024\\11     삭제  ->  e("D:\\2024\\11")
     * D:\\2024         삭제  ->  e("D:\\2024")
     *                        ->  e("D:")  종료 시점(상위 디렉터리가 없으면 종료) 
     */
      
     // 종료 시점
     File dir = new File(pathname);
     File parent = dir.getParentFile();
     if(parent == null)
       return;
     
     // dir 의 삭제 진행
     System.out.println(dir.getPath() + " 디렉터리를 삭제합니다.");
     dir.delete();
     
     // 호출하는 메소드가 자기자신 (재귀 호출)
     e(dir.getParent());   //상위 디렉터리 전달 e("D:\\2024\\11")
     
     
     // new File(pathname).delete();     // 이렇게 하면 \\15만 삭제됨
    
     
     
  }
  
  public static void main(String[] args) {
    
    e("D:\\2024\\11\\15");
    
  }
}
  
     
     
     
     
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
  
  
  
  
    
    
    
    
    
    
    
    
    
