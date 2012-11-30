package com.pricelist.proxy.dynamic;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 6:03 PM
 */
public class TestDynamicProxy {

  public static final boolean WITH_LOGGING = true;

  public static void main(String... args) {
    System.out.println(" ====================== Without Dynamic Proxy ===========================");

    Calculator calculator = CalculatorFactory.getInstance().getCalculator(!WITH_LOGGING);
    calculator.add(3, 2);

    System.out.println(" ====================== With Dynamic Proxy ===========================");

    calculator = CalculatorFactory.getInstance().getCalculator(WITH_LOGGING);
    calculator.add(3, 2);

  }
}
