public class WordFile extends File {

  private int words, pages;
  private String text;

  public WordFile(String name, int size, Date dc ,int words, int pages, String text) {
    super(name, size, dc);
    this.words = words;
    this.pages = pages;
    this.text = text;
  }

  public int getWords() {
    return this.words;
  }

  public void setWords(int _words) {
    this.words = _words;
  }

  public int getPages() {
    return this.pages;
  }

  public void setPages(int _pages) {
    this.pages = _pages;
  }

  public String getText() {
    return this.text;
  }

  public void setText(String _text) {
    this.text = _text;
  }

  @Override
  public String toString() {
    return super.toString() + ", Words: " + this.words + ", Pages:" + this.pages + ", Text:" + this.text;
  }

}