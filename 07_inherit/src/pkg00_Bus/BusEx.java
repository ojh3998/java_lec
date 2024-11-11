package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {

    Bus bus = new Bus(9);
    
    bus.on(new Man("김성율"));
    bus.on(new Man("신순후"));
    bus.on(new Man("조동수"));
    bus.on(new Man("정승현"));
    bus.on(new Man("김민정"));
    bus.on(new Man("박한비"));
    bus.on(new Man("이태현"));
    bus.on(new Man("장서린"));
    
    bus.info();
    
    bus.off(3);
    bus.info();
    
    bus.on(new Woman("박소정"));
    bus.info();
    
    
  }

}
