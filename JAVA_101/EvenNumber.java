import java.util.Scanner;
class EvenNumber {
  public static void main(String args[]) {

    int number = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("enter an integer: ");

    number = input.nextInt();

    if( isEven(number) ) System.out.print(number + " is an Even number! ");
    else System.out.print(number + " is an Odd number! ");

  }

  public static boolean isEven(int n) {
    if( n % 2 == 0 ) 
      return true;
    return false;
  }
}