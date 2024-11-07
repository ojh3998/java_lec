package pkg08_static;

/*
 * 클래스 멤버 (라고하는것은 클래스 메소드와 클래스 필드 둘다) 
 * 1. 메모리에 클래스 영역 저장된다.
 * 2. 인스턴스의 생성이 없어도 접근 가능하다.
 * 3. 멤버 앞에 static 키워드를 추가한다.
 * 4. 클래스로 호출한다. 단 인스턴스로 호출 할 수 도 있으나, 권장하지 않는다.
 */


/*
 * 메모리 할당 순서
 * 
 *          영역 : 클래스 영역    -> 스택 영역            -> 힙 영역
 *          종류 : static            지역 변수               new 키워드로 생성하는 것(인스턴스, 배열)
 * 라이프 사이클 : 계속 유지         중괄호 벗어나면 소멸    Garbage Collector 가 소멸
 *               : item, methodB()                           item2, methodA()
 *                 (클래스 멤버)                             (인스턴스 멤버)
 */

public class Sample {
  
  static String item;
  String item2;
  
  
  public void methodA( ) { 
    System.out.println("인스턴스 메소드 methodA");
    System.out.println(item);
    System.out.println(item2);
  }

  public static void methodB( ) {
    System.out.println("클래스 메소드 methodB");
    System.out.println(item);
   // System.out.println(item2); 클래스 메소드는 인스턴스 멤버인 item2를하
  }
}