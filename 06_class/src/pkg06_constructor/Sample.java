package pkg06_constructor;

/*
 * 생성자 (constructor)
 * 1. 인스턴스를 생성할 때 호출하는 특별한 메소드.
 * 2. new 키워드와 함께 사용됨.
 * 3. 특징
 *  1) 이름이 클래스와 같아야함.
 *  2) 반환타입이 존재하지 않는다. -- void 도 아니고 아예 없는 것!
 *  3) 매개변수는 일반 메소드처럼 존재한다. -- 생성자에 오버로딩이 가능하다!
 */

public class Sample {
  
  int number;
  
  // 디폴트 형식의 생성자 -- 안만들면 자바 내부적으로 알아서 만들어줌 
  Sample() { 
    
    
  }
  
  // 매개변수가 있는 생성자 
  Sample(int number) {
    this.number = number;
  }
  
  
  
  // 매개변수가 있는 생성자2
  Sample(String number) {
   // this.number = Integer.parseInt(number);
    
   // this() : 생성자를 호출한다.
    this(Integer.parseInt(number)); // this 가 다른 생성자를 호출한다.
  }
  
  // 매개변수가 있는 생성자3  double 을 int 로 보낼수 없기 때문에 casting 해야함
  Sample(double number) {
    // this.number = (int)number; -- casting
    
    this((int)number);
  }
  
  
  
  

  
}
