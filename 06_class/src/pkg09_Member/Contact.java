package pkg09_Member;

public class Contact {

 private String tel;
 private String mobile;
  
 public Contact() {
    
    
  }
  
  public Contact(String mobile) {
    // this.mobile = mobile;
    this(null, mobile);                  // 밑에 생성자를 불러온 것
  }
  
  public Contact(String tel, String mobile) {
    this.tel = tel;
    this.mobile = mobile;
  }
  
  public void info() {
    System.out.println("Tel: " + (tel == null ? "없음" : tel));               // if 를 대신하는 조건 연산자
    System.out.println("Mobile: " + (mobile == null ? "없음" : mobile));
  }
  
}
