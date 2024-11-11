package pkg05_upcasting;

import java.util.Arrays;

public class UpcastingEx {

  public static void main(String[] args) {


    Tablet tab = new Tablet();
    tab.internet();
    tab.screenTouch();
    
    Computer computer = tab; // upcasting
    computer.internet();     // upcasting 된 인스턴스는 부모 타입의 멤버만 호출할 수 있다.
    // computer.sceenTouch(); // 호출 불가
    
    // upcasting 된 타입으로 배열 관리하기
    //  서로 다른 인스턴스를 하나의 타입의로 관리하기.
    Computer[] ary  = new Computer[5];
    ary[0] = new Computer();
    ary[1] = new Tablet();
    ary[2] = new Computer();
    ary[3] = new Tablet();
    ary[4] = new Computer();
    
    for(Computer com : ary) {
      com.internet();
    }

    
    

  }

}
