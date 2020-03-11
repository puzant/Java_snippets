public class Father {
  
  protected String firstName = "James";
  protected String lastName = "Ford";

  public void greeting() {
    System.out.print("Hello There!");
  }
}

public class Son extends Father {

  private String firstName = " Fernando";
  private String lastName = " Ford";

  public static void main(String args[]) {
    
    Father father = new Father();

    father.greeting();
  }
}