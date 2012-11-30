package com.shoppingsite.item.factory;

import com.shoppingsite.item.model.Item;
import com.shoppingsite.item.model.ItemException;
import com.shoppingsite.item.model.ItemType;

/**
 * @author : jignesh.sheth Date: 11/28/12 Time: 1:32 PM
 *         <p/>
 *         Responsible to create Item Object like CD,Cosmetic,Book etc..
 */
public abstract class ItemFactory {

  public abstract Item getItem(ItemType itemType, String description, int quantity, double price)
      throws ItemException;

}
