package pkg02_has_a;

/*
┌--------------┐
│      Pen     │ 슈퍼 클래스
│--------------│
│   drawing()  │
└--------------┘
        ▲
        │
┌--------------┐
│    Person    │ 서브 클래스
│--------------│
│     eat()    │
│    sleep()   │
└--------------┘
*/

public class Person extends Pen {
  
  public void eat() {
    System.out.println("eat");
  }  
    
  public void sleep() {  
    System.out.println("sleep");
  }
  
  

}
 