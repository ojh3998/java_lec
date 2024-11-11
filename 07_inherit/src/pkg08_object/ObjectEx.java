package pkg08_object;

public class ObjectEx {

  public static void main(String[] args) {

    //object 타입의 인스턴스 car 생성
    Object car = new Car("benz", "E450");
    
    // 인스턴스 car 를 Car 타입으로 변환 (down casting)
    if(car instanceof Car) {
      System.out.println(((Car) car).getBrand());
      System.out.println(((Car) car).getModel());
    }
    
    // 인스턴스 Car 타입의 인스턴스 car2 생성
    Car car2 = new Car("bmw", "M4");
    
    // 아래 두 코드는 동일하다. toString 은 생략가능
    System.out.println(car2);
    System.out.println(car2.toString());
                                                                                                                                                                                                                                         
    /*
                   * 
     */
  }

}
                                                   