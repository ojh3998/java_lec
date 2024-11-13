package pkg04_throws;

public class ThrowsEx {

  public static void main(String[] args) {
    // 예외 처리된 Calculator 클래스
    Calculator calc = new Calculator();
    String a = "10";
    String b = "4";
    System.out.println(calc.add(a,b));
    System.out.println(calc.subtract(a,b));
    System.out.println(calc.multiply(a,b));
    System.out.println(calc.quotient(a,b));
    System.out.println(calc.modular(a,b));
    
    // 예외 회피 된 Computer 클래스
    
    try {
      Computer com = new Computer();
      System.out.println(com.add(a, b));
      System.out.println(com.subtract(a, b));
      System.out.println(com.multiply(a, b));
      System.out.println(com.quotient(a, b));
      System.out.println(com.modular(a, b));
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  

}
