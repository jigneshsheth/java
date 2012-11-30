package com.shoppingsite.item.strategy;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 3:12 PM
 *         <p/>
 *         Decorating Stratergy object by enhancing counting functionality. Difference between Proxy
 *         and Decorate pattern: -- Decorator: enhance functionality of target Object. -- Proxy:
 *         control access of target Object.
 */
public class CountDecorator extends CheckStrategyAdapter {
  private CheckStrategy checkStrategy = null;
  private int count = 0;

  public CountDecorator(final CheckStrategy checkStrategy) {
    this.checkStrategy = checkStrategy;
  }

  @Override public boolean check(final String word) {
    boolean isFound = checkStrategy.check(word);
    if (isFound) {
      count++;
    }
    return isFound;
  }

  /**
   * @return counts
   */
  @Override
  public int getCount() {
    return count;
  }

  /**
   *  reset counter.
   */
  @Override
  public void reset() {
    count = 0;
  }
}
