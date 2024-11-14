package pkg13_Bus;

public class Bus {
  
  private Seat[] seats;
  private int numOfPerson; // 탑승자 수
  
  public Bus(int limit) {
    seats = new Seat[limit];
    for(int i = 0; i < limit; i++) {
      seats[i] = new Seat();    // 버스에 시트를 채워주는 작업
    }
    numOfPerson = 0;
  }

  // 버스 탑승 ( 빈 좌석 앞자리부터 채우기, 입석금지)
  public void on(Person person) {
    if (numOfPerson == seats.length) {
      System.out.println("만석입니다.");
      return;
    }
    for(int i = 0; i < seats.length; i++) {
      if(seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        numOfPerson++;
        return;
        
      }
    }
    
    
  }
  
  // 버스 하차 (내리는 사람의 좌석 번호를 이용해서 하차) 1~25
  public void off(int seatNo) {
    seatNo--;
    if(seatNo < 0 || seatNo >= seats.length) {
      System.out.println("좌석 번호가 잘못 전달되었습니다.");
      return;
    }
    seats[seatNo].setPerson(null);
    numOfPerson--;
    
  }
  
  //버스 탑승 명단 ( 1번 좌석 : 김성율, 2번 좌석 : 조동수 3번 자석 : 비어있음 ...)
  public void info() {
    for(int i = 0; i < seats.length; i++) {
      Person p = seats[i].getPerson(); // 각 좌석에 앉은 사람
      if(p == null)
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : 비어있음");
      else
        System.out.println(String.format("%02d", i + 1) + "번 좌석 : " + p.getName());
        
    }
    
  }
}
