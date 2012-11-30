package com.shoppingsite.item.model;

import com.shoppingsite.item.visitor.ItemVisitor;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 1:30 PM
 */
public class Book extends Goods {

  protected Book(final double price, final String description, final int quantity) {
    super(price, description, quantity);
  }

  @Override protected boolean isTaxed() {
    return false;
  }

  @Override protected boolean isImported() {
    return false;
  }

  @Override public void accept(final ItemVisitor visitor) {
      visitor.visit(this);
  }
}
