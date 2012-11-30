package com.designpatterns.delegation;

/**
 * @author : jignesh.sheth Date: 11/23/12 Time: 1:23 PM
 */
public class Main {
  public static void main(String[] args)  {
    PersonImpl person =new PersonImpl();
    person.driving();
    person.flying();

    person.toPassenger();
    person.flying();
    person.driving();


    person.toPilot();
    person.flying();
    person.driving();
  }
}
