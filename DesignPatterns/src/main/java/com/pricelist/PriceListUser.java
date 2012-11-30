package com.pricelist;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 4:47 PM
 */
public class PriceListUser implements Runnable {

  public static final String ACCESSOR = "accessor";
  public static final String MUTATOR = "mutator";
  int itemId;
  double price;

  public PriceListUser(int itemId) {
    this.itemId = itemId;
  }

  /**
   * runnable code where multi-threaded are executed.
   */
  @Override public void run() {
    String name = Thread.currentThread().getName();
    if (name.equals(ACCESSOR)) {
      price = PriceListImpl.getInstance().getPrice(itemId);
    } else if (name.equals(MUTATOR)) {
      PriceListImpl.getInstance().setPrice(itemId, 15.00);
    }
  }
}
