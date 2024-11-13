package pkg10_interface.C_marker;

public class Hamberger implements Food, Eatable {

  @Override
  public void eat() {
    System.out.println("한 입에 먹는다");

  }

}
