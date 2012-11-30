package com.shoppingsite.item.model;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 11:39 AM
 */
public abstract class Goods implements Item {

  private double price;

  private int quantity;

  private Tax tax = new Tax();

  private String description;

  protected Goods(final double price, final String description, final int quantity) {
    this.price = price;
    this.description = description;
    this.quantity = quantity;
  }

  protected abstract boolean isTaxed();

  protected abstract boolean isImported();

  @Override public double getExtendedTax() {
    tax.calculate(isTaxed(), isImported(), price);
    return this.tax.getTotalUnitTax() * quantity;
  }

  @Override public double getExtendedTaxPrice() throws ItemException {
    if (tax == null) {
      throw new ItemException(" Tax should be calculated first :: ");
    }
    return quantity * (this.tax.getTotalUnitTax() + price);
  }

  @Override public void setImported(final boolean isImported) {
  }

  @Override public String getDescription() {
    return description;
  }


  @Override public String toString() {
    return quantity + "" + description + ":";
  }
}
