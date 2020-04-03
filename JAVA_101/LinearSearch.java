/**
Sequential Search
Sequential search is the easiest (but not most efficient) method for searching an array
 */

import java.util.Scanner;
class LinearSearch {
  public static void main(String args[]) {

    int[] arr = new int[]{1,2,3,4,5};
    int target = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer to search: ");
    target = input.nextInt();
    

    if( sequentialSearch(arr, target) == 0 ) {
      System.out.print("Your Target is available in the list! ");
    } else {
      System.out.print("Your Target is not available in the list!");
    }

  }

  public static int sequentialSearch(int[] arr, int target) {
    for( int i=0; i<arr.length; i++ ) {
      if(arr[i] == target) 
      return 0;
    }
    return -1;
  }
}