public class ExcelFile extends File {

  private int sheets;
  private String description;

  public ExcelFile(String name, int size, int sheets, String description) {
    super(name, size);
    this.sheets = sheets;
    this.description = description;
  }

  public int compareTo(Object o) {
    if(o instanceof ExcelFile) {
      if(this.sheets == o.sheets) {
        return 0;
      } else {
        return 1;
      }
    } else {
      return -1;
    }
  }

}