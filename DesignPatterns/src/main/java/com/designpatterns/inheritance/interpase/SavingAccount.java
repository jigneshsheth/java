package com.designpatterns.inheritance.interpase;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 3:15 PM
 */
public class SavingAccount implements Account {
  AccountHelper accountHelper = new AccountHelperImpl();

  @Override public double calculateInterest(final double amount) {
    return amount * 0.03;
  }

  @Override public void deposit(final double amount) {
    accountHelper.deposit(amount);
  }

  @Override public void withdraw(final double amount) {
    accountHelper.withdraw(amount);
  }
}
