package com;

import static com.PatternsName.ABSTRACT_FACTORY;
import static com.PatternsName.ADAPTER;
import static com.PatternsName.BRIDGE;
import static com.PatternsName.BUILDER;
import static com.PatternsName.CHAIN_OF_RESPONSIBILITY;
import static com.PatternsName.COMMAND;
import static com.PatternsName.COMPOSITE;
import static com.PatternsName.DECORATOR;
import static com.PatternsName.FACADE;
import static com.PatternsName.FACTORY;
import static com.PatternsName.FLYWEIGHT;
import static com.PatternsName.ITERATOR;
import static com.PatternsName.MEDIATOR;
import static com.PatternsName.MEMENTO;
import static com.PatternsName.OBSERVER;
import static com.PatternsName.PROTOTYPE;
import static com.PatternsName.PROXY;
import static com.PatternsName.SINGLETON;
import static com.PatternsName.STATE;
import static com.PatternsName.STRATEGY;
import static com.PatternsName.TEMPLATE;
import static com.PatternsName.VISITOR;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : jignesh.sheth Date: 11/29/12 Time: 4:48 PM
 */
public enum PatternsType {

  CREATIONAL(SINGLETON, FACTORY, ABSTRACT_FACTORY, BUILDER, PROTOTYPE),
  BEHAVIORAL(ADAPTER, COMPOSITE, PROXY, FLYWEIGHT, FACADE, BRIDGE, DECORATOR),
  STRUCTURAL(TEMPLATE, MEDIATOR, CHAIN_OF_RESPONSIBILITY, OBSERVER, STRATEGY, COMMAND, STATE,
             VISITOR, ITERATOR, MEMENTO);

  List<PatternsName> patternsNameList = new ArrayList<PatternsName>();

  private PatternsType(final PatternsName... patternsName) {
    for (PatternsName name : patternsName) {
      this.patternsNameList.add(name);
    }
  }

  public List<PatternsName> getPatternsNames() {
    return patternsNameList;
  }


}
