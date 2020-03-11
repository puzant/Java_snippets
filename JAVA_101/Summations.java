/**
 * Make a program that will take an int (x) and give you the summation of all numbers from 1 up to x included.
 *  If the given input is not an integer, return "Invalid Value".
 */

import java.util.Scanner;
class Main {
  public static void main(String args[]) {

   Scanner input = new Scanner(System.in);
   int number = 0;
   int i=0; 
   int sum=0;

   System.out.print("Enter a number to sum all of its numbers?: ");
   number = input.nextInt();

  if(number == (int)number) { //  check if number is a number
    while( i <= number ) {
      sum = sum+i;
      i++;
    }
  }


   System.out.print("summation of "+ number + " is: " + sum);

  }
}