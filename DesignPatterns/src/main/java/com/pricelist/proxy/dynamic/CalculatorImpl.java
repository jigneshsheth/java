package com.pricelist.proxy.dynamic;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:56 PM
 */
public class CalculatorImpl implements Calculator {
  @Override public int add(final int i1, final int i2) {
    final int sum = i1 + i2;
    System.out.println(" Sum is : "+sum);
    return sum;
  }
}
