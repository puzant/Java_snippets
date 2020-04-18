import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {

    //  create two Vehicle objects
    Vehicle v1 = new Vehicle();
    Vehicle v2 = new Vehicle();

    enterVehicle(v1);
    enterVehicle(v2);

    if(v1.getYear() < v2.getYear()) {
      System.out.println(v1.toString() + "is older than" + v2.toString());
    } else {
      System.out.println(v2.toString() + "is older than" + v1.toString());
    }

  }

  public static void enterVehicle(Vehicle v) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter Vehicle Name: ");
    v.setBrand(input.next());

    System.out.print("Enter Vehicle Year: ");
    v.setYear(input.nextInt());

    System.out.print("Enter Vehicle Price: ");
    v.setPrice(input.nextDouble());

  }

}