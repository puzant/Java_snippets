import java.util.Scanner;
public class Drvier {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int year;
    int month;
    int day;
    int sopIndicator;

    Zeller[] array = new Zeller[5];

    for(int i=0; i<array.length; i++; ) {

      System.out.print("Enter Valid year: (>0) - Valid month [1-12] & valid day [1-31=] for object " + sopIndicator + ":"  );

      year = input.nextInt();
      month = input.nextInt();
      day = input.nextInt();

      array[[i] = new Zeller(year, month, day);

      array[i].toString();

    }

    System.out.print("There Was " + this.getCountLeapYears + "years in the array");


  }
}
