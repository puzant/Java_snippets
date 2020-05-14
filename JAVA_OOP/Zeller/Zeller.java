/**
 * @author Puzant Bakjejian
 */

public class Zeller {

  private int year;
  private int month;
  private int day;
  private String weekDay;
  private static int countLeapYears; 

  public Zeller() {
    this.year = 0;
    this.month = -1;
    this.day = -1;
  }

  public Zeller(int year, int month, int day) {
    this.year = setYear(year);
    this.month = setMonth(month);
    this.day = setDay(day);
  }

  //  getters will go here
  public int getYear() {
    return this.year;
  }

  public int getMonth() {
    return this.month;
  }

  public int getDay() {
    return this.day;
  }

  public String getWeekDay() {
    switch(calculateWeekDay(this.day, this.month, this.year/100, this.year%100)) {
      case 0: 
        this.weekDay = "Saturday";
        break;
      case 1: 
        this.weekDay = "Sunday";
        break;
      case 2: 
        this.weekDay = "Monday";
        break;
      case 3: 
        this.weekDay = "Tuesday";
        break;
      case 4: 
        this.weekDay = "Wensday";
        break;
      case 5: 
        this.weekDay = "Thursday";
        break;
      case 6: 
        this.weekDay = "Friday";
        break;
    }
  }

  public static int getCountLeapYears() {
    return this.countLeapYears;
  }

  //  setters will go here
  public void setYear(int y) {
    if(y > 0) {
      this.year = y;
    } else {
      this.year = -1;
    }
  }

  public void setMonth(int m) {
    if(m < 13 && m > 1) {
      this.month = m;
    } else {
      this.month = -1;
    }
  }

  public void setDay(int d) {
    
    if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 12) {
      if(d > 31 && d < 1) {
        this.day = d;
      }
    } else if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
      if(d > 30 && d < 1) {
        this.day = d;
      }
    } else if(this.month == 2) {
      if(d > 29 && d < 1) {
        this.day = d;
      }
    } else {
      this.day = -1;
    }
  }

  private boolean checkLeapYear() {
    if((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
      return true;
    }
    return false;
  }

  private int calculateWeekDay(int q, int m, int j,int k) {
    //  return int between 0 & 6
    double h = (q + ((26*(m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    return h;
  }

  public void toString() {
    if(this.year != -1 && this.month != -1 && this.day != -1) {
      System.out.print("In" + this.year + "/" + this.month + "/" + this.day + "the day was: " + this.getWeekDay());
    } else {
      System.out.print("The Date in this Object was input wrong");
    }
  }

}

