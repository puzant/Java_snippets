import java.util.Scanner;
public class Driver {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Book[] array = new Book[5];
    
    String name;
    String publisher;
    String authors;
    int authorCounter = 0;

    int sopIndicator = 1;

    for(int i=0; i<array.length; i++) {
      System.out.println("Enter book " + sopIndicator + " information: ");
      name = input.nextLine();
      publisher = input.nextLine();
      authors = input.nextLine();
      array[i] = new Book(name, publisher, authors);
      sopIndicator++;
    }

    //  display the name of the 3rd book in the arra
    System.out.println("The Name of the 3rd book is: " + array[2].getName());

    //  Prints the name of the first author of each book in the array.
    System.out.println("the name of the first author in each book");
    for(int i=0; i<array.length; i++) {
      System.out.println( array[i].getAuthors(0));
    }

    System.out.println("Enter the name of the author");
    String authName = input.next();
    for(int i=0; i<array.length; i++) {
      if(array[i].getAuthors(0) == authName) {
        authorCounter++;
      }
    }

    System.out.println("The number of Books having " + authName + " as the author is: " + authorCounter );
    System.out.println("The number of books that have been created is: "  + array[0].getCounter());



  }
}