package pkg01_primitive;

public class PrimitiveEx {

  public static void main(String[] args) {
    
    // Primitive Type (기본 타입)
    
    // 1. byte : 1바이트 정수 
       byte a;  // 변수 a 에는 쓰레기(Garbage)가 저장되어 있음
       a = 127; // -128 ~ 127 까지 가능
       System.out.println(a);
       
    // 2. short : 2바이트 정수 --> 사용안함.
       short b = 32767; 
       System.out.println(b);
       
    // 3. int (integer) : 4바이트 정수 -> 기본 정수 타입
       int c = 2147483647;  // 약 21억
       System.out.println(c);
       
    // 4. long : 8바이트 정수 -> int 로 커버 불가능한 값에서 사용 
       long d = 2147483648L; // long 타입의 값은 마지막에 L(l)을 추가 (int 범위를 벗어난 값은 필수, 아니면 생략가능)
       System.out.println(d);
    
    // 5. float (floating point) : 4바이트 실수 --> 사용안함..   
       float e = 0.217217217217217F; // float 타입의 값은 마지막에 F(f)를 추가
       System.out.println(e);
       
    // 6. double : 8바이트 실수 -> 기본 실수 타입
       double f =  0.217217217217217;
       System.out.println(f);
       
    // 7. char (character) : 2바이트 단일문자 -> ASCII 코드(영문)(1바이트), 유니코드(2바이트)
       char g = '율'; // 작은 따옴표, 영문/한글 모두가능
       System.out.println(g);
       
    // 8. boolean : 이론상 1비트(실제는 JVM이 담당), ture 또는 false 저장
       boolean h = false;
       System.out.println(h);
       
       
       // 변수의 스코프(scope)
       // 변수가 선언된 중괄호 {} 내부에서만 접근이 가능 함 -> 지역 변수 (local variable)
       {
         int x = 10;
         System.out.println(x);
       }
       // x = 20; 밖에서는 안댐
       
       
       
       // 상수 (constant variable)
       // 할당된 값을 바꿀 수 없다. 반드시 초기 할당이 필요하다!
       // final 키워드를 변수 선언 시 추가한다. 관례상 변수 명은 대문자로 작성한다.
       final double PI = 3.14; 
       // PI = 31.4; -> 못바꿈
       System.out.println(PI);
       
       
       
       
       
       
       
       
  }

}
