import java.util.Scanner;
public class SnnInput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String socialSecurityNumber;
    boolean properLength;
    boolean properDash;

    System.out.print("Enter the Social Security Number: ");

    socialSecurityNumber = input.nextLine();

    if(socialSecurityNumber.length() != 11) {
      properLength = false;
    } else {
      properLength = true;
    }

    if((socialSecurityNumber.charAt(4) != '-') && (socialSecurityNumber.charAt(7) != '-')) {
      properDash = false;
    } else {
      properDash = true;
    }

    if(!properLength && !properDash) {
      System.out.println("Invalid SNN");
    } else {
      System.out.println("Valid SNN");
    }

  }

}