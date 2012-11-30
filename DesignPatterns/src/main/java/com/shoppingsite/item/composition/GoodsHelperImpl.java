package com.shoppingsite.item.composition;

import com.shoppingsite.item.model.ItemException;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 4:43 PM
 */
public class GoodsHelperImpl implements GoodsHelper {
  public boolean isTaxed() {
    return false;
  }

  @Override public boolean isImported() {
    return false;
  }

  @Override public double getExtendedTax() {
    return 0;
  }

  @Override public double getExtendedTaxPrice() throws ItemException {
    return 0;
  }

  @Override public void setImported(final boolean isImported) {

  }

  @Override public String getDescription() {
    return null;
  }
}
