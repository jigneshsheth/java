package com.shoppingsite.item.strategy;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 2:55 PM
 *
 * Strategy : Description should not be longer than 15 character.
 *
 */
public class LongerThan15 extends CheckStrategyAdapter {

  private static final int LENGTH = 15;

  @Override public boolean check(final String word) {
    return word !=null && word.length()> LENGTH;
  }
}
