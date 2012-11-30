package com.designpatterns.factory.shape;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:32 AM
 */
public class SimpleShapeFactory extends ShapeFactory {
  @Override public Shape getShape(final ShapeType shapeType) {
    Shape shape;

    switch (shapeType) {
      case CIRCLE:
        shape = new Circle();
        break;
      case SQUARE:
        shape = new Square();
        break;
      case HEXAGON:
      default:
        throw new IllegalArgumentException(" Unknown shape type ::");
    }
    return shape;
  }
}
