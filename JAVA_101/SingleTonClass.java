public class SingleTonClass {
  
  public static SingleTonClass obj = null;

  /**private constructor will prevent the insinstantiation of this class directly */
  private SingleTonClass() {}

  public static SingleTonClass objectCreationMethod() {
    //  logic to create one object at a time
    if( obj == null ) {
      obj = new SingleTonClass();
    }
    return obj;

  }

  public void display() {
    System.out.println("Singelton class example");
  }

  public static void main(String args[]) {

    SingleTonClass obj1 = SingleTonClass.objectCreationMethod();
    obj1.display();
    
  }
  

}