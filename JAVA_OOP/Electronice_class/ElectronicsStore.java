/**
 * @author Puzant Bakjejian
 */
public class ElectronicsStore {
  
  private String name;
  private int limit;
  private Device[] devices = new Device[this.limit];
  private int nbAddedDevices;

  public ElectronicsStore(String name, int maxNbDevices) {
    this.name = name;
    this.nbAddedDevices++;
    this.limit = maxNbDevices;
  }

  //  Getters
  public String getName() {
    return this.name;
  }

  public Device[] getDevices() {
    return this.devices;
  }

  //  Setters
  public void setName(String newName) {
    this.name = newName;
  }

  public void addDevice(Device d) {
    //  adds a device to the store only if the maximum number of devices is not reached yet.
    if(this.nbAddedDevices != this.limit) {
      devices[this.nbAddedDevices-1] = d;
    }
  }

  public void showDevices(String type) {
    for(int i=0; i<this.limit; i++) {
      if(this.devices[i].getType() == type) {
        System.out.println(devices[i].getType());
      }
    }
  }

  public double buyDevice(int modelNb) {
    for(int i=0; i<this.limit; i++) {

      if(this.devices[i].getModelNb() == modelNb && this.devices[i].getQuantity() > 0) {
        this.devices[i].setQuantity(this.devices[i].getQuantity() - 1);
        return this.devices[i].getQuantity();
      } else {
        return -1;
      }

    }
    return 0.0;
  }

  public void applyDsicount(int modelNb, double percentage) {
    for(int i=0; i<this.devices.length; i++) {
      if(this.devices[i].getModelNb() == modelNb) {
        this.devices[i].setPrice((this.devices[i].getPrice() * percentage)/100);
      }
    }
  }

  public String toString() {
    String str = "Name of the Store:" + this.getName() + "\n";
    for(int i=0; i<this.devices.length; i++) {
      str = this.devices[i].getType() + "\n";
      str = this.devices[i].getPrice() + "\n";
      str = this.devices[i].getModelNb() + "\n";
      str = this.devices[i].getQuantity() + "\n";
    }
    return str;
  }



}