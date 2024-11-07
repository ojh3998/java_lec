package pkg09_Member;

public class MemberEx {

  public static void main(String[] args) {
    
    
    // Member 타입의 인스턴스 m 생성
    
     Address address = new Address("12345", "광주광역시 동구 운림동", "소태동 모아미래도");
     Contact contact = new Contact("010-1234-5678");
     Member m = new Member("kim", address, contact);
     
    //  Member m = new Member("lee",
       //                      new Address(null, null, null),
         //                    new Contact()
           //                  );
  
     m.info();
  } 

}
