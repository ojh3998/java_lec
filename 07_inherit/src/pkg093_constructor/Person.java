package pkg093_constructor;

public class Person { 
  
  private String name;

  public Person() {        // 디폴트 생성자는 아무일을 안해도 만들어 놓기 
    
  }
 
  public Person(String name) { // 생성자가 있기 때문에 디폴트 생성자가 자동으로 만들어지지 않음
    super();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
 
  
  

}
