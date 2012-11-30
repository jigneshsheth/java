package com.designpatterns.inheritance.implementation;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:02 PM
 *         <p/>
 *         Class inheritance / aka implementation inheritance
 *         <p/>
 *         Example : Let’s assume that savings account and term deposit account have a similar
 *         behavior in terms of depositing and withdrawing money, so we will get the super class to
 *         implement his behavior and get the subclasses to reuse this behavior. But saving account
 *         and term deposit account have specific behavior in calculating the interest.
 */
public abstract class Account {

  public void deposit(double amount) {
    System.out.println("Depositing : " + amount);
  }

  public void withdraw(double amount) {
    System.out.println(" Withdraw : " +amount);
  }

  public abstract double calculateInterest(double amount);
}
