package com.shoppingsite.item.strategy;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 3:42 PM
 *         <p/>
 *         This is an adapter class which provides default implementations to be extended not to be
 *         used and facilitates its subclasses to be adapted to each other. Throws an unchecked
 *         exceptoins to indidacate improper use.
 */
public class CheckStrategyAdapter implements CheckStrategy {
  /**
   * @param word
   * @return
   */
  @Override public boolean check(final String word) {
    throw new RuntimeException(
        "Improper use of CheckStrategyAdapter class method check(String word)");
  }

  /**
   *
   */
  @Override public void reset() {
    throw new RuntimeException("Improper use of CheckStrategyAdapter class method reset()");

  }

  /**
   *
   * @return
   */
  @Override public int getCount() {
    throw new RuntimeException("Improper use of CheckStrategyAdapter class method getCount()");
  }
}
