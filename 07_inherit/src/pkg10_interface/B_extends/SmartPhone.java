package pkg10_interface.B_extends;

/**
 * 다중 인터페이스 구현
 * 1. 여러 인터페이스를 구현할 수 있다.
 * 2. 다중 상속의 효과를 낼 수 있다.
 * 3. 모든 인터페이스의 모든 추상 메소드를 구현해야 한다. -> @Override 해야한다.
 */
public class SmartPhone implements Computer, Phone {
  
  
  @Override
  public void powrOn() {
    System.out.println("전원 on");
    
  }
  
  @Override
  public void powrOff() {
    System.out.println("전원 off");
    
  }
  
  @Override
  public void game() {
    System.out.println("게임");
    
  }
  
  @Override
  public void call() {
    System.out.println("전화");
    
  }
  
  @Override
  public void sms() {
    System.out.println("문자");    
  }
 
}
