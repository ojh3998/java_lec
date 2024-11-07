package pkg03_return;

import java.util.Arrays;

public class ReturnEx {

  public static void main(String[] args) {
    
    // sample 타입의 인스턴스 s 생성
    Sample s = new Sample();
    
    // methodA 호출
    s.methodA(10); //
    s.methodA(-10);
    
    // methodB 호출 ( 1 전달 : 아메리카노 반환, 2 전달 : 카페라떼, 3전달 : 카페모카, 나머지 경우 : 없는 메뉴
    
    System.out.println(s.methodB(0)); // 반환 값은 언제나 호출한 곳으로 전달
    System.out.println(s.methodB(1)); // 반환 값은 언제나 호출한 곳으로 전달
    System.out.println(s.methodB(2)); // 반환 값은 언제나 호출한 곳으로 전달
    System.out.println(s.methodB(3)); // 반환 값은 언제나 호출한 곳으로 전달
   
    
    // methodC 호출 (배열을 받아서 처리)
    String[] parts = s.methodC();
    System.out.println(Arrays.toString(parts));
    
    //methodD 호출 (문자열을 반환)
    String brand = s.methodD();
    System.out.println(brand);
    
  
  
  
  
  }
  
    

}
