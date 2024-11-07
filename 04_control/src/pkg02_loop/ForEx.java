package pkg02_loop;

public class ForEx {

  public static void main(String[] args) {
   
    
    // for 문   5,4,3,2,1 출력
    for(int a = 5; a >= 1; a--) {
      System.out.println(a);
    }
    
    // 1~10 사이 홀수의 평균 출력 (합계 / 개수)
    int total = 0, count = 0;
    for(int a = 1; a <= 10; a++) {
      if(a % 2 == 1) {
        total += a;
        count++;
      }
    }
    System.out.println((double)total / count);  /* 둘다 맞음 정수와 실수 와 섞이면 실수로 자동변환
                                                    둘은 같다 */
    System.out.println(total / (double)count);      
    
   // System.out.println((double)(total / count)); -- 잘못됨.(이미 나눈 다음 소숫점을 붙혀봤자 의미 없다.)
        
    
    // 3단 출력하기
    for(int a = 1; a <=9; a++) {
      System.out.println("3 x " + a + " = " + (3 * a));
    }
    
      
    
    
    
  

  }

}
