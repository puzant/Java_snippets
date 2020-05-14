import java.util.*;
public class Account {

  private int id;
  private double balance;
  private double annualInterestRate;
  private Date dateCreated = new Date();

  public Account() {
    this.id = 0;  
    this.balance = 0;
    this.annualInterestRate = 0;
  }

  public Account(int id, double balance) {
    this.id = id;
    this.balance = balance;
  }


  //  getters for id & balance
  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getDate() {
    return this.dateCreated.toString();
  }

  //  setters for id & balance 
  public void setId(int newId) {
    this.id = newId;
  }

  public void setBalance(double newBalance) {
    this.balance = newBalance;
  }

  public double getMonthlyInterestRate() {
    //  return the monthly interst rate
    double monthInterest = 0;
    monthInterest = this.annualInterestRate / 12.0;
    return monthInterest;
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

}

