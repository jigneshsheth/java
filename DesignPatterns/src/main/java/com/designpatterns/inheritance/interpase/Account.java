package com.designpatterns.inheritance.interpase;

/**
 * @author : jignesh.sheth Date: 11/21/12 Time: 2:34 PM
 */
public interface Account {

  double calculateInterest(double amount);

  void deposit(double amount);

  void withdraw(double amount);
}
