package com.shoppingsite.item.strategy;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 2:56 PM
 *
 * Strategy : description is start with "cd" .
 */
public class StartsWithCD extends CheckStrategyAdapter {

  private static final String STARTS_WITH_CD = "cd";

  @Override public boolean check(final String word) {

    return word !=null && word.toLowerCase().startsWith(STARTS_WITH_CD);
  }
}
