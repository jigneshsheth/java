package com.pricelist;

import static com.pricelist.PriceList.ITEM_ID_1;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 4:55 PM
 */
public class PriceListClient {

  public static void main(String... args) {

    // -------------------- Proxy design pattern ------------------------------
    System.out.println(" -------------------- Accessing Price List ------------------------------");

    PriceListUser user1 = new PriceListUser(ITEM_ID_1);
    PriceListUser user2 = new PriceListUser(ITEM_ID_1);

    Thread t1 = new Thread(user1);
    Thread t2 = new Thread(user2);
    Thread t3 = new Thread(user1);

    t1.setName(PriceListUser.ACCESSOR);
    t2.setName(PriceListUser.MUTATOR);
    t3.setName(PriceListUser.ACCESSOR);

    t1.start();
    t2.start();
    t3.start();

  }

}
