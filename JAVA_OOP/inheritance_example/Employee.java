public class Employee extends Persons {

  private double salary;

  public Employee(String name, String phone_number, double salary) {
    super(name, phone_number);
    this.salary = salary;
  }

  public double  getSalary() {
    return this.salary;
  }



}