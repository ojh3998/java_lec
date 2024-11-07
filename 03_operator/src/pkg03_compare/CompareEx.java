package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    
    
    // 비교 연산
    int a = 10;
    int b = 20;
    
    System.out.println(a > b);   // false
    System.out.println(a >= b);  // false
    System.out.println(a < b);   // true
    System.out.println(a <= b);  // true
    System.out.println(a == b);  // false
    System.out.println(a != b);  // true
    
    
    // 문자열 비교 연산 -->  따라서. == 또는 != 연산자로 문자열을 비교하면 안 된다. 문자열비교 메소드가 존재함!
    String x = "hello";
    String y = "hello";
    
    System.out.println(x == y); // true , hello 를 비교 한 것이 아닌, hello 가 저장된 참조(주소)를 비교한다.

  }

}
