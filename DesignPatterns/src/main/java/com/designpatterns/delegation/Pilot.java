package com.designpatterns.delegation;

/**
 * @author : jignesh.sheth Date: 11/23/12 Time: 11:42 AM
 */
public class Pilot implements Person {
  @Override public void flying() {
    System.out.println(" Pilot ::  is flying as passenger ");

  }

  @Override public void driving() {
    System.out.println(" Pilot ::  is driving plane ....--------> > >> > ");
  }


}
