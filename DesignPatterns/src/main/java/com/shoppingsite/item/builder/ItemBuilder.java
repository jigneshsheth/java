package com.shoppingsite.item.builder;

import com.shoppingsite.item.model.Item;
import com.shoppingsite.item.model.ItemException;
import com.shoppingsite.item.model.ItemType;

import java.util.Iterator;
import java.util.List;

/**
 * @author : jignesh.sheth Date: 11/28/12 Time: 4:17 PM
 */
public interface ItemBuilder {

  void buildBasket(ItemType itemType, String description, int qty, double unit_price)
      throws ItemException;

  double calculateTotalTax() throws ItemException;

  double calculateTotal() throws ItemException;

  void printExtendedTaxPrice() throws ItemException;

  Iterator getIterator();
  public List<Item> getItemList();

}
