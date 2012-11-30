package com.shoppingsite.item.composition;

import com.shoppingsite.item.model.ItemException;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 4:41 PM
 */
public interface GoodsHelper {

  boolean isTaxed();

  boolean isImported();

  double getExtendedTax();

  double getExtendedTaxPrice() throws ItemException;

  void setImported(boolean isImported);

  String getDescription();


}
