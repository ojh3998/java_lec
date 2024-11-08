package pkg12_Bakery;

public class Bakery {
 
  //field
  private int bread; // 판매 할 빵의 갯수
  private int price; // 빵 가격
  private int money; // 자본금
  
  //constructor 생성자
  public Bakery(int bread, int price, int money) {
    this.bread = bread;
    this.price = price;
    this.money = money;
  }
  
  
  //getter, setter
  public int getBread() {
    return bread;
  }

  public void setBread(int bread) {
    this.bread = bread;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 판매처리
   * @param money 고객이 지불한 돈
   * @param bread 고객이 사려는 빵의 갯수
   * @return 판매할 빵의 갯수와 잔돈
   */
  public BreadNChange sell(int money, int bread) {
    
    // 판매할 빵이 부족한 상황
    if(this.bread < bread) {
      System.out.println("판매 할 빵이 부족해요.");
      return null;  // 안준다. 
    }
    
    // 고객이 지불한 돈이 부족한 상황
    if(money < bread * price) {
      System.out.println("돈이 부족하네요.");
      return null; // 안준다.
    }
    
    // 판매하자
    this.money += bread * price;  // 빵집의 돈은 고객이 사간 만큼 증가
    this.bread -= bread;         // 빵집의 빵은 고객이 사간 빵만큼 감소
    
    // 반환
    return new BreadNChange(bread, money - bread * price);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
