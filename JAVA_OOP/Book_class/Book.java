/**
 * @author Puzant Bakjejian
 */
import java.util.*;
public class Book {
  
  private String name;
  private String publisher;
  private String authors;
  private int counter;

  public Book(String name, String publisher, String authors) {
    this.name = name;
    this.publisher = publisher;
    this.authors = authors;
    counter++;
  }

  public String getName() {
    return this.name;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public String getAuthors(int i) {
    //  use split method here
    String[] authorArray = this.authors.split("-");
     return authorArray[0];
  }

  public int getCounter() {
    return this.counter;
  }

  public void setName(String nName) {
    this.name = nName;
  }

  public void setPublisher(String nPublisher) {
    this.publisher = nPublisher;
  }

  public void setAuthors(String nAuthors) {
    this.authors = authors;
  }

  public String toString() {
    return "Name: " + this.name + "." + "/n" +  this.publisher + "/n" + this.authors;
  }

}
