package com.pricelist.proxy;

import com.pricelist.PriceList;
import com.pricelist.PriceListImpl;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:21 PM
 *         <p/>
 *         synchronized proxy class for PriceList
 */
public class PriceListProxy implements PriceList {

  //  assume that we only have two items in the price-list.
  Integer[] locks = {new Integer(1), new Integer(2)}; //locks for each item in the price list.

  private static PriceList singleInstance = new PriceListProxy();//single instance of PriceListProxy

  PriceList realPriceList = PriceListImpl.getInstance(); //real object.

  public static PriceList getInstance() {
    return singleInstance;
  }

  @Override public double getPrice(final int itemId) {
    synchronized (locks[itemId]) {
      return realPriceList.getPrice(itemId);
    }
  }

  @Override public void setPrice(final int itemId, final double newPrice) {
    synchronized (locks[itemId]) {
      realPriceList.setPrice(itemId, newPrice);
    }
  }
}
