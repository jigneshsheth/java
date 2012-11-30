package com.designpatterns.inheritance.implementation;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:23 PM
 */
public class Test {
  public static void main(String[] args) {
    Account savingAccount = new SavingAccount();
    savingAccount.deposit(50.0);

    Account termDepositAccount = new TermDepositAccount();
    termDepositAccount.deposit(25.0);

    savingAccount.withdraw(25);
    termDepositAccount.withdraw(10);

    double savingInterest = savingAccount.calculateInterest(100.0);
    double termDepositInterest = termDepositAccount.calculateInterest(100.0);

    System.out.println(" Saving Interest : "+savingInterest);
    System.out.println(" Term Deposit Interest : "+termDepositInterest);

  }
}
