import java.util.Date;
public class File {

  protected String name;
  protected int size;
  protected Date dc;  // date of creation

  public File(String name, int size, Date dc) {
    this.name = name;
    this.size = size;
    this.dc = new Date();
  }

  public String getName() {
    return this.name;
  }

  public int getSize() {
    return this.size;
  }

  public Date getDc() {
    return this.dc;
  }

  public void setName(String _name) {
    this.name = _name;
  }

  public void setSize(int _size) {
    this.size = _size;
  }

  public void setDc(int _dc) {
    this.dc = _dc;
  }

  public String toString() {
    return "Name: " + this.getName() + ", Size:" + this.getSize() + ", create date: "+ this.getDc();
  }


}