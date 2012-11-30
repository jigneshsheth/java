package com.designpatterns.factory.shape;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:44 AM
 */
public class ComplexShapeFactoryImpl extends ShapeFactory {
  @Override public Shape getShape(final ShapeType shapeType) {
    Shape shape;
    switch (shapeType) {
      case HEXAGON:
        shape = new Hexagon();
        break;
      default:
        throw new IllegalArgumentException(" Unknown or Not Supported Shape type..."+shapeType);
    }
    return shape;
  }
}
