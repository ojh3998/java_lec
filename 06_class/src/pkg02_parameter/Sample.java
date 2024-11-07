package pkg02_parameter;

import java.util.Arrays;

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
   * @param 없음
   */
  void methodA () {
    System.out.println("methodA");
    
  }
  
   /**
   * @param word 문자열을 전달 받는다.
   */
  void methodB(String word) {
    System.out.println(word);
    }
  
  /**
   * 
   * @param word 문자열을 전달 받는다.
   * @param number  정수 값을 전달 받는다.
   */
   void methodC(String word, int number) {
    System.out.println(word);
    System.out.println(number);
   }
  
  /**
   * @param car Car 클래스 타입의 인스턴스를 전달 받는다.
   * @param city String 타입의 도시 이름을 전달 받는다.
   */
  void methodD(Car car, String city) { 
   // 1번 방법 : System.out.print(city + "으로 "); car.drive();
    
    car.drive(city); // 2번 방법 :  city 를 drive 메소드에 인자로 사용
   }
  
  /**
   * 
   * @param items String[] 타입의 배열을 전달 받는다.
   */
  void methodE(String[] items) {
   System.out.println(Arrays.toString(items));
   }
 
 /**
  * @param args String 타입의 인자를 0개 이상 전달 받는다. (args 는 배열이다!)
  */
  void methodF(String... args) {
   System.out.println(Arrays.toString(args));
   
  }
  
 
 

 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}