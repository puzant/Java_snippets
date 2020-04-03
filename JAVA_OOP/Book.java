/**
 * Name: Puzant Setrak Bakjejian
 * ID: 11910298
 */
public class Book {

  String title;
  String author;
  int numCopies;

  public Book(String newTitle, String newAuthor, int newNumCopies) {
    title = newTitle;
    author = newAuthor;
    numCopies = newNumCopies;
  }

  public void borrow(int n) {
    //  if there book copes decrement from n
    if(numCopies > 0) {
      numCopies -= n;
    } else {
      System.out.print("error there are no copies at the moment!");
    }
  }

  public static void main(String args[]) {

    Book b1 = Book("Introduction to java programming", "Daniel Liang", 10);

    b1.borrow(1);
    getRandom();
    b1.borrow(1);

  }

  public static int getRandom() {
    //  generate a random integer between 1 & 20
    return (int) (Math.random()*20);
  }

}