package pkg03_return;


/*
 * 메소드 만드는 방법
 * 
 * 반환타입 메소드명(매개변수,...(전달할 값이 없으면 비움)) {
 *  본문 코드
 *  return 반환 값 ( 역시 반환 값 없으면 안적음)
 *  }
 * */

public class Sample { 
  
  /**
   * 반환이 void(반환이 없다) 인 경우에만! ->  return; 을 통해 메소드 실행을 중지. 
   * @param number 양의 정수를 전달 . 음의 정수가 전달되면 사용하지 않는다.
   * 예외 가 있을 때는 처음에 예외 를 명시해 두는게 좋은 방법.. 
   */ 
  void methodA(int number) {
    if(number < 0) {
      return;
    }
    System.out.println(number);
  }
  
  /**
   * choice 에 따라 다른 문자열을 반환하는 method 이다
   * @param choice 1,2,3, 중 정수 하나의 값
   * @return "아메리카노", 카페라떼", "카페모카" 중 하나
   */
  String methodB(int choice) { 
    String retValue = "없는 메뉴";
    switch(choice) {
    case 1:
      retValue = "아메리카노";
      break;
    case 2:
      retValue = "카페라떼";
      break;
    case 3:
      retValue = "카페모카";
      break;
    }
    return retValue;
      
  }
  
  /**
   * 
   * @return String[] 타입의 배열 반환
   */
  String[] methodC() {
    return new String[] {"머리", "가슴", "배"};
  }
  
  /**
   * 
   * @return Car 클래스의 brand 메소드가 반환하는 값을 반환
   */
   String methodD() {
   Car car = new Car();
   return car.brand();
   
  }
  
  
  
  
  
  
  
  
  

}
