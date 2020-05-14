import java.util.Scanner;
public class TestDriver {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    int id;
    int choice;
    boolean exit=false;
    double withdrawAmount=0;
    double depositAmount=0;
    

    Account array[] = new Account[10];

    for(int i=0; i<array.length; i++) {
      //  create 10 accounts
      array[i] = new Account(i, 100);
    }

    System.out.println("Enter an ID:");
    id = input.nextInt();

    for(int i=0; i<array.length; i++) {
      if(!correctAccount(id, array)) {
        System.out.println("Enter an ID:");
        id = input.nextInt();
      } else if(array[i].getId() == id) {
        while(array[i].getId() == id) {

          System.out.println("Main menu");
          System.out.println("1-check balance");
          System.out.println("2-withdraw");
          System.out.println("3-deposit");
          System.out.println("4-exit");

          choice = input.nextInt();
          
          switch (choice) {
            case 1:
              System.out.println("Your balance is: " + array[i].getBalance());
              break;
            case 2:
              System.out.println("Enter an amount to withdraw: ");
              withdrawAmount = input.nextDouble();
              array[i].withdraw(withdrawAmount);
              break;
            case 3:
              System.out.println("Enter an amount to deposit: ");
              depositAmount = input.nextDouble();
              array[i].deposit(depositAmount);
              break;
            case 4:
            exit = true;
              break;
          }
          
          if(exit) 
            break;

        }
      }
    }
  

  }

  public static boolean correctAccount(int id, Account[] array) {

    for(int i=0; i<array.length; i++) {
      if(array[i].getId() == id) {
        return true;
      }
    }

    return false;

  } 

}