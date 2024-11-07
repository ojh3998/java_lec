package pkg01_instance;

public class InstanceEx {

  public static void main(String[] args) {
   
    
    // 클래서 Car 타입의 객체(인스턴스) 사용하기

    
    // 클래스 Car 타입의 객체 선언 -- 클래스가 곧 타입이다. (참조 타입)
    Car myCar; // -- myCar 객체를 쓸꺼야
    
    
    // 객체 생성 -- 생성된 객체를 인스턴스 라고 부름.
    myCar = new Car(); 
    
    // 인스턴스가 가지고 있는 멤버 사용하기 -- 인스턴스.멤버
    myCar.speed = 50;
    myCar.drive();
    
    // 하나의 클래스로 여러개의 인스턴스를 생성할 수 있다.
    Car momCar = new Car(); // 선언과 생성 한번에
    momCar.drive();  // 자 동 초기화 -- int 값이기 때문에  정수 0 
    
    
  }

}
