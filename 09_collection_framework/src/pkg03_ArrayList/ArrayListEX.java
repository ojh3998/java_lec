package pkg03_ArrayList;

import java.util.*;   // 자바 유틸의 모든 것

// import java.util.ArrayList;         // ctrl + shift + o
// import java.util.Arrays;
// import java.util.List;

public class ArrayListEX {
 /**
  * Mutable 객체
  * 저장된 요소의 갯수를 변경할 수 있다. 
  * 크기는 자동으로 조정된다. 기본 10개 지만, 더 추가하면 자동으로 조정해줌.
  */
  
  
  
  public static void a() {
    
    //  ArrayList 선언 : 타입은 List 인터페이스 타입 사용                  
    List<String> members;
    
    // ArrayList 생성 : 제네릭 타입 생략가능
    members = new ArrayList<String>();          //  members = new ArrayList<>();   기본 배열 크기 10
    
    // 요소 추가하기 ( 인덱스 0부터 순차적으로 추가된다. )
    members.add("제니");
    members.add("지수");
    members.add("소정");
    members.add("로제");
    members.add("리사");
    
   
    // 요소 삭제하기 (삭제된 요소 자리로 이후 요소들이 이동한다.)
    members.remove(2);
    
    // 요소 수정하기
    members.set(0, "jenny");
    
    // 요소 전체 확인
    System.out.println(members);
    
    // 요소 개별 확인
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    
    // 요소 갯수
    System.out.println(members.size());
    
    // for 문
    for(int i = 0, size = members.size(); i < size; i++) {
      System.out.println(members.get(i));
    }
  }
  
  /**
   * Immutable 객체
   * 저장된 요소의 갯수를 변경할 수 없다.
   */
  
  public static void b() {

    
    // (배열) 초기화를 이용한 ArrayList 생성 -- 따라서, Immutable - 초기화를 하면 추가도 삭제도 못함, 수정만 가능
    
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 46, 70, 80);
    
    // 요소 추가하기
   // numbers.add(80);
    
    //요소 삭제하기
   // numbers.remove(5);
    
    // 요소 수정하기
    numbers.set(5, 60);
    
    
    //전체 요소 확인
    System.out.println(numbers);
    
 // 요소 개별 확인
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    System.out.println(numbers.get(2));
    System.out.println(numbers.get(3));
    System.out.println(numbers.get(4));
    System.out.println(numbers.get(5));
    System.out.println(numbers.get(6));
    System.out.println(numbers.get(7));
   

  }
  
  public static void c() {
    
    String[] words = {"봄", "여름", "가을", "겨울"};         
    List<String> seasons = Arrays.asList(words);
    
    for(int i = 0, size = seasons.size(); i < size; i++) {  // for 문에서 메소드를 여러번 호출 하는 것은 지양,  따라서 seasons.size()메소드를 size 변수에 에 넣은 것임 -- 초기화 영역에서
      System.out.println(seasons.get(i));                   // + for 문에서  for(초기화; 조건식; 증감식)
                                                            // 1.초기화 부분은 반복문이 시작되기 전에 한번만실행
                                                            // 2.조건식: 매 반복이 실행되기 전에 평가됩니다. 이 조건식이 true 일 경우에만 반복문이 실행됩니다. 조건식이 false 가 되면 반복문이 종료됩니다.  
  }                                                         // 3.증감식: 반복문이 한 번 실행된 후에 실행되는 부분으로, 보통 반복 변수의 값을 변경합니다. 예를 들어, 변수의 값을 증가시키거나 감소시킬 수 있습니다. 
    
    for(int i = 0; i < words.length; i++) {  // words.legnth 는 변수임으로 여러번 호출해도 괜찮음.
      System.out.println(words[i]);
    }
  }
  
  
  public static void main(String[] args) {
    a();
    
    
  }
  
}

