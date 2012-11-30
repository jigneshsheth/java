package com.shoppingsite.item.builder;

import com.shoppingsite.item.model.Item;
import com.shoppingsite.item.model.ItemException;
import com.shoppingsite.item.model.ItemFactorySelector;
import com.shoppingsite.item.model.ItemType;
import com.shoppingsite.item.factory.ItemFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : jignesh.sheth Date: 11/28/12 Time: 4:21 PM
 *         <p/>
 *         Builder pattern: To specify complex object creation by defining a class whose purpose is
 *         to build instance of another class. Difference between builder pattern and factory :
 *         Builder: User is given the choice to create the type of object he/she wants but the
 *         constuction process is same. Factory: Factory decide how to create one of several
 *         possible classes based on data provided to it.
 */
public class ShoppingBasketBuilder implements ItemBuilder {

  private List<Item> itemList = new ArrayList<Item>();

  private void addItem(Item item) {
    itemList.add(item);
  }

  /**
   * Building shopping basket.
   *
   * @param itemType
   * @param description
   * @param qty
   * @param unit_price
   * @throws ItemException
   */
  @Override
  public void buildBasket(final ItemType itemType, final String description, final int qty,
                          final double unit_price) throws ItemException {


    //get the single instance of GoodsFactory using the singleton pattern.
    //get same instance every time.
    ItemFactory itemFactory = ItemFactorySelector.getItemFactory();

    //Used factory method to create item object, based on ItemType supplied to it.
    Item item = itemFactory.getItem(itemType, description, qty, unit_price);
    this.addItem(item);


  }

  /**
   * calculate total tax on the items in the build basket.
   *
   * @return
   * @throws ItemException
   */

  @Override public double calculateTotalTax() throws ItemException {
    if (itemList.isEmpty()) {
      throw new ItemException(" No items in the basket.");
    }
    double totalTax = 0.0;
    for (Item item : itemList) {
      totalTax += item.getExtendedTax();
    }
    return totalTax;
  }

  /**
   * calculated total price on the items in the built basket.
   *
   * @return
   * @throws ItemException
   */
  @Override public double calculateTotal() throws ItemException {
    if (itemList.isEmpty()) {
      throw new ItemException(" No items in the basket.");
    }
    double total = 0.0;
    for (Item item : itemList) {
      total += item.getExtendedTaxPrice();
    }
    return total;
  }

  @Override public void printExtendedTaxPrice() throws ItemException {
    if (itemList.isEmpty()) {
      throw new ItemException(" No items in the basket.");
    }
    for (Item item : itemList) {
      System.out.println(item + " :: " + item.getExtendedTaxPrice());
    }

  }

  @Override public Iterator getIterator() {
    return itemList.iterator();
  }

  /**
   *
   * @return
   */
  public List<Item> getItemList() {
    return itemList;
  }
}
