/**
 * return the index of the smallest integer
 */

import java.util.Scanner;
public class Smallest {

  public static void main(String[] args) {

    int[] arr = new int[10];
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter 10 integers: ");

    for(int i=0; i<arr.length; i++) {
      arr[i] = input.nextInt();
    }

    System.out.print("The indedx of the smallest Element in the array is: " + getSmallestIntIndex(arr));


  }

  public static int getSmallestIntIndex(int[] arr) {

    int index = 0;
    int min = arr[index];

    for(int i=0; i<arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
        index = i;
      }
    }

    return index;

  }
  
}