package baitap.bai1;

public class Circle extends Shape {
  private double radius = 1.0;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle(String color, boolean filled, double radius){
    super(color, filled );
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  @Override
  public double getArea(){
    return 2.0;
  }

  @Override
  public double getPerimiter(){
    return 4.5;
  }


  @Override
  public String toString() {
    return "Circle{" +"Shape {"+
      "color="+getColor ()+
      "filled="+ isFilled ()+
      "radius=" + radius +
      "} " + super.toString ( );
  }
}
