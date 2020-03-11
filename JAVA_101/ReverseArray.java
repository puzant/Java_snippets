/**
This program reverse the array. For example if user enters the array elements as 1, 2, 3, 4, 5 then the program would reverse the array and the elements of array would be 5, 4, 3, 2, 1. 
**/

import java.util.Scanner;
import java.util.Arrays;
class ReverseArray {
  public static void main(String[] args) {
    
    int size = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("How many ELements do you want to enter?: ");
    size = input.nextInt();

    int[] array = new int[size];

    for(int i=0; i<size; i++) {
      System.out.print("Enter array element: ");
      array[i] = input.nextInt();
    }

    System.out.println("array content is : " +  Arrays.toString(reverseArray(array)));

  }

  public static int[] reverseArray(int[] arr) {

    int[] reverseArr = new int[arr.length];

    for(int i=0; i<arr.length; i++) {
      reverseArr[i] = arr[arr.length-1-i];
    }

    return reverseArr;
  }

  public static void printArray(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

}