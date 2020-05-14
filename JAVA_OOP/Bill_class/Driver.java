import java.util.Scanner;
public class Driver {

  public static void main(String[] args) {

    String code;
    String customerName;
    double feesValue;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the data about the first Bill: ");
    
    code = input.next();
    customerName = input.next();
    feesValue = input.nextDouble();

    Bill b1 = new Bill(code, customerName, feesValue);

    System.out.print("Enter the data about the second Bill: ");

    code = input.next();
    customerName = input.next();
    feesValue = input.nextDouble();

    Bill b2 = new Bill(code, customerName, feesValue);

    //  output the data using toString() 
    System.out.println(b1.toString());
    System.out.println(b2.toString());

    //  output the final fees 
    System.out.println("The Total final fees: " + b1.computeFinalFees() + b2.computeFinalFees());

    //  output the bill code with the highest final fee 
    if(b1.computeFinalFees() > b2.computeFinalFees()) {
      System.out.println("The highest fees is " + b1.computeFinalFees() + " for bill code " + b1.getCode());
    } else {
      System.out.println("The highest fees is " + b2.computeFinalFees() + " for bill code " + b2.getCode());
    }

  }

}