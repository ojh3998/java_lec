package pkg10_interface.C_marker;

public class MakerEx {

  public static void main(String[] args) {
   
    Kimchi kimchi = new Kimchi();
    Hamberger hamberger = new Hamberger();
    Sashimi sashimi = new Sashimi();
    
    Person person = new Person();
    person.eat(kimchi);
    person.eat(hamberger);
  //  person.eat(sashimi);
    
  }


}
