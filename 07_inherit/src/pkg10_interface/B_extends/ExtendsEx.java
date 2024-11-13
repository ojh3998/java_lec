package pkg10_interface.B_extends;

public class ExtendsEx {

  public static void main(String[] args) {
    // SmartPhone 인스턴스가 가질 수 있는 타입
    // : Electronic, Computer, Phone, SmartPhone
    
     Electronic p1 = new SmartPhone();
     p1.powrOn();
     p1.powrOff();
     ((Computer) p1).game();
     ((Phone) p1).call();
     ((Phone) p1).sms();
     
     System.out.println();
     
     Computer p2 = new SmartPhone();
     ((Electronic) p2).powrOn();
     ((Electronic) p2).powrOff();
     p2.game();
     ((Phone) p2).call();
     ((Phone) p2).sms();
     
     System.out.println();
     
     Phone p3 = new SmartPhone();
     ((Electronic) p3).powrOn();
     ((Electronic) p3).powrOff();
     ((Computer) p3).game();
     p3.call();
     p3.sms();
     
     System.out.println();
     
     SmartPhone p4 = new SmartPhone();
     p4.powrOn();
     p4.powrOff();
     p4.game();
     p4.call();
     p4.sms();
  }

}
