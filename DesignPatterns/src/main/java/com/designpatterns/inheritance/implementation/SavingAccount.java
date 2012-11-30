package com.designpatterns.inheritance.implementation;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:18 PM
 */
public class SavingAccount extends Account {

  private static final double INTEREST = 0.03;

  @Override public double calculateInterest(final double amount) {
    //    calculate interest for SavingAccount.
    return amount * INTEREST;
  }

  @Override public void deposit(final double amount) {
    super.deposit(amount);
  }

  @Override public void withdraw(final double amount) {
    super.withdraw(amount);
  }
}
