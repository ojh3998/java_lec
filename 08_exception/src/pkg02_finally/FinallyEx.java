package pkg02_finally;

public class FinallyEx {
  
  /*
   * finally 블록
   * 1. try catch 블록 마지막에 추가할 수 있는 선택 블록이다.
   * 2. 언제나 마지막에 실행되는 블록이다.
   * 3. 실행 순서
   *  1) 예외가 없는 경우 : try 블록 -> finally 블록
   *  2) 에외가 있는 경우 : try 블록 -> catch 블록 -> finally 블록
   */
  

  public static void main(String[] args) {
    
    try {
      
      int a = 100;            // 실수 double 은 예외가 발생하지 않음 
      int b = 0;
      int mod = a % b;
      
      System.out.println(a + "%" + b + "=" + mod);
      
    } catch (Exception e) {
      
      System.out.println(e.getMessage());
      System.out.println(e.getClass().getName());
      
    } finally {
      
      System.out.println("작업이 완료되었습니다.");
     
    }
      
      

  }

}
