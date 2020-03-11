/**
An integer is called a pan number if the sum of its digits is divisible by its size (number of digits).
Write the following methods:
 getSize: Takes as a parameter an integer and returns the number of the digits of this integer.
 getSum: Takes as a parameter an integer and returns the sum of the digits of this integer.
 isPanNumber: Takes as a parameter an integer and returns true if the an integer is Pan and false otherwise.
Test these methods in the main by asking the user to enter an integer then display if it is a pan number or not.
**/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int numberToTest;
    Scanner input = new Scanner(System.in);
    System.out.print("enter an integer to test: ");
    numberToTest = input.nextInt();

    System.out.print("the number of digits is: " + getSize(numberToTest));

    System.out.println("");

    System.out.print("the sum of digits is: " + getSum(numberToTest));

    System.out.println("");

    if(isPanNumber(numberToTest)) {
      System.out.print(numberToTest + " is a pan number");
    } else {
      System.out.print(numberToTest + " is not a pan number");
    }
      

  }

  static int getSize(int number) {
    int count = 0;
      while(number != 0) {
        number /= 10;
        ++count;
      }
      return count;
  }

  static int getSum(int number) {
    int sum = 0;
    while (number > 0) {
      sum = sum + number % 10;
      number = number / 10;
    }
    return sum;
  }

  static boolean isPanNumber(int number) {
    if(getSum(number) % getSize(number) == 0)
      return true;
    return false;
  }

}