package com.designpatterns.factory.shape;

import static com.designpatterns.factory.shape.ShapeFactoryType.*;

/**
 * @author : jignesh.sheth Date: 11/27/12 Time: 11:10 AM
 */
public class AbstractFactoryTest {
  public static void main(String... args) {
    ShapeFactoryType shapeFactoryType = new ShapeFactoryType();
    ShapeFactory shapeFactory = shapeFactoryType.getShapeFactory(FactoryType.COMPLEX);
    Shape shape = shapeFactory.getShape(ShapeType.HEXAGON);
    shape.draw();
    shapeFactory = shapeFactoryType.getShapeFactory(FactoryType.SIMPLE);
    shape = shapeFactory.getShape(ShapeType.CIRCLE);
    shape.draw();

  }
}
