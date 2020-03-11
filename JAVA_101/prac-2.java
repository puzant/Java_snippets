/**
- Write a method that takes an array of integers and print the elements of the array. The header of the method is: void displayArray(int [] arr)
- Write a main method in which you create an array named a of size entered by the user (the size should be even).
- Then fill the array a with values read from the user. Finally, split the array a into two arrays b and c as follows:
- Finally, call the method dislayArray to print arrays b and c.
**/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    int arraySize=0;

    Scanner input = new Scanner(System.in);
    
    do {
      System.out.print("Enter size of the Array A: ");
      arraySize = input.nextInt();
    } while( arraySize % 2 != 0 );

    int arrA[] = new int[arraySize];

    System.out.print("Enter the " + arraySize + " elements of array a: ");

    for(int i=0; i<arrA.length; i++) {
      arrA[i] = input.nextInt();
    }

    System.out.print("after spliting: ");
    //  start splitting the array
    //  arraySize / 2
    int arrB[] = new int[arraySize / 2];
    int arrC[] = new int[arraySize / 2];

    //  loop to fill arrB
    for(int i=0; i<arrA.length / 2; i++) {
      arrB[i] = arrA[i];
    }

    //  loop to fill arrC
    for(int i=arrA.length-1; i > 0; i--) {
      arrC[i] = arrA[i];
    }

    displayArray(arrB);
    displayArray(arrC);

  }

  static void displayArray(int[] arr) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}