package com.pricelist.proxy;

import static com.pricelist.PriceList.ITEM_ID_1;
import static com.pricelist.PriceListUser.ACCESSOR;
import static com.pricelist.PriceListUser.MUTATOR;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:30 PM
 */
public class PriceListProxyClient {

  public static void main(String... args) {

    // -------------------- Proxy design pattern ------------------------------
    System.out.println(" -------------------- Accessing Price List ------------------------------");

    PriceListProxyUser user1 = new PriceListProxyUser(ITEM_ID_1);
    PriceListProxyUser user2 = new PriceListProxyUser(ITEM_ID_1);

    Thread t1 = new Thread(user1);
    Thread t2 = new Thread(user2);
    Thread t3 = new Thread(user1);

    t1.setName(ACCESSOR);
    t2.setName(MUTATOR);
    t3.setName(ACCESSOR);

    t1.start();
    t2.start();
    t3.start();

  }
}
