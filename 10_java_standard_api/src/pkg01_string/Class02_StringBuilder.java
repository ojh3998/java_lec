package pkg01_string;

public class Class02_StringBuilder {

  /*
   *         | StringBuffer    | StringBuilder
   * --------|-----------------|--------------
   *  since  | JDK 1.0         | JDK 1.5
   *  thread | multiple thread | single thread
   *  speed  | slow            | fast
   */
  
  public static void main(String[] args) {                // StringBuilder 는 일반 String 클래스와는 다르게 문자열을 저장할 때
                                                          // builder.append 로 이어붙이고, 이어붙이면 참조에 저장되는 값이
    // StringBuilder 객체 생성                            // "바나나" 하나의참조에 저장되서 성능이 String 클래스보다 좋음.
    StringBuilder builder = new StringBuilder();            
    
    // 문자열 추가하기 
  //  builder.append("바");      
  //  builder.append("나");
  //  builder.append("나");
    
    
    builder.append("바나나는 맛있어");      
    builder.append("\n맛있으면 바나나");
    builder.append("\n바나나는 길어");
    
    // String 객체로 바꾸기 둘중 하나
    // 1. new String(builder)
    // 2. builder.toString()
    
    
    // 최종 결과는 String으로 바꿔줘야함.
    //String result = builder.toString();
    // System.out.println(result);
    
    String result = builder.toString();
    System.out.println(result);
    
  }
  
}
    
    
