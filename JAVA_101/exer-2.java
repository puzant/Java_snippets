/**
Write a method called alternatingSum that accepts an array of integer values and returns alternating sum of all
elements in the array.For example, if an array contains the values {89, 35, 44, 61, 66, 52, 45, 16, 48, 73} then
its alternating sum is 55 (since 89 – 35 + 44 – 61 + 66 – 52 + 45 – 16 + 48 – 73 = 55).
Write a test program that fills an array of size 10 by reading values from the user. The program then calls the
above method to display the alternate sum.
**/

import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int arr[] = new int[10];
    int newArr[] = new int[5];

    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 Integers: ");

    for(int i=0; i<arr.length; i++) {
      arr[i] = input.nextInt();
    }

    alternatingSum(arr, newArr);
    System.out.print("The alternating sum is " + finalSum(newArr));

  
  }

  static int finalSum(int arr[]) {
    int sum = 0;
    for( int i=0; i<arr.length; i++ ) {
      sum += arr[i];
    }
    return sum;
  }

  static int[] alternatingSum(int arr[], int newArr[]) {
    for(int i=0, j=0; i<arr.length; i=i+2, j++) {
        newArr[j] = arr[i] - arr[i+1];
    }
    return newArr;
  }

}