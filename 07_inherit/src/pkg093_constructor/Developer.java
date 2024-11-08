package pkg093_constructor;

public class Developer extends Person {
  
  private String[] skills;

  public Developer(String[] skills) { 
    super();        // 부모의 디폴트 생성자로 이어짐,생략가능 -> public Person() {} 호출! 
    this.skills = skills;
  }
  
  public Developer(String name, String[] skills) {
    // 자식은 반드시 수퍼 클래스의 생성자를 호출해야 한다.
    super(name);  // super 클래스(부모 클래스)의 생성자 호출! -> public Person(String name) {}
    this.skills = skills;
  }

  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
  
  
  

  
  
}
