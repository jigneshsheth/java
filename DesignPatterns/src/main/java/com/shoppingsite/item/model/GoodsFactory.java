package com.shoppingsite.item.model;

import com.shoppingsite.item.factory.ItemFactory;

/**
 * @author : jignesh.sheth Date: 11/28/12 Time: 1:34 PM
 *         <p/>
 *         GoodsFactory responsible for creating item objects like CD,Book and Cosmetics etc..
 */
public class GoodsFactory extends ItemFactory {

  /**
   * protected so that only ItemFactorySelector within this package can instantiate it to provide a
   * single point of access. (i.e singleton)
   */
  protected GoodsFactory() {}

  /**
   * Factory method, which decides to create an Items.
   * <p/>
   * Benefits are: -- loosely-couples the client. (i.e. ShoppingBasketBuilder class) from items such
   * as CD, Book and Cosmetics etc.
   * <p/>
   * In Future if we need to create a Book item, which is imported. we can easily incorporate this
   * by adding a new ItemType.BOOK_IMPORTED and subsequently adding following piece of code as
   * shown: case CD_IMPORTED: final CD importedCD = new CD(price, description, quantity);
   * importedCD.setImported(true); return importedCD;
   * <p/>
   * - It is also possible to create an Object cache or Object pool of our items instead of creating
   * a new instance every time  without making any changes to the calling class.
   * <p/>
   * - Java does not support overloaded constructor which take same parameter list. Instead use
   * several factory methods. ex. getImportedItem(ItemType itemType,String desc,int qty, double
   * price). getTaxedItem(ItemType itemType...);
   *
   * @param itemType
   * @param description
   * @param quantity
   * @param price
   * @return Item object
   * @throws ItemException
   */

  @Override
  public Item getItem(final ItemType itemType, final String description, final int quantity,
                      final double price) throws ItemException {
    switch (itemType) {
      case BOOK:
        return new Book(price, description, quantity);
      case CD:
        return new CD(price, description, quantity);
      case CD_IMPORTED:
        final CD importedCD = new CD(price, description, quantity);
        importedCD.setImported(true);
        return importedCD;
      case COSMETIC:
        return new Cosmetics(price, description, quantity);
      default:
        throw new ItemException(" Unknown Item Type:: " + itemType);
    }
  }
}
