package com.designpatterns.delegation;

/**
 * @author : jignesh.sheth Date: 11/23/12 Time: 11:43 AM
 */
public class Passenger implements Person {


  @Override public void flying() {
    System.out.println(" Passenger :: passenger is flying ....");
  }

  @Override public void driving() {
    System.out.println(" Passenger can't drive plane");
  }

}
