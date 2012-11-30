package com.shoppingsite.item.model;

import com.shoppingsite.item.visitor.ItemVisitor;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 1:30 PM
 */
public class Cosmetics extends Goods {
  private boolean isImported = true;

  protected Cosmetics(final double price, final String description, final int quantity) {
    super(price, description, quantity);
  }

  @Override protected boolean isTaxed() {
    return true;
  }

  @Override protected boolean isImported() {
    return !isImported;
  }

  public void setImported(final boolean imported) {
    isImported = imported;
  }

  @Override public void accept(final ItemVisitor visitor) {
    visitor.visit(this);
  }
}
