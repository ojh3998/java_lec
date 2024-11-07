package pkg03_casting;

public class CastingEx {

  public static void main(String[] args) {
    
    // 1. 자동 형 변환 (묵시적 형 변환, promotion)
    // 값의 도메인(값의 범위)이 작은 타입을 큰 타입으로 변환된다. - 서로 다른 타입이 섞여있을 때 
    // byte < short < int < long < float < double
    int a = 10;
    long b = a;
    double c = b + 1.5; // 변수 b 를 double 타입으로 변환한 뒤 더한다!! 
    System.out.println(c);
    
    // 2. 강제 형 변환 (명시적 형 변환, casing)
    // 어떤 타입으로든 강제로 형 변환 가능
    long x = 256L;
    int y = (int)x;   
    byte z = (byte)y; 
    System.out.println(y);
    System.out.println(z);
    
    
    
    
    
  }

}
