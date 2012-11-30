package com.shoppingsite.item.visitor;

import com.shoppingsite.item.model.Book;
import com.shoppingsite.item.model.CD;
import com.shoppingsite.item.model.Cosmetics;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 4:04 PM
 */
public interface ItemVisitor {

  public void visit(CD cd);

  public void visit(Book book);

  public void visit(Cosmetics cosmetics);

}
