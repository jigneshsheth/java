package com.pricelist;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 4:33 PM
 */
public interface PriceList {

  public static final Integer ITEM_ID_1 = new Integer(1);
  public static final Double TWELVE_DOLLAR = new Double(12.00);

  double getPrice(int itemId);
  void setPrice(int itemId, double newPrice);
}
