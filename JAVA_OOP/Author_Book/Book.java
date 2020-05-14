public class Book {

  public String title;
  public Author writer;

  public Book(String title, Author writer) {
    this.title = title;
    this.writer = new Author()
  }

  public String title() {
    return this.title;
  }

  public Author getWriter() {
    return this.writer;
  }

  public void setTitle(String nTitle) {
    this.title = nTitle;
  }

  public void setWriter() {

  }

  public String toString() {
    
  }


}