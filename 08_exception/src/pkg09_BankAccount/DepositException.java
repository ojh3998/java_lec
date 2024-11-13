package pkg09_BankAccount;

public class DepositException extends BankAccountException {
  

  private static final long serialVersionUID = -2061721745540334103L;

 
 public DepositException(String message, int code) {
   super(message, code);
   }
   
 }

