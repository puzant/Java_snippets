/**
 * @author Puzant Bakjejian
 */
import java.util.Scanner;
public class Driver {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    ElectronicsStore e = new ElectronicsStore("Lebanon Tech", 3);

    System.out.println("Enter information for the first device: ");
    Device d1 = new Device(input.next(),input.nextDouble(), input.nextInt(), input.nextInt());

    System.out.println("Enter information for the second device: ");
    Device d2 = new Device(input.next(),input.nextDouble(), input.nextInt(), input.nextInt());

    System.out.println("Enter information for the third device: ");
    Device d3 = new Device(input.next(),input.nextDouble(), input.nextInt(), input.nextInt());

    //  to close leak scanner resource
    input.close();

    e.addDevice(d1);
    e.addDevice(d2);
    e.addDevice(d3);

    e.showDevices("Laptop");

    e.toString();

  }
}