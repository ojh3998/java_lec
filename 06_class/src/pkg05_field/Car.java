package pkg05_field;

/*
 * 필드
 * 1. 클래스에서 선언 한 변수
 * 2. 일반 변수와 달리 자동 초기화가 진행 된다. (null, 0, false) 
 */

public class Car {
  
  // 필드를 선언할 때 초반에 두는게 암묵적 약속
  int speed; // int speed = 0; -- 자동 초기화 된 상태임
  int fuel;  // int fuel = 0;
  final int LIMIT = 100;   // final 상수
  
  void accel() {
    if(fuel == 0)
      return;
    fuel--;
    if(speed == LIMIT)
      return;
    speed++;
  }
  
  void brake() {
    if(speed == 0)
      return;
    speed--;
  }
  
  void gasStation(int fuel) { // this 를 쓰는 가장 흔한 상황 -- 매개변수 이름과 필드 이름 이 같다.(써야 구분이 될 때)  
    this.fuel += fuel;       // this 는  gasStation 을 호출한 인스턴스. this 를 붙이면 현재 클래스 안에 있는 멤버를 호출
  
  }
  
  void panel() {
    System.out.println("SPEED : " + speed + "  "+ "FUEL : " +  fuel);
  }
  
  
  
  
  
  
  
  
}
