package com.shoppingsite.item.strategy;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 2:53 PM Strategy is not databased , it is algorithm
 *         based.
 */
public interface CheckStrategy {
  boolean check(String word);

  void reset();

  int getCount();
}
