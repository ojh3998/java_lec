package pkg10_interface.A_overview;

public class OverviewEx {

  public static void main(String[] args) {
    
    Shape rect = new Rectangle(1.5, 2.4);
    System.out.println(rect.getCircm());
    System.out.println(rect.getArea());
    
    Shape circle = new Circle(3.4);
    System.out.println(circle.getCircm());
    System.out.println(circle.getArea());
  }

}
