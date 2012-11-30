package com.shoppingsite.item.model;

import com.shoppingsite.item.builder.ItemBuilder;
import com.shoppingsite.item.builder.ShoppingBasketBuilder;
import com.shoppingsite.item.strategy.CheckStrategy;
import com.shoppingsite.item.strategy.CountDecorator;
import com.shoppingsite.item.strategy.LongerThan15;
import com.shoppingsite.item.strategy.StartsWithCD;
import com.shoppingsite.item.visitor.GoodsLabellingVisitor;
import com.shoppingsite.item.visitor.ItemVisitor;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 2:16 PM
 */
public class Shopping {

  public static void main(String... args) throws ItemException {
    process();
  }

  /**
   * @throws ItemException
   */
  private static void process() throws ItemException {

    String patternName=" Singleton,Factory, Builder ";
    printPatternsTitles(patternName);
    // ----------------------------------------------------------------------------------
    //                      creational patterns: singleton , factory , builder.
    // ----------------------------------------------------------------------------------
    System.out.println(" ------ Creating a Shopping basket with items -------");

    ItemBuilder builder = new ShoppingBasketBuilder();

    builder.buildBasket(ItemType.BOOK, " Book -IT", 1, 12.00);
    builder.buildBasket(ItemType.CD, " CD -JAZZ", 1, 15.00);

    builder.buildBasket(ItemType.COSMETIC, " Cosmetics -Lipstick", 1, 1.00);

    double totalTax = builder.calculateTotalTax();
    builder.printExtendedTaxPrice();
    System.out.println(" Sales Taxes ::" + totalTax);
    System.out.println(" Grand Total : " + builder.calculateTotal());
    System.out.println(" -------- After adding an imported CD to the basket ------");


    builder.buildBasket(ItemType.CD_IMPORTED, " CD -PAINT", 1, 15.00);

    totalTax = builder.calculateTotalTax();
    builder.printExtendedTaxPrice();
    System.out.println(" Sales Taxes ::" + totalTax);
    System.out.println(" Grand Total : " + builder.calculateTotal());
    System.out.println(" -------- After adding an imported CD to the basket ------");


    // ----------------------------------------------------------------------------------
    //           Strategy ,Decorate and Adapter patterns.
    // ----------------------------------------------------------------------------------
    patternName=" Strategy ,Decorate and Adapter ";
    printPatternsTitles(patternName);

    CheckStrategy strategy = new StartsWithCD();
    strategy = new CountDecorator(strategy);

    for (Item item : builder.getItemList()) {
      System.out.println(" \n" + item.getDescription() + " --- >" + strategy.check(
          item.getDescription()));
    }

    System.out.println(" No of descriptions starts with CD --> " + strategy.getCount());

    strategy = new LongerThan15();
    strategy = new CountDecorator(strategy);

    for (Item item : builder.getItemList()) {
      System.out.println(" \n" + item.getDescription() + " --- >" + strategy.check(
          item.getDescription()));
    }

    System.out.println(" No of descriptions longer than 15 characters --> " + strategy.getCount());


    // ----------------------------------------------------------------------------------
    //                 visitor patterns: no messy instanceof and typecast constructs.
    // ----------------------------------------------------------------------------------

    patternName=" Visitor patterns: no messy instanceof and typecast constructs ";
    printPatternsTitles(patternName);
    System.out.println(" --- markXXXX(): avoid huge if else statements, instanceof & type casts");

    ItemVisitor visitor= new GoodsLabellingVisitor();
    for (Item item : builder.getItemList()) {
      item.accept(visitor);
    }



    // ----------------------------------------------------------------------------------

    // ----------------------------------------------------------------------------------


  }

  private static void printPatternsTitles(final String name) {
    System.out.println("\n\n=====================================================================");
    System.out.println("====== "+ name +" ====== ");
    System.out.println("=====================================================================\n\n");
  }


}
