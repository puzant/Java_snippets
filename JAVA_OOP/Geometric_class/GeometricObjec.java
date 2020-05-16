public class GeometricObjec {

  private String color;
  private int opacity;

  public GeometricObjec(String color, int opacity) {
    this.color = color;
    this.opacity = opacity;
  }

  public String getColor() {
    return this.color;
  }

  public int getOpacity() {
    return this.opacity;
  }

  public void setColor(String newColor) {
    this.color = newColor;
  }

  public void setOpacity(int newOpacity) {
    this.opacity = newOpacity;
  }

  public String toString() {
    return "Color= : " + this.color + ", " + "Opacity= : " + this.opacity;
  }


}