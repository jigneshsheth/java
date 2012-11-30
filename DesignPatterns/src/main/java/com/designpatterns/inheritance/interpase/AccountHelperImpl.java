package com.designpatterns.inheritance.interpase;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:35 PM
 */
public class AccountHelperImpl implements AccountHelper {

  @Override public void deposit(final double amount) {
    System.out.println(" Depositing : " + amount);
  }

  @Override public void withdraw(final double amount) {
    System.out.println(" Withdrawing : " + amount);
  }
}
