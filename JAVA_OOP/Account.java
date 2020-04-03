import java.util.*;
public class Account {
  
  private int id;
  private double balance;
  private double annualInterestRate;
  Date dateCreated = new Date();

  public Account() {
    id = 0;
    balance = 0;
    annualInterestRate = 0;
  }

  public Account(int id, double balance, double annualInterestRate) {
    id = id;
    balance = balance;
    annualInterestRate = annualInterestRate;
  }

  //  getter for ID
  public int getId() {
    return id;
  }

  //  getter for balance
  public double getBalance() {
    return balance;
  }

  //  getter for annualInterestRate
  public double getAnnualInterestRate() {
    return annualInterestRate;
  }

  //  getter for annualInterestRate
  public Date getDate() {
    return dateCreated;
  }

  public double getMonthlyInterestRate() {
    return annualInterestRate / 12;
  }

  public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
  }

  public double withdraw(int amount) {
    balance -= amount;
    return balance;
  } 

  public double deposit(int amount) {
    balance += amount;
    return balance;
  } 


  //  setter for ID
  public void setID(int ID) {
    id = ID;
  }

  //  setter for balance
  public void setBalance(double b) {
    balance = b;
  }

  //  setter for annualInterestRate
  public void setAnnualIneterstRate(double annualIR) {
    annualInterestRate = annualIR;
  }


  public static void main(String args[]) {
    
    Account a1 = new Account(1122, 20.000, 4.5);
    
    a.withdraw(2500);
    a.deposit(3000);

    System.out.print("The balance is: " + a.balance);
    System.out.print("The monthly interest is: " + a.getMonthlyInterest());
    System.out.print("The date when this account was created is: " + a.dateCreated.toString());

  }

}
