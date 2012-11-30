package com.designpatterns.factory.shape;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 10:36 AM
 */
public class FactoryTest {
  public static void main(String... args) {
    ShapeFactory shapeFactory= new SimpleShapeFactory();
    Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
    shape.draw();

    shape = shapeFactory.getShape(ShapeType.SQUARE);
    shape.draw();

  }
}
