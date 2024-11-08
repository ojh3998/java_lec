package pkg12_Bakery;

public class Customer { 
  
  private int bread;  // 고객이 구매한 빵의 갯수
  private int money; // 고객이 가진돈 
  
  public Customer(int bread, int money) {
  
    this.bread = bread;
    this.money = money;
  }

  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 구매처리
   * @param bakery 구매할 빵집
   * @param bread 구매할 빵의 갯수
   * @param money 구매할 때 지불할 돈
   */
  public void buy(Bakery bakery, int bread, int money) {
    
    // 가진돈보다 더 많은 돈을 내려고 하는 상황
    if(this.money < money) {
      System.out.println("고객이 가진돈이 부족하다." + (money - this.money) + "원 부족");
      return;
    }
    
    // 구매하자 (구매 == 빵집의 판매, 빵집의 판매 결과를 받는 것이 곧 구매이다!!)
    BreadNChange breadNChnage = null;
    if(bakery != null) {
      breadNChnage = bakery.sell(money, bread);
    }
    
    // 구매결과 확인
    if(breadNChnage != null) {    // 구매 성공
      this.bread += breadNChnage.getBread();
      this.money -= (money - breadNChnage.getChange());
    }
    
    
  }











}
