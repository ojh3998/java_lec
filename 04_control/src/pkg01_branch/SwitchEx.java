package pkg01_branch;

public class SwitchEx {

  public static void main(String[] args) {
   
    
    // switch 문 짝수/홀수 -- 전달된 값의 case 부터 모두 실행
    int a = 6;
    switch(a % 2) {
    case 0:
      System.out.println(a + "는 짝수");
      break;
    case 1:
      System.out.println(a + "는 홀수");
      break;
    }
    
    String state = "대기";      // 대기/승인/거부
    switch(state) {
    case "대기" :
      System.out.println("대기중");
      break;
    case "승인" :
      System.out.println("승인 완료");
      break;
    case "거부" :
      System.out.println("거부 완료");
      break;
    }
    
    

  }

}
