import java.util.Scanner;
public class Driver {

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the color, opacity, radius of a circle: ");

    Circle c = new Circle(input.next(), input.nextInt(), input.nextDouble());

    System.out.println("Enter the color, opacity, width and height of a rectangle: ");

    Rectangle r = new Rectangle(input.next(), input.nextInt(), input.nextDouble(), input.nextDouble());

    System.out.println("The geometric object with greater area is:");

    if( c.getArea() > r.getArea()) {
      System.out.println(c.toString());
    } else {
      System.out.println(r.toString());
    }

    System.out.println("The geometric object with greater perimeter is:");

    if(c.getPerimeter() > r.getPerimeter()) {
      System.out.println(c.toString());
    } else {
      System.out.println(r.toString());
    }



  }
  
}