package pkg10_interface.A_overview;

public class Circle implements Shape {
  
  private double radius;
  
  
  
  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  
  @Override
  public double getCircm() {
    
    return 2 * Math.PI * radius;
  }
  
  @Override
  public double getArea() {
   
    return Math.PI * Math.pow(radius, 2);
  }
}
