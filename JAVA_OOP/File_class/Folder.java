public class Folder {

  private String name;
  private File[] files;
  private int nbFiles = 0;

  public Folder(String name) {
    files = new File[nbFiles];
  }

  public void addFile(File f) {
    files[this.nbFiles++] = f;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    String res = "Folder Name: " + this.name + ":\n";
      for(int i=0; i<this.nbFiles; i++) {
        res += "\t - " + this.files[i].toString() + "\n";
      }
      return res;
  }

  public int getCompressedSize() {
    int totalSize = 0;
    for(int i=0; i<this.nbFiles; i++) {
      if(this.files[i] instanceof WordFile) {
        totalSize += this.files[i].getSize() * 0.7;
      } else {
        totalSize += this.files[i].getSize() * 0.4;
      }
    }
    return totalSize;
  }

  public int searcFile(target: String) {
    int count = 0;
    for(int i=0; i<this.nbFiles; i++) {
      if(this.files[i] instanceof WordFile) {
        if((WordFile)files[i].getText().contains(target))
          count++;
      } else if(this.files[i] instanceof ExcelFile) {
        if((ExcelFile)files[i].getText().contains(target))
          count++;
      }
    }
    return count;
  }

  public int countWordFiles() {
    int count = 0;
    for(int i=0; i<this.nbFiles; i++) {
      if(this.files[i] instanceof WordFile) {
        count++;
      }
    }
    return count;
  }

  public viod clear() {
    File files = new File[files.length];
  }

}

