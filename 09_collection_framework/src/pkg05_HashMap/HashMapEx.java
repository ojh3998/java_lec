package pkg05_HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map 인터페이스 
 * 1. 하나의 데이터가 쌍(key, value) 으로 구성되어 있다.
 * 2. 인스턴스를 대체 할 수 있다.
 * 3. 구성요소
 *  1) key : 데이터 식별자 (인덱스처럼 꼭 숫자로 되어있지는 않음),
 *           Set 구조를 가지고 있다. (저장되는 순서 유지 x , 중복된 key 가 없다.)
 *  2) value : 데이터 중복 저장 가능하다.
 *  3) Entry : key 와 value 를 합친 하나의 유닛이다.   
 */

public class HashMapEx {
  
  /**
   * Mutable 객체
   * 
   */
  
  public static void a() {
    
    // HashMap  인스턴스 선언  (Map 인터페이스 타입 사용)
    Map<String, Object> map;
    
    // HashMap 인스턴스 생성
    map = new HashMap<String, Object>();
    
    // Entry 추가 (key 와 value 의 추가)
    map.put("title", "해리포터");
    map.put("author", "제이케이롤링");
    map.put("price", 10000);
    map.put("isBestSeller", true);
    
    
    // key 의 중복 체크
    map.put("price", 20000); // price 를 20000으로 수정한다. (덮어쓰기)
    
   // 전체 Entry 확인
    System.out.println(map);
    
    // 개별 Entry 확인 ( key 를 전달하면 해당 value 를 확인할 수 있다.
    System.out.println(map.get("title"));
    System.out.println(map.get("author"));
    System.out.println(map.get("price"));
    System.out.println(map.get("isBestSeller"));
    
    // value 의 타입은 object 이다.  (형 변환이 필요 할 수 있다.)
    if((boolean)map.get("isBestSeller")) {
      System.out.println("베스트셀러");
      
    }else {
      System.out.println("일반서적");
    }

    // Entry 갯수
    System.out.println(map.size());
    
    // Entry 삭제
    map.remove("author");
    System.out.println(map);
    
  }
  
  /**
   * Immutable 객체
   */
  
  public static void b() {
    Map<String, Object> map = Map.of("brand", "genesis", "moedel", "gv80");
    
    // Entry 추가 (Immutable 하기 때문에 불가능)
    //  map.put("price", 100000000);
    
    // Entry 삭제 (Immutable 하기 때문에 불가능)
    // map.remove("brand");
    
    // Entry 수정 (Immutable 하기 때문에 불가능)
    // map.put("brand", "Porsche");
    // map.put("model", "911");
    
    System.out.println(map);
    
  }
  
  public static void c() {
     
    // Map 인스턴스 생성
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("title", "파묘");
    map.put("actor", Arrays.asList("최민식", "김고은", "유해진", "이도현"));
    map.put("star", 9.0);
    
    // key 를 저장하는 set 생성
    Set<String> keys = map.keySet();
    System.out.println(keys);
    
    
    // Set 순회하면서 Map 의 value 확인
    for(String key : keys) {
      System.out.println(map.get(key));
    }
  }

  
  public static void d() {
    
    // Map 인스턴스 생성
    Map<String, Object> map = Map.of("soonbun", 1150,
                                     "bunho", new HashSet<Integer>(Arrays.asList(2, 10, 1, 58, 18, 9)));
    
    // Set 에 모든 Entry 저장
    Set<Entry<String, Object>> entries = map.entrySet(); 
    
    // for문 순회
    for(Entry<String, Object> entry : entries) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    
  }
  
  
  public static void main(String[] args) {
    d();
    
  }
  
}
    
    
    
    
    
    
    
    
    
    
    
    
    
  
  
  
  
  
  
  
  
  
  
  
  
