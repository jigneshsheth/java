package com.pricelist.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : jignesh.sheth Date: 11/26/12 Time: 5:52 PM
 */
public class LoggingHandler implements InvocationHandler {

  protected Object actual;

  public LoggingHandler(Object actual) {
    this.actual = actual;
  }

  @Override
  public Object invoke(final Object proxy, final Method method, final Object[] args)
      throws Throwable {


    try {
      System.out.println(" >>>> >>>  Start executing method: "+method.getName());
      return method.invoke(actual,args);
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally {
      System.out.println(" <<<< <<<  Finished executing method: "+method.getName());
    }
  }
}
