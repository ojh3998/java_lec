package pkg04_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

  public static void main(String[] args) {
    
    // HashSet 인스턴스 선언 (Set 인터페이스 타입 사용)
    Set<String> set;  
    
    // HashSet 인스턴스 생성
    set = new HashSet<String>();
    
    // 1. 인덱스가 없다.
    // 2. 중복 저장이 불가능.
    
    // 요소 추가 (중복 저장이 되는지 확인)
    set.add("봄");
    set.add("봄");
    set.add("봄");
    set.add("여름");
    set.add("가을");
    set.add("겨울");
    
    // 요소 출력하기 전체 요소(저장 순서가 유지되는지 확인)
    System.out.println(set);
    
    // for 문 (Advanced for 문 가능)  // 인덱스 가 없을 때 사용하기 좋은 for 문 
    for(String item : set) {
      System.out.println(item);
    }
    
    
   // 요소 개수 
   System.out.println(set.size());
    
    
    
    
    
    
    
    
    
    
  }
  
  
  

}
