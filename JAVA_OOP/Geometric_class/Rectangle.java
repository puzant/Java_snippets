public class Rectangle extends GeometricObjec {

  private double width;
  private double height;

  public Rectangle(String color, int opacity, double width, double height) {
    super(color, opacity);
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWidth(double newWidth) {
    this.width = newWidth;
  }

  public void setHeight(double newHeight) {
    this.height = newHeight;
  }

  public double getArea() {
    double area;
    area = this.height * this.width;
    return area;
  }

  public double getPerimeter() {
    double perimeter;
    perimeter = 2 * (this.height + this.width);
    return perimeter;
  }

  public String toString() {
    return "Rectangle ( color= " + getColor() + " opacity= " + getOpacity() + ") with width= " + this.width + " height= " + this.height;
  }




}