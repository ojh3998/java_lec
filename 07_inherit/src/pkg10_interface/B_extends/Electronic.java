package pkg10_interface.B_extends;

/**
 * 인터페이스 상속
 * 1. 인터페이스 간 상속 관계를 가질 수 있다.
 * 2. 자식 인터페이스는 부모 인터페이스의 메소드를 자신의 것 처럼 가진다.
 */

public interface Electronic { 
  
  // 상수
 /* public final static */  int VOLT = 220;

 //추상 메소드
 /* public abstract */ void powrOn();
 /* public abstract */ void powrOff();
   
 
}
