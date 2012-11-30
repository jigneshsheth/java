package com.shoppingsite.item.model;

import com.shoppingsite.item.visitor.ItemVisitor;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 11:35 AM
 */
public interface Item {

  double getExtendedTax();

  double getExtendedTaxPrice() throws ItemException;

  void setImported(boolean isImported);

  String getDescription();

//  Visitor patterns:
  void accept(ItemVisitor visitor);

}
