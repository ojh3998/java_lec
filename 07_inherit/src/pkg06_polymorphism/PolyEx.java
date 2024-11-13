package pkg06_polymorphism;

public class PolyEx {

  public static void main(String[] args) {


    Computer com = new Tablet();
    
    com.internet();
    com.screenTouch(); // 코드 작성 시 Computer 의 screenTouch() 호출 (정적 바인딩 : static binding)
                       // 실행 시 에는 Tablet 의 screenTouch() 를 호출 함. (동적 바인딩 : dynamic binding)
    
    
  
    // 다형성 : 하나의 코드로 여려 개의 실행을 수행할 수 있다.
    Computer [] computers = new Computer[3];
        computers[0] = new Tablet();
        computers[1] = new Computer();
        computers[2] = new Tablet();
    for(Computer computer : computers) {
      computer.screenTouch();
      
    }

  }

}