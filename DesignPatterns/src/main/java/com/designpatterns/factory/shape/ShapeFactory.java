package com.designpatterns.factory.shape;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:31 AM
 */
public abstract class ShapeFactory {
  public abstract Shape getShape(ShapeType shapeType);
}
