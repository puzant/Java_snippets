/**
 * Name: Puzant Bakjejian
 * Program to compute the Area & the Perimter of a regular Polygon
 */

public class RegularPolygon {

  int n = 3;
  double side = 1;
  double x = 0;
  double y = 0;

  //  no-arg constructor
  public RegularPolygon() {
    this.n = 3;
    this.side = 1;
    this.x = 0;
    this.y = 0;
  }

  public RegularPolygon(int n, double side) {
    this.n = n;
    this.side = side;
  }

  public RegularPolygon(int n, double side, double x, double y) {
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }

  //  getter methods for all the data fields
  public int getNumberOfSide() {
    return this.n;
  }

  public double getLengthOfSide() {
    return this.side;
  }

  public double xCordinate() {
    return this.x;
  }

  public double yCordinate() {
    return this.y;
  }

  //  setter methods for all the date fields
  public void setNumberOfSide(int newSide) {
    this.n = newSide;
  }

  public void setLengthOfSide(double newLengthOfSide) {
    this.side = newLengthOfSide;
  }

  public void setNewXCord(double newXCord) {
    this.x = newXCord;
  }

  public void setNewYCord(double newYCord) {
    this.y = newYCord;
  }

  //  get the Perimeter of the polygon
  public double getPerimeter() {
    double perimeter = 0;
    perimeter = this.n * this.side;
    return perimeter;
  }

  public double getArea() {
    double area = 0;
    //  formula to compute the area of the polygon
    area = ( (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n)) );
    return area;
  }

  public static void main(String args[]) {
    
    //  creata an instance of the RegularPolygon Class
    RegularPolygon rp1 = new RegularPolygon(6, 4);
    RegularPolygon rp2 = new RegularPolygon(10, 4, 5.6, 7.8);

    System.out.println("Rp1 Perimeter & Area");
    System.out.println("Rp1 Perimeter: " + rp1.getPerimeter());
    System.out.println("Rp1 Area: " + rp1.getArea());

    System.out.println("-----------------------------");

    System.out.println("Rp2 Perimeter & Area");
    System.out.println("Rp2 Perimeter: " + rp2.getPerimeter());
    System.out.println("Rp2 Area: " + rp2.getArea());
    
  }

}