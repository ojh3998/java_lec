package pkg07_BankAccount;

import pkg01_try_catch.TryCatchEx;

public class BankAccount {
  
  private String accNo;
  private long balance;
  
  public  BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  
  /**
   * 입금 처리.
   * @param money 입금액 
   * @exception 마이너스 입금액 불가
   */
   public void deposit(long money) {
     try {
       
       if(money < 0) 
         throw new RuntimeException(money + "원은 잘못된 입금입니다");
         balance += money;
       
         
     } catch (Exception e) {
       System.out.println(e.getMessage());
       
     }
   }
          
   
   /**
    * 출금 처리
    * @param money 출금액 
    * @return 실제 출금액.
    * @exception 마이너스 출금 불가.
    * @exception 잔액보다 큰 금액 출금 불가.
    */
   public long withdrawal(long money) {
     long value = 0L;
     try {
       
       if(money < 0 || money > balance) 
         throw new RuntimeException(money + "원은 출금 불가합니다.");
       balance -= money;
       value = money;
       
     } catch (Exception e) {
       System.out.println(e.getMessage());
     }
     return value;
   }
   
       
   
   /**
    * 이체 처리
    * @param bankAccount 이체할 계좌 정보.
    * @param money 이체할 금액.
    */
   public void transfer(BankAccount bankAccount, long money) {
     
     long withdrawalMoney = this.withdrawal(money);
     bankAccount.deposit(withdrawalMoney); 
     //  bankAccount.deposit(this.withdrawal(money));
     
   }
   
   
   /**
    * 계좌 조회 - 계좌번호와 통장 잔액을 출력.
    */
   public void inquiry() {
     System.out.println("BankAccountNO: " + accNo);
     System.out.println("Balance: " + balance);
     
   }
   
   
   
   
   
   
   
   
   
   
   
      
       
      
    
  
 

}
