package pkg09_BankAccount;

public class WithdrawalException extends BankAccountException {

  private static final long serialVersionUID = -2576506307542095681L;

 
 public WithdrawalException(String message, int code) {
   super(message, code);
   
 }
   
}