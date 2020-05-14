public class Bill {

  String code;
  String customerName;
  double feesValue;

  public Bill(String code, String customerName, double feesValue) {
    this.code = code;
    this.customerName = customerName;
    this.feesValue = feesValue;
  }

  //  Getters for the data members
  public String getCode() {
    return this.code;
  }

  public String getCutomerName() {
    return this.customerName;
  }

  public double getFeesValue() {
    return this.feesValue;
  }

  //  Setters for the data members
  public void setCode(String newCode) {
    this.code = newCode;
  }

  public void setCustomerName(String newCustomerName) {
    this.customerName = newCustomerName;
  }

  public void setFeesValue(double newFeesValue) {
    this.feesValue = newFeesValue;
  }

  public double computeFinalFees() {

    if(this.feesValue >= 300) {
      //  deduct 5%
      this.feesValue *= .95;
    } else if(this.feesValue >= 200) {
      //  deduct 2%
      this.feesValue *= .98;
    } else {
      //  no deduction to be added 
    }

    //  add 11% tax
    return this.feesValue += .89;


  }

  public String toString() {
    return "The Bill Code# -" + this.code + " ," + "for the Customer " + this.customerName + " has the final fees " + computeFinalFees();
  }


}