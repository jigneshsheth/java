package com.pricelist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 4:36 PM
 */
//Creating single instance of PriceListImpl object.
public class PriceListImpl implements PriceList {

  public static final Map mapPrices = new HashMap(30, .075f);
  public static PriceList singleInstance = new PriceListImpl(); //Only one instance

  static {
    mapPrices.put(ITEM_ID_1, TWELVE_DOLLAR);
  }

  public static PriceList getInstance() {
    return singleInstance;
  }

  @Override public double getPrice(final int itemId) {
    double price = ((Double) mapPrices.get(new Integer(itemId))).doubleValue();
    System.out.println(" The price of the itemId " + itemId + " = " + price);
    return price;
  }

  @Override public void setPrice(final int itemId, final double newPrice) {

    System.out.println(" Wait while mutating price from 12.0 to 15.00...........");
    try {
      mapPrices.put(new Integer(itemId), new Double(-1));
      Thread.sleep(1000);
      mapPrices.put(new Integer(itemId), new Double(newPrice));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
