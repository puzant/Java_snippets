public class Point {

  public double x;
  public double y;

  public Point() {}

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public void setX(double nX) {
    this.x = nX;
  }

  public void setY(double nY) {
    this.y = nY;
  }

  public double distance(Point p1, Point p2) {
    double d = Math.sqrt( Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2) );
    return distance;
  }

  public String toString() {
    return "Circle @ (" + this.x + "," + this.y 
  }

}