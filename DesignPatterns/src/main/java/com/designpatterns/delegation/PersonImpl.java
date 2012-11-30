package com.designpatterns.delegation;

import java.lang.reflect.Proxy;

/**
 * @author : jignesh.sheth Date: 11/23/12 Time: 11:49 AM
 */
public class PersonImpl implements Person {

  Person person = new Pilot();



  @Override public void flying() {
    person.flying();
  }

  @Override public void driving() {
    person.driving();
  }

  public void toPilot(){
    person = new Pilot();
  }

  public void toPassenger(){
    person = new Passenger();
  }

}
