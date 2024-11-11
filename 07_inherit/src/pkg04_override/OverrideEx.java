package pkg04_override;
/*
 * 오버라이드
 * 1. 부모 클래스의 메소드를 자식 클래스가 다시 만드는 것을 의미.
 * 2. 동일한 메소드(반환타입, 메소드명, 매개변수 ) 로 만들어야 함.
 * 3. 오버라이드 할 때 @Override Annotation 을 추가
 *  1) 문법 검사를 수행한다.
 *  2) 오바라이드 한 메소드임을 알린다.
 */ 

public class OverrideEx {

  public static void main(String[] args) {
    
    BlackCoffee Black = new BlackCoffee();
    Black.taste(); // BlackCoffee 의 taste 가 호출.
    
    MixCoffee mix = new MixCoffee();
    mix.taste(); // 오버라이드한 메소드가 출력

  }

}
 