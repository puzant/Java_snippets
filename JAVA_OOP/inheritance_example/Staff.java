public class Staff extends Employee {

  private String title;

  public Staff(String name, String phone_number, double salary, String title) {
    super(name, phone_number, salary);
    this.title = title;
  }

  public String getTitle() {
    return this.title;
  }

  public String toString() {
    return "Employee";
  }

}