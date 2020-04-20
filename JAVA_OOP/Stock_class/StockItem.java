/**
 * @author: Puzant Bakjejian
 */
public class StockItem {

  String code;
  double price;
  int quantity;

  public StockItem(String code, double price, int quantity) {
    this.code = code;
    this.price = price;
    this.quantity = quantity;
  }

  //  setter method for each instance field
  public void setCode(String newCode) {
    this.code = newCode;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public void setQuantity(int newQuantity) {
    this.quantity = newQuantity;
  }

  //  getter methods for each instance field
  public String getCode() {
    return this.code;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }
  
}