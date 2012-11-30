package com.shoppingsite.item.visitor;

import com.shoppingsite.item.model.Book;
import com.shoppingsite.item.model.CD;
import com.shoppingsite.item.model.Cosmetics;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 4:06 PM
 * visitor class which calls different methods depending on type of item.
 */
public class GoodsLabellingVisitor implements ItemVisitor {

  @Override public void visit(final CD cd) {
     markWithCatalogNumber(cd);
  }

  @Override public void visit(final Book book) {
    markWithISBNNumber(book);
  }

  private void markWithISBNNumber(final Book book) {
    System.out.println(" ISBN number for : "+book.getDescription());
  }

  @Override public void visit(final Cosmetics cosmetics) {
    markWithColorNumber(cosmetics);
  }

  private void markWithColorNumber(final Cosmetics cosmetics) {
    System.out.println(" Color number for : "+cosmetics.getDescription());
  }

  private void markWithCatalogNumber(final CD cd) {
    System.out.println(" Catalog number for : "+cd.getDescription());
  }
}
