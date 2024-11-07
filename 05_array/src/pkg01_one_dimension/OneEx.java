package pkg01_one_dimension;

import java.util.Arrays;

public class OneEx {

  public static void main(String[] args) {
    
    
    // 1차원 배열 : 하나의 인덱스를 사용하는 배열
    
    
    // 배열 선언 -- [] 을 타입뒤에 붙이거나, (변수 뒤에 붙이거나) 
    String[] members;  // 참조 변수 members 하나가 생성된다.
     
    // 배열 생성 -- 배열의 길이가 필요
    members = new String[4];   // 힙(heap) 영역에 연속된 4개의 공간이 생기고. 해당 참조를 members 변수에 저장한다. 
    
    //배열 요소 -- 배열이름 + 인덱스
    members[0] = "지수";
    members[1] = "로제";
    members[2] = "리사";
    members[3] = "제니";
    
    System.out.println(members[0]);
    System.out.println(members[1]);
    System.out.println(members[2]);
    System.out.println(members[3]);
    
    
    // 배열 요소의 초기화1 -- 선언 할때 초기화
    String[] hobbies = {"reading", "game", "travel"};
    
    System.out.println(hobbies);
    System.out.println(hobbies.toString());
    System.out.println(Arrays.toString(hobbies));
    
    // 배열 요소의 초기화2 -- 선언과 초기화를 분리
    String[] movies;
    movies = new String[] {"타이타닉", "스타워즈", "에일리언"};
    System.out.println(Arrays.toString(movies));
    
    // 배열 길이 --  수정 불가
    String[] flowers = {"장미", "동백", "튤립"};
    System.out.println(flowers.length);
    // flowers.length = 10; 배열의 길이는 수정불가 -- length 는 상수(final) 이기 때문.
    
    // 배열 순회 (일반 for 문) 
    String[] animals = new String[] {"사자", "호랑이", "코끼리"};
    for(int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]);
    }
    
    
    // 배열의 길이를 늘이는 방법 -- 이사
    // 1. 새로운 길이의 새로운 배열을 만든다.
    // 2. 기존 배열의 요소를 모두 새로운 배열로 옮긴다.
    // 3. 기존 배열의 참조를 새로운 배열의 참조로 바꾼다.
    
    String[] seasons = {"봄", "여름"};
    String[] temp = new String[4];
    for(int i = 0; i < seasons.length; i++) {
      temp[i] = seasons[i];
    }
   seasons = temp;
    
    System.out.println(Arrays.toString(seasons));
    
    // 배열 순회 ( Advanced for 문 - 배열 요소를 수정할 때는 사용할 수 없다. )
    String[] foods = {"김치", "보쌈", "시금치"};
    for(String food : foods) {
      // food = "삼겹살" ; -- 모든 요소를 삼겹살로 수정 안됨.
      System.out.println(food);
    }
    
    
    
    // 수정하는 법, 일반 for 문
    for(int i = 0; i < foods.length; i++) {
      foods[i] = "삼겹살";
    }
    System.out.println(Arrays.toString(foods));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}
