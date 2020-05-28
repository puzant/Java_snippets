/**
 * @author Puzant Bakjejian
 */
public class Device {
  
  private String type;
  private double price;
  private int modelNb;
  private int quantity;

  public Device(String _type, double _price, int _modelNb, int _quantity) {
    this.type = _type;
    if(_price > 0) this.price = _price;
      else this.price = 0;
    this.modelNb = _modelNb;
    if(quantity > 0) this.quantity = _quantity;
      else this.quantity = 0;
  }

  //  Getters
  public String getType() {
    return this.type;
  }

  public double getPrice() {
    return this.price;
  }

  public int getModelNb() {
    return this.modelNb;
  }

  public int getQuantity() {
    return this.quantity;
  }

  
  //  Setters
  public void setType(String newType) {
    this.type = newType;
  }

  public void setPrice(double newPrice) {
    if(newPrice > 0) this.price = newPrice;
      else this.price = 0;
  }

  public void setModelNb(int newModelNb) {
    this.modelNb = newModelNb;
  }

  public void setQuantity(int newQuantity) {
    if(newQuantity > 0) this.quantity = newQuantity;
      else this.quantity = 0;
  }

  public String toString() {
    return "Type: " + this.getType() + " Price: " + this.getPrice() + " Model Number: " + this.getModelNb() + " Quantity: " + this.getQuantity();
  }


}