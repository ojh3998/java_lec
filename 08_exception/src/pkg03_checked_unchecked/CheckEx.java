package pkg03_checked_unchecked;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckEx {
  
  // 예외 핸들링(예외 처리 or 예외 회피) 이 없어도 실행 가능한 예외 -- 예외 자체를 그냥 실행해서 확인
  // : unchecked Exception (RuntimeException 클래스와 그 하위 클래스)
  public static void a() {
    
    // NumberFormatException 발생
    Integer.parseInt("");
    
    // ArithmeticException 발생
    int mod = 10 / 0;
    System.out.println(mod);
  }
  
  // 예외 핸들링이 없으면 실행 불가능한 예외
  // : checked Exception (RuntimeException 클래스를 제외한 모든 예외클래스0
  public static void b() {
    
    try {
      new URL("https://www.google.com/");
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }

  
  public static void main(String[] args) {
   a();

  }

}
