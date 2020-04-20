import java.util.Random;
public class Driver {

  public static void main(String[] args) {

    StockItem[] array = new StockItem[10];

    String code;
    double price;
    int quantity;
    int totalQuantity = 0;

    Random r = new Random();

    //  fill the array with randomly created values 

    for(int i=0; i<array.length; i++) {

      //  generate random price
      price = 100*r.nextDouble()+3;

      //  generate random quantity
      quantity = r.nextInt(1000 - 100) + 100;

      code = codeToString(i);
      //  create new object at evvery loop iteration
      array[i] = new StockItem(code, price, quantity);
    }

    //  find the total quantity
    for(int i=0; i<array.length; i++) {
      totalQuantity += array[i].getQuantity();
    }

    System.out.println("total quantity= " + totalQuantity);
    biggestStock(array);

  }

  public static String codeToString(int num) {
    return "item_" + num;
  }

  public static void biggestStock(StockItem[] array) {
    
    double maxPrice = array[0].getPrice();
    String highestValueCode = " ";
    
    for(int i=0; i<array.length; i++) {
      if(array[i].getPrice() > maxPrice) {
        maxPrice = array[i].getPrice();
        highestValueCode = array[i].getCode();

      }
    }
    
    System.out.println("Stock item with max price ($" + maxPrice + ") is: " + highestValueCode);

  }

}