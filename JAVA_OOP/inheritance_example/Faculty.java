public class Faculty extends Employee {
  
  private boolean advisor;
  private String rank;

  public Faculty(String name, String phone_number, double salary, boolean advisor, String rank) {
    super(name, phone_number, salary);
    this.advisor = advisor;
    this.rank = rank;
  }

  public boolean isAdvisor() {
    return this.advisor ? true : false;
  }

  public String getRank() {
    return this.rank;
  }

  public String toString() {
    return "Faculty";
  }
}