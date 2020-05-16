public class Circle extends GeometricObjec {

  private double radius;

  public Circle(String color, int opacity, double radius) {
    //  invoke GeometricObjec class constructor
    super(color, opacity);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double newRadius) {
    this.radius = newRadius;
  }

  public double getArea() {
    double area;
    area = Math.PI * Math.pow(this.radius, 2);
    return area;
  }

  public double getPerimeter() {
    double perimeter;
    perimeter = 2 * Math.PI * this.radius;
    return perimeter;
  }

  public String toString() {
    return "Circle ( color= " + getColor() + " opacity= " + getOpacity() + ") with radius= " + this.radius;
  }



}