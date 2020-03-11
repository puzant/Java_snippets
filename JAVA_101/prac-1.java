/**
Write a program that has a loop of three iterations. In every iteration, the program should prompt the user to
enter three integers then invoke a method called hasOddEven that takes the three integers as parameters and
returns true if there is at least one odd and at least one even among the three numbers and that returns false
otherwise. Below are some sample calls and the returned value:
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n1 =0; 
    int n2 = 0; 
    int n3 = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Three integers: ");

    for(int i=0; i<=3; i++) {
      if(i == 0) n1 = input.nextInt();
      if(i == 1) n2 = input.nextInt();
      if(i == 2) n3 = input.nextInt();
    }

    hasOddEven(n1, n2, n3);
  }

  static boolean hasOddEven(int n1, int n2, int n3) {
    //  check for even numbers;
    int isThereEvenNumbers = 0;
    int isThereOddNumbers = 0;
    
    if(n1 % 2 == 0 || n2 % 2 == 0 || n3 % 2 == 0) isThereEvenNumbers++;
    if(n1 % 2 != 0 || n2 % 2 != 0 || n3 % 2 != 0) isThereOddNumbers++;

    if(isThereEvenNumbers > 0 && isThereOddNumbers > 0) return true;
    return false;

  }

 
}