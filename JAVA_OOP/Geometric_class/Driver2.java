/**
 * @author Puzant Bakjejian
 */
import java.util.Random;
import java.util.Scanner;
public class Driver2 {

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    GeometricObjec[] g = new GeometricObjec[10];
    String types;
    String color;

    System.out.println("Enter a string of 10 charecters containing Cs (for a circle) or R (for rectangle) ");
    types = input.next();

    System.out.println("Enter a String 10 characters containing R, G, or B to specify colors of geometric objects:");
    color = input.next();

    //  close scanner resource
    input.close();

    for(int i=0; i<types.length(); i++) {
      //  if color is red
      if(color.charAt(i) == 'r' || color.charAt(i) == 'R') {
        
        switch (types.charAt(i)) {
          case 'c':
            //  Circle class is derived class of geometric
            g[i] = new Circle("red", rand.nextInt(100), rand.nextDouble());
            break;
          
          case 'r':
            //  Rectangle class is derived class of geometric
            g[i] = new Rectangle("red", rand.nextInt(100), rand.nextDouble(), rand.nextDouble());
            break;
        }

        //  if color is green
      } else if(color.charAt(i) == 'g' || color.charAt(i) == 'G') {

        switch (types.charAt(i)) {
          case 'c':
            g[i] = new Circle("green", rand.nextInt(100), rand.nextDouble());
            break;
          
          case 'r':
            g[i] = new Rectangle("green", rand.nextInt(100), rand.nextDouble(), rand.nextDouble());
            break;
        }

        //  if color is blue
      } else if(color.charAt(i) == 'b' || color.charAt(i) == 'B') {

        switch (types.charAt(i)) {
          case 'c':
            g[i] = new Circle("blue", rand.nextInt(100), rand.nextDouble());
            break;
          
          case 'r':
            g[i] = new Rectangle("blue", rand.nextInt(100), rand.nextDouble(), rand.nextDouble());
            break;
        }
      
      }

    }

    for(int i=0; i<g.length; i++) {
      //  print the red geometric objects
      if(g[i].getColor() == "red" || g[i].getColor() == "Red") {
        System.out.println(g[i].toString());
      }

    }


  }

}