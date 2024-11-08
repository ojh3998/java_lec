package pkg093_constructor;

import java.util.Arrays;

public class ConstructorEx {

  public static void main(String[] args) {
    
    Developer developer1 = new Developer(new String[] {"자바", "파이썬"});
    developer1.setName("김성율");
    developer1.setSkills(new String[] {"자바", "파이썬"});
    System.out.println(developer1.getName());
    System.out.println(Arrays.toString(developer1.getSkills()));
    
    System.out.println("------------------------");
    
    Developer developer2 = new Developer("박소정", new String[] {"노드", "자바스크립트"});
    System.out.println(developer2.getName());
    System.out.println(Arrays.toString(developer2.getSkills()));
  }

}
