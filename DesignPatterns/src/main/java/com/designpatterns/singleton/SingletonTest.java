package com.designpatterns.singleton;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:22 AM
 */
public class SingletonTest {
  public static void main(String... args) {
    OnlyOne one=OnlyOne.getInstance();
    System.out.println(" Memory location for Obj 1 :  "+one);
    OnlyOne second=OnlyOne.getInstance();
    System.out.println(" Memory location for Obj 1 :  "+second);

  }
}
