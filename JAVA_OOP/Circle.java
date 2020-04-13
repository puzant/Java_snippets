import java.util.Random;

public class Circle {

  private double radius;
  
  //  constructor
  public Circle(double newRadius) {
    radius = newRadius;
  }

  public void setRadius(double newRadius) {
    radius = newRadius;
  } 

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public void print() {
    System.out.print("The radius is: " + radius);
  }

  public static void main(String[] args) {

    Random r = new Random(); // Create Random object

    Circle[] circleArray = new Circle[10];

    for (int i = 0; i < circleArray.length; i++) {

    circleArray[i] = new Circle(r.nextDouble()*10);

    System.out.print("Circle " + i + " radius = " + circleArray[i].getRadius());

    System.out.println(" area = " + circleArray[i].getArea());

    } // end for loop

  }

}

