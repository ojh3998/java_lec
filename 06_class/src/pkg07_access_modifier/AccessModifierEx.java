package pkg07_access_modifier;

public class AccessModifierEx {

  public static void main(String[] args) {
    
    // Sample 타입의 인스턴스 s
    Sample s = new Sample();
    
    // s.item = "data"
    s.setItem("data");
    
   //  System.out.println(s.item);
   System.out.println(s.getItem());

  }
  
  

}
