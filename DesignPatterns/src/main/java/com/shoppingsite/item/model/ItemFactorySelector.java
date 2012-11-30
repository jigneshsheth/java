package com.shoppingsite.item.model;

import com.shoppingsite.item.factory.ItemFactory;

/**
 * @author : jignesh.sheth Date: 11/28/12 Time: 2:47 PM
 *         <p/>
 *         Factory class which creates a singleton ItemFactory dynamically based on facotry name
 *         supplied. Benefits of singleton: --  single instance of the ItemFactory --  single point
 *         of access ( gloabl acces within the JVM and the class loader.)
 */
public class ItemFactorySelector {

  public static final String FACTORY_NAME = "com.shoppingsite.item.model.GoodsFactory";
  protected static ItemFactory factorySingleInstance = null;


  /**
   *
   * @return
   */
  public static ItemFactory getItemFactory() {

    try {
      Class<?> klassFactory = Class.forName(FACTORY_NAME);
      factorySingleInstance=(ItemFactory)klassFactory.newInstance();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
    return factorySingleInstance;
  }


}
