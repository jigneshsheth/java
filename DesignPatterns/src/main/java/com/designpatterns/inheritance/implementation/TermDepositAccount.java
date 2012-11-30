package com.designpatterns.inheritance.implementation;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:20 PM
 */
public class TermDepositAccount extends Account {

  private static final double INTEREST = 0.05;

  @Override public double calculateInterest(final double amount) {
    return amount * INTEREST;
  }

  @Override public void deposit(final double amount) {
    super.deposit(amount);
  }

  @Override public void withdraw(final double amount) {
    super.withdraw(amount);
  }
}
