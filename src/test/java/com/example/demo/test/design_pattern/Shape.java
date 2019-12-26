package com.example.demo.test.design_pattern;

/**
 * Shape : 工厂模式
 *
 * @author : Trevor.yang
 * since: 2019/12/26 21:06
 */
public interface Shape {
    void draw();
}
class Rectange implements Shape {
    @Override
    public void draw() {
        System.out.println("长方形");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
//工厂
class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equals("圆形")) {
            return new Circle();
        } else if (type.equals("长方形")) {
            return new Rectange();
        } else if (type.equals("正方形")) {
            return new Square();
        }
        return null;
    }
}
class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("圆形");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("正方形");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("长方形");
        shape3.draw();
    }
}