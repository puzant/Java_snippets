public class Student extends Persons{

  private String status;

  public Student(String name, String phone_number, String status) {
    super(name, phone_number);
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }

  public String toString() {
    return "Student";
  }

}