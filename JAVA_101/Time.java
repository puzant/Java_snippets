import java.util.Scanner;
public class Time {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String time;

    String hour;
    String minutes;
    String seconds;


    System.out.println("Enter a time string: ");
    time = input.nextLine();

    int length = time.length();
    
    String[] t = time.split(":");

    hour = t[0];
    minutes = t[1];
    seconds = t[2];

    int convertedHour = Integer.parseInt(hour);
    int convertedMinute = Integer.parseInt(minutes);
    int convertedSeconds = Integer.parseInt(seconds);
    
    if(length == 8 && (convertedHour > 0 && convertedHour < 23) && (convertedMinute > 0 && convertedMinute < 59) && (convertedSeconds > 0 && convertedSeconds < 59)) {
      System.out.println("the string is valid");
    } else {
      System.out.println("the string is invalid");
    }

  }

}