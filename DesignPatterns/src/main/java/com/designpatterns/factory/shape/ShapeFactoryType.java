package com.designpatterns.factory.shape;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:48 AM
 */
public class ShapeFactoryType {
  enum FactoryType {SIMPLE, COMPLEX}

  public ShapeFactory getShapeFactory(FactoryType factoryType) {
    ShapeFactory shapeFactory;
    switch (factoryType) {
      case SIMPLE:
        shapeFactory = new SimpleShapeFactory();
        break;
      case COMPLEX:
        shapeFactory = new ComplexShapeFactoryImpl();
        break;
      default:
        throw new IllegalArgumentException(" Unknown Shape Factory type...");
    }
    return shapeFactory;
  }
}
