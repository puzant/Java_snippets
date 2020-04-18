/**
 * @author Puzant Bakjejian
 */
public class Vehicle {
  
  String brand;
  int year;
  double price;

  public Vehicle(){}

  public Vehicle(String brand, int year, double price) {
    this.brand = brand;
    this.year = year;
    this.price = price;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String newBrand) {
    this.brand = newBrand;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int newYear) {
    this.year = newYear;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

  public String toString() {
    return this.brand + " " + this.year + " " + "($" + this.year + ")";
  }

}
