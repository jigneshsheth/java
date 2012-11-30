package com.shoppingsite.item.model;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 1:29 PM
 */
public class Tax {

  public static final double SALES_TAX = 0.10;
  public static final double IMPORTED_TAX = 0.05;
  private double salesTax = 0.0;
  private double importTax = 0.0;

  public void calculate(final boolean isTaxable, final boolean isImported, final double price) {
    if (isTaxable) {
      salesTax = price * SALES_TAX;
    }
    if (isImported) {
      importTax = price * IMPORTED_TAX;
    }
  }

  public double getTotalUnitTax() {
    return this.salesTax + this.importTax;
  }
}
