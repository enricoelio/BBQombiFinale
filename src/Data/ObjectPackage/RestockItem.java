
package Data.ObjectPackage;


public class RestockItem {

  private String itemName;
  private int itemWarehouseSector;


  // Costruttore vuoto

  public RestockItem() {
  }


  // Costruttore della classe

  public RestockItem(String itemType, int itemWarehouseSector) {
    this.itemName = itemType;
    this.itemWarehouseSector = itemWarehouseSector;
  }


  // Metodi Get

  public String getItemName() {
    return this.itemName;
  }

  public int getItemWarehouseSector() {
    return this.itemWarehouseSector;
  }


  // Metodi Set
  
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void setItemWarehouseSector(int itemWarehouseSector) {
    this.itemWarehouseSector = itemWarehouseSector;
  }

}
