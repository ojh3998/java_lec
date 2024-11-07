package pkg02_reference;

public class ReferenceEx {

  public static void main(String[] args) {
    
    // Reference Type (참조 타입)
    
    // String 클래스 : 주소 값(참조 값)을 저장하는 대표 참조 타입, 문자열 저장
    String s = "Hello World";  // s 에 저장 되있는 것은  "Hello World" 의 참조값,/ 문자열은 큰 따옴표
    System.out.println(s);
    System.out.println(System.identityHashCode(s)); // 메모리 주소값 ( 참조 값 )
    
    // ReferenceEx 클래스 타입 (6장에서 다룰 예정)
    ReferenceEx x = new ReferenceEx();
    System.out.println(x);
    
    // 모든 class 타입은 주소
    
    
    
    
    
    
    

  }

}
