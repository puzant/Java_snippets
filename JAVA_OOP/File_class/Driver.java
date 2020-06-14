import java.util.Scanner;
public class Driver {

  public static void main(String[] args) {

    Scanner myDocs = new Scanner(System.in);
    Folder f = new Folder(10);

    for(int i=0; i<myDocs.length; i++) {
      System.out.print("Do you want to add word or excel file? (W for word/ E for excel)");
      
      char type = input.next().charAt(0);
      File f;
      
      if(type == 'W' || type == 'w') {
        System.out.print("Enter name, size, word count, pages count, and text: ");
        f = new WordFile(input.next(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextLine());
      } else {
        if(type == 'E' || type == 'e') {
          f = new ExcelFile(input.next(), input.nextInt(), input.nextInt(), input.nextLine());
        }
      }
      myDocs.addFile(f);

      System.out.print("Do you want to add a file to the folder? (enter Y for yes)");
      char addMore = input.next.charAt(0);

      if(addMore != 'Y' || addMore != 'y') 
        break;
      
    }

    System.out.println(myDocs.toString());

    System.out.println("The compressed folder size is: " + myDocs.getCompressedSize());

    System.out.println("The number of word files is: " + myDocs.countWordFiles());

    myDocs.clear();

    int index = input.nextInt();

    System.out.println(myDocs.getFiles()[index].toString());

  }

}