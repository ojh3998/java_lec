package pkg04_logical;

public class LogicalEx {

  public static void main(String[] args) {
    
    
    // 논리 연산
    // 1. 논리 and : &&
    // 1. 논리 or  : ||
    // 1. 논리 not : !
    int a = 10;
    int b = 10;
    System.out.println(a > 0 && b > 0);
    System.out.println(a > 0 || b > 0);
    System.out.println(!(a > 0));
    
    // 숏 서킷 
    int x = 10;
    System.out.println(x < 0 && ++x == 0);  // && 는 false 가 나오면 더이상 연산 진행 x 
    System.out.println(x > 0 || ++x == 1);  // || 은 true 가 나오면 더이상 연산 진행 x
    System.out.println(x);
    
  }

}
