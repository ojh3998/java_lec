package pkg01_wrapper_class;

public class WrapperEx {

  public static void main(String[] args) {
   
    // primitive type -> Wrapper class (reference type 으로 바꿔주는 것)
    Byte a = 1;
    Short b = 2;
    Integer c = 3;
    Long d = 4L;
    Float e = 5.0f;
    Double f = 6.0;
    Character g = 'A';
    Boolean h = true;
    
    // Auto Boxing : primitive 가 자동으로 wrapper class 로 바뀌는 것
    Integer x = 10;
    
    // Auto Unboxing : wrapper class 가 자동의로 primitive 로 바뀌는 것
    int y = x + 10;    // Integer x 가 자동으로 int 로 변환됨.
    
    System.out.println(x);
    System.out.println(y);
    
    
    
    
    
    
    
    
    
    
  }

}
