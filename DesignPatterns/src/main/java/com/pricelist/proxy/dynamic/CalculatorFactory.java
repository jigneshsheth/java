package com.pricelist.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:57 PM Singleton Factory.
 */
public class CalculatorFactory {
  private static CalculatorFactory instance = null;

  private CalculatorFactory() {
  }

  public static CalculatorFactory getInstance() {
    if (instance == null) {
      instance = new CalculatorFactory();
    }
    return instance;
  }

  public Calculator getCalculator(boolean withLogging) {
    Calculator calculator = new CalculatorImpl();

    //    use dynamic proxy if logging is required, which logs your method calls.
    if (withLogging) {
      //      invoke the handler, which logs and invokes the target method on the Calculator.
      InvocationHandler handler = new LoggingHandler(calculator);

      //      create proxy
      calculator = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(),
                                                       calculator.getClass().getInterfaces(),
                                                       handler);
    }
    return calculator;
  }

}
