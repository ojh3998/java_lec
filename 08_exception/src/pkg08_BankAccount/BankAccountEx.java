package pkg08_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    
    
      
    try {
      
      // BankAccount 타입의 인스턴스 2개 생성하기
      BankAccount myAcc = new BankAccount("000000-00-000000", 500_000);
      BankAccount momAcc = new BankAccount("100000-10-100000", 1_000_000);
      
   //   momAcc.transfer(myAcc, 10_000_000);
   //   momAcc.transfer(myAcc, -100_000);
   //   momAcc.transfer(myAcc, 100_000);
        myAcc.deposit(-1);
        
        myAcc.inquiry();
        momAcc.inquiry();
       
    } catch (Exception e) {
     System.out.println(e.getMessage());
     
    }
  }

}
