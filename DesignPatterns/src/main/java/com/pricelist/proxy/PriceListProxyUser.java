package com.pricelist.proxy;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:29 PM
 */
public class PriceListProxyUser implements Runnable {
  public static final String ACCESSOR = "accessor";
  public static final String MUTATOR = "mutator";
  int itemId;
  double price;

  public PriceListProxyUser(int itemId) {
    this.itemId = itemId;
  }

  /**
   * runnable code where multi-threaded are executed.
   */
  @Override public void run() {
    String name = Thread.currentThread().getName();
    if (name.equals(ACCESSOR)) {
      price = PriceListProxy.getInstance().getPrice(itemId);
    } else if (name.equals(MUTATOR)) {
      PriceListProxy.getInstance().setPrice(itemId, 15.00);
    }
  }
}
