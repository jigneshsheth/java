package com.designpatterns.singleton;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:17 AM
 *
 * Use : Single point of access.
 * -Only single instance is required in memory.
 * - ex. reading property files in application.
 * - In-memory : object cache, object pool.
 * - Non- memory : Socket connection.
 */
public class OnlyOne {
  private static OnlyOne instance= new OnlyOne();

//  private constructor. This class cannot be instantiated from outside and prevent sub-classing.
  private OnlyOne(){

  }

  public static OnlyOne getInstance(){
    return instance;
  }
}
