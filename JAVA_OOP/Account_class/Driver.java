import java.util.Scanner;
public class Driver {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Account a1 = new Account(1122, 20000, 4.5);

    a1.widthdraw(2500);
    a1.deposit(3000);

    System.out.println("The balance of your account is:" + a1.getBalance());

    System.out.println("The montly ineterst is: " + a1.getMonthlyInterestRate());

    System.out.println("The date that your account was created was: " + a1.getDate());

  }
}